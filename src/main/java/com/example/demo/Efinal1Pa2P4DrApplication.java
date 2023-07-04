package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4DrApplication implements CommandLineRunner {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private CitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4DrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//main
		//1.- INSERTAR  UN DOCTOR
		Doctor dr = new Doctor();
		dr.setCedula("123");
		dr.setNombre("Diego");
		dr.setApellido("Rivas");
		dr.setFechaNacimiento(LocalDate.of(1997, 01, 8));
		dr.setNumeroConsultorio("1");
		dr.setCodigoSenescyt("001");
		dr.setGenero("M");
		this.doctorService.insertar(dr);
		
	
		//2.- INGRESAR UN PACIENTE
		Paciente paci = new Paciente ();
		paci.setCedula("666");
		paci.setNombre("Fatima");
		paci.setApellido("Flores");
		paci.setFechaNacimiento(LocalDate.of(2000, 03, 16));
		paci.setCodigoSeguro("333");
		paci.setEstatura("1.68");
		paci.setPeso("55"); //KG
		paci.setGenero("F");
		this.pacienteService.insertar(paci);
	
		//3.- AGENDAR CITA
		//CitaMedica cm = new CitaMedica(); //NO, debo hacer un metodo
		this.citaMedicaService.agendamiento("2", LocalDate.now(), new BigDecimal(22), "Hospital Sur", dr.getCedula(), paci.getCedula());
		
		
		//4.- ACTUALIZAR CITA MEDICA
		this.citaMedicaService.actualizarCitaMedica("2", "Gripe", "Pacetamol", LocalDate.of(2023, 9, 10));
		
		
		
	}

}
