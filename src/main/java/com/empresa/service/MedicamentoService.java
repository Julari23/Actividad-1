package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento insertaActualizaMedicamento(Medicamento medicamento);
}
