package com.matheus.visu.model.entity;
import com.matheus.visu.model.enums.StatusAgendamento;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;
public class Agendamento
{
    private UUID id;
    private Date data;
    private Time horaInicio;
    private Time horaFim;
    private StatusAgendamento status;
    private Date criadoEM;

    public UUID getId()
    {  return id;  }

    public void setId(UUID id)
    { this.id = id; }

    public Date getData()
    { return data; }

    public void setData(Date data)
    { this.data = data; }

    public Time getHoraInicio()
    { return horaInicio; }

    public void setHoraInicio(Time horaInicio)
    { this.horaInicio = horaInicio; }

    public Time getHoraFim()
    { return horaFim; }

    public void setHoraFim(Time horaFim)
    { this.horaFim = horaFim; }

    public Date getCriadoEM()
    { return criadoEM; }

    public void setCriadoEM(Date criadoEM)
    { this.criadoEM = criadoEM; }
}
