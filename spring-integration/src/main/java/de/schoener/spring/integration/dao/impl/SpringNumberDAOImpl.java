package de.schoener.spring.integration.dao.impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.schoener.spring.integration.dao.SpringNumberDAO;
import de.schoener.spring.integration.entities.SpringNumberEntity;

@Repository
public class SpringNumberDAOImpl implements SpringNumberDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Optional<SpringNumberEntity> getNumber(int number) {
		return Optional.empty();
	}

}
