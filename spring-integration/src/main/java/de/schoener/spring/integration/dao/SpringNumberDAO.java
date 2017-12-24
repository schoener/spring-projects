package de.schoener.spring.integration.dao;

import java.util.Collection;
import java.util.Optional;

import de.schoener.spring.integration.entities.SpringNumberEntity;

public interface SpringNumberDAO<T> {

	Optional<T> getNumber(Long number);

	Collection<T> findNumbers();

	void save(SpringNumberEntity entity);

}
