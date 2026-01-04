package com.matheus.visu.model.entity;

import java.math.BigDecimal;

public class Service
{
    private String name;
    private String description;
    private BigDecimal price;
    private int durationInMinutes;
    private boolean active;

    public Service(String name, String description, BigDecimal price, int durationInMinutes)
    {
        validateCreation(name, description, price, durationInMinutes);

        this.name = name;
        this.description = description;
        this.price = price;
        this.durationInMinutes = durationInMinutes;
        this.active = true;
    }

    private void validateCreation(String name, String description, BigDecimal price, int durationInMinutes)
    {
        if (name == null || name.isBlank())
        { throw new IllegalArgumentException("Service name must not be empty."); }

        if (description == null || description.isBlank())
        { throw new IllegalArgumentException("Service description must not be empty."); }

        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0)
        { throw new IllegalArgumentException("Service price must be greater than zero."); }

        if (durationInMinutes <= 0)
        { throw new IllegalArgumentException("Service duration must be greater than zero."); }
    }

    public void deactivate()
    { this.active = false; }

    public String getName()
    { return name; }

    public String getDescription()
    { return description; }

    public BigDecimal getPrice()
    { return price; }

    public int getDurationInMinutes()
    { return durationInMinutes; }

    public boolean isActive()
    { return active; }
}