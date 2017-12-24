package de.schoener.spring.integration.dao;

import java.util.Collection;
import java.util.Optional;

import de.schoener.spring.integration.entities.SpringNumberEntity;

public interface SpringNumberDAO {

	Optional<SpringNumberEntity> getNumber(int number);

	Collection<SpringNumberEntity> getNumebrs();

	void addNumber(int number);

}
