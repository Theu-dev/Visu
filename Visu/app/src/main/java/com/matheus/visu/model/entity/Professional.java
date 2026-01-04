package com.matheus.visu.model.entity;

public class Professional extends User
{
    private String registration;
    private String specialty;

    public Professional (String name, String email, String passwordHash, String registration, String specialty)
    {
        super(name, email, passwordHash);
        validateDataProfessional(registration, specialty);
        this.registration = registration;
        this.specialty = specialty;
    }

    private void validateDataProfessional(String registration, String specialty)
    {
        if (registration == null || registration.isBlank())
        { throw new IllegalArgumentException("The registration and specialty fields must not be empty."); }

        if (specialty == null || specialty.isBlank())
        { throw new IllegalArgumentException("The specialty field must not be empty."); }
    }

    public String getRegistration()
    { return registration; }

    public String getSpecialty()
    { return specialty; }

}