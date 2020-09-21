package org.lanchonete.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.lanchonete.models.Categoria;
import org.springframework.stereotype.Component;

@Component
public class CategoriaDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(Categoria categoria) {
		entityManager.persist(categoria);
	}
	
	public List<Categoria> findAll(){
		return entityManager.createQuery("SELECT c from Categoria c").getResultList();
	}
}
