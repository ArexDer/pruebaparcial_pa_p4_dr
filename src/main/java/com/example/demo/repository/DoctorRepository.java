package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

public interface DoctorRepository {
	
	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

	public Doctor seleccionarPorId(Integer id);
	
	public Doctor buscarPorCedula(String Cedula);

}
