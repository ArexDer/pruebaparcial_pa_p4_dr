package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {
	
	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);

	public Paciente seleccionarPorId(Integer id);

}
