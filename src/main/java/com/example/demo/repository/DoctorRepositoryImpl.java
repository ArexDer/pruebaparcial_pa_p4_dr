package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl  implements DoctorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Doctor doctor = this.seleccionarPorId(id);
		this.entityManager.remove(doctor);
		
	}

	@Override
	public Doctor seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public Doctor buscarPorCedula(String Cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery( "Doctor.buscarporCedula", Doctor.class);
		myQuery.setParameter("datoCedula", Cedula);
		return (Doctor)myQuery.getSingleResult();
	}

}
