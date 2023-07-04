package com.example.demo.repository;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaRepository {
	
	public void insertar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica );

	public void eliminar(Integer id);

	public CitaMedica seleccionarPorId(Integer id);
	
	public CitaMedica buscarporNumerodeCita(String numeroCita);

}
