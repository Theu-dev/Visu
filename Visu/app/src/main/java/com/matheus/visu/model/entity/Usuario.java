package com.matheus.visu.model.entity;
import java.util.Date;
import java.util.UUID;
public class Usuario
{
    private UUID id;
    private String name;
    private String email;
    private String telefone;
    private String senha;
    private Date dataHora;

    public UUID getId()
    { return id; }

    public void setId(UUID id)
    { this.id = id; }

    public String getName()
    { return name; }

    public void setName(String name)
    { this.name = name; }

    public String getEmail()
    { return email; }

    public void setEmail(String email)
    { this.email = email; }

    public String getTelefone()
    { return telefone; }

    public void setTelefone(String telefone)
    { this.telefone = telefone; }

    public String getSenha()
    { return senha; }

    public void setSenha(String senha)
    { this.senha = senha; }

    public Date getDataHora()
    { return dataHora; }

    public void setDataHora(Date dataHora)
    { this.dataHora = dataHora; }
}
