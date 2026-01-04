package com.matheus.visu.model.entity;

import com.matheus.visu.model.enums.StatusAgendamento;
import java.time.LocalDateTime;
import java.util.UUID;

public class Agendamento
{
    private UUID id;
    private LocalDateTime dataHora;
    private StatusAgendamento status;

    public void marcarComoAgendado(LocalDateTime dataHora)
    {
        validarAgendamento(dataHora);
        this.dataHora = dataHora;
        this.status = StatusAgendamento.AGENDADO;
    }

    private void validarAgendamento(LocalDateTime dataHora)
    {
        if (dataHora == null)
        { throw new IllegalArgumentException("Data e hora do agendamento são obrigatórias"); }

        if (dataHora.isBefore(LocalDateTime.now()))
        { throw new IllegalArgumentException("Não é possível agendar para uma data passada."); }

        if (this.status != null)
        { throw new IllegalArgumentException("Agendamento já possui um status definido."); }
    }

    public void confirmarAgendamento(StatusAgendamento status)
    {
        validarConfirmacao(status);
    }

    private void validarConfimacao(StatusAgendamento status)
    {
        if ()
    }

}
