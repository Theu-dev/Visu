package com.matheus.visu.model.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class User
{
    private UUID id;
    private String name;
    private String email;
    private String passwordHash;
    private LocalDateTime createdIn;
    private LocalDateTime disabledIn;
    private boolean active;

    public User(String name, String email, String passwordHash)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdIn = LocalDateTime.now();
    }

    public void disableUser()
    {
        if (!this.active)
        { return; }

        this.active = false;
        this.disabledIn = LocalDateTime.now();
    }

    public void activeUser()
    {
        if (!this.active)
        { return; }

        this.active = true;
        this.disabledIn = null;
    }

    public boolean canAcessSystem()
    { return this.active; }

    public boolean passwordcheck(String passwordProvided)
    { return this.passwordHash.equals(passwordProvided); }

    public UUID getId()
    { return id; }

    public String getName()
    { return name; }

    public String getEmail()
    { return email; }

    public boolean isActive()
    { return active; }
}
