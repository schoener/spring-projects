package de.schoener.spring.integration.dao;

import java.util.Optional;

import de.schoener.spring.integration.entities.SpringNumberEntity;

public interface SpringNumberDAO {

	public Optional<SpringNumberEntity> getNumber(int number);
}
