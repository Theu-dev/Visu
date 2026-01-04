package com.matheus.visu.model.entity;

public class Profissional
{
    private String especialidade;
    private String bio;
    private boolean ativo;

    public String getEspecialidade()
    { return especialidade; }

    public void setEspecialidade(String especialidade)
    { this.especialidade = especialidade; }

    public String getBio()
    { return bio; }

    public void setBio(String bio)
    { this.bio = bio; }

    public boolean isAtivo()
    { return ativo; }

    public void setAtivo(boolean ativo)
    { this.ativo = ativo; }
}
