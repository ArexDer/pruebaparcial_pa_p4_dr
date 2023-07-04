package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
		
	}

	@Override
	public Paciente seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.seleccionarPorId(id);
	}

}
