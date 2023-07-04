package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

public interface CitaMedicaService {
	
	public void insertar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica );

	public void eliminar(Integer id);

	public CitaMedica seleccionarPorId(Integer id);
	
	public void agendamiento(String numCita, LocalDate fechaCita, BigDecimal valor, String lugar, String idDoctor, String idPaciente);
	
	public void actualizarCitaMedica( String numCita,String diagnostico, String receta, LocalDate fechaproxi);

}
