package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService {
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.insertar(citaMedica);
		
		
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(citaMedica);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.eliminar(id);
		
	}

	@Override
	public CitaMedica seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.seleccionarPorId(id);
	}

	@Override
	public void agendamiento(String numCita, LocalDate fechaCita, BigDecimal valor, String lugar, String idDoctor,
			String idPaciente) {
		// TODO Auto-generated method stub
		
		CitaMedica cmAux = new CitaMedica();
		cmAux.setNumeroCita(numCita);
		cmAux.setFechaCita(fechaCita);
		cmAux.setValorCita(valor);
		cmAux.setLugarCita(lugar);
		
        Doctor aux = this.doctorRepository.buscarPorCedula(idDoctor); //String cedula
		
		Paciente paAux = this.pacienteRepository.buscarPorCedula(idPaciente); //String cedula
		
		cmAux.setValorCita(valor);
		cmAux.setDoctor(aux);
		cmAux.setPaciente(paAux);
		 
	
		this.citaMedicaRepository.insertar(cmAux);;
	}

	@Override
	public void actualizarCitaMedica(String numCita, String diagnostico, String receta, LocalDate fechaproxi) {
		// TODO Auto-generated method stub
		CitaMedica aux = this.citaMedicaRepository.buscarporNumerodeCita(numCita);
		aux.setDiagnostico(diagnostico);
		aux.setReceta(receta);
		aux.setFechaProximaCita(fechaproxi);
		this.citaMedicaRepository.actualizar(aux);
		
	}

	

}
