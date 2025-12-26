package com.matheus.visu.model.entity;
import android.service.controls.actions.BooleanAction;

import java.util.UUID;
public class Salao
{
    private UUID id;
    private String name;
    private String endereco;
    private String telefone;
    private String descricao;
    private boolean ativo;

    public UUID getId()
    { return id; }

    public void setId(UUID id)
    { this.id = id; }

    public String getName()
    { return name; }

    public void setName(String name)
    { this.name = name; }

    public String getEndereco()
    { return endereco; }

    public void setEndereco(String endereco)
    { this.endereco = endereco; }

    public String getTelefone()
    { return telefone; }

    public void setTelefone(String telefone)
    { this.telefone = telefone; }

    public String getDescricao()
    { return descricao; }

    public void setDescricao(String descricao)
    { this.descricao = descricao; }

    public boolean isAtivo()
    { return ativo; }

    public void setAtivo(boolean ativo)
    { this.ativo = ativo; }
}
