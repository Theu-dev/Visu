package com.matheus.visu.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Establishment
{
    private UUID id;
    private String name;
    private String document;
    private String address;

    private List<Service> services;
    private List<Professional> professionals;

    private boolean active;

    public Establishment(String name, String document, String address)
    {
        validateCreation(name, document, address);

        this.id = UUID.randomUUID();
        this.name = name;
        this.document = document;
        this.address = address;
        this.services = new ArrayList<>();
        this.professionals = new ArrayList<>();
        this.active = true;
    }

    private void validateCreation(String name, String document, String address)
    {
        if (name == null || name.isBlank())
        { throw new IllegalArgumentException("Establishment name must not be empty."); }

        if (document == null || document.isBlank())
        { throw new IllegalArgumentException("Establishment document must not be empty."); }

        if (address == null || address.isBlank())
        { throw new IllegalArgumentException("Establishment address must not be empty."); }
    }

    public void addService(Service service)
    {
        if (service == null)
        { throw new IllegalArgumentException("Service cannot be null."); }

        services.add(service);
    }

    public void addProfessional(Professional professional)
    {
        if (professional == null)
        { throw new IllegalArgumentException("Professional cannot be null."); }

        professionals.add(professional);
    }

    public void deactivate()
    { this.active = false; }

    public UUID getId()
    { return id; }

    public String getName()
    { return name; }

    public String getDocument()
    { return document; }

    public String getAddress()
    { return address; }

    public List<Service> getServices()
    { return List.copyOf(services); }

    public List<Professional> getProfessionals()
    { return List.copyOf(professionals); }

    public boolean isActive()
    { return active; }
}
