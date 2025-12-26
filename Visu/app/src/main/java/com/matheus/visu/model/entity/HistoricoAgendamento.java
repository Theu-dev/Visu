package com.matheus.visu.model.entity;
import java.util.Date;
import java.util.UUID;
public class HistoricoAgendamento
{
    private UUID id;
    private Date date;
    private String descricao;

    public UUID getId()
    { return id; }

    public void setId(UUID id)
    { this.id = id; }

    public Date getDate()
    { return date; }

    public void setDate(Date date)
    { this.date = date; }

    public String getDescricao()
    { return descricao; }

    public void setDescricao(String descricao)
    { this.descricao = descricao; }
}
