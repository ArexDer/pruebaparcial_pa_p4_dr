package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {
	
	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

	public Doctor seleccionarPorId(Integer id);

}
