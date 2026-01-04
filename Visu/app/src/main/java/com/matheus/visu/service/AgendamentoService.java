package com.matheus.visu.service;

import com.matheus.visu.model.entity.Agendamento;

public class AgendamentoService
{
    public Agendamento criarAgendamento(Agendamento agendamento)
    {
        if (agendamento == null)
        { return null; }

        if (!pagamentoConfirmado(agendamento))
        { return agendamento; }

        agendamento.marcarComoAgendado();

        return agendamento;
    }

    private boolean pagamentoConfirmado(Agendamento agendamento)
    { return agendamento.isPagamentoConfirmado(); }
}