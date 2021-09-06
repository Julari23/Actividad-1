package com.empresa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return repository.save(medicamento);
	}

}
