package com.matheus.visu.model.entity;

public class Client extends User
{
    private String telephone;
    private String document;

    public Client(String name, String email, String passwordHash, String telephone, String document)
    {
        super(name, email, passwordHash);
        validateDataClient(telephone, document);
        this.telephone = telephone;
        this.document = document;
    }

    private void validateDataClient(String telephone, String document)
    {
        if (telephone == null && document == null || (telephone.isBlank() && document.isBlank()))

        if (telephone.length() < 11 && document.length() < 11 || telephone.isBlank() && document.isBlank())
        { throw new IllegalArgumentException("The phone field must have at least 11 characters."); }
    }

    public String getTelephone()
    { return telephone; }

    public String getDocument()
    { return document; }
}
