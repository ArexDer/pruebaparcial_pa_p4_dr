package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = this.seleccionarPorId(id);
		this.entityManager.remove(citaMedica);
		
	}

	@Override
	public CitaMedica seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public CitaMedica buscarporNumerodeCita(String numeroCita) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("CitaMedica.buscaPorNumerodeCita", CitaMedica.class);
		myQuery.setParameter("datoNumeroCita", numeroCita);
		
		return (CitaMedica) myQuery.getSingleResult();
	}

}
