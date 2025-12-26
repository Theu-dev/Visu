package com.matheus.visu.model.entity;
import java.util.UUID;
import java.math.BigDecimal;
public class Servico
{
    private UUID id;
    private String name;
    private String descricao;
    private Integer duracaoMinutos;
    private BigDecimal preco;
    private boolean ativo;

    public UUID getId()
    { return id; }

    public void setId(UUID id)
    { this.id = id; }

    public String getName()
    { return name; }

    public void setName(String name)
    { this.name = name; }

    public String getDescricao()
    { return descricao; }

    public void setDescricao(String descricao)
    { this.descricao = descricao; }

    public Integer getDuracaoMinutos()
    { return duracaoMinutos; }

    public void setDuracaoMinutos(Integer duracaoMinutos)
    { this.duracaoMinutos = duracaoMinutos; }

    public BigDecimal getPreco()
    { return preco; }

    public void setPreco(BigDecimal preco)
    { this.preco = preco; }

    public boolean isAtivo()
    { return ativo; }

    public void setAtivo(boolean ativo)
    { this.ativo = ativo; }
}
