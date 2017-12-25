package de.schoener.spring.domain.service;

import java.util.Collection;
import java.util.Optional;

import de.schoener.spring.domain.SpringNumber;

public interface NumbersService {

	void addNumber(String number);

	Collection<SpringNumber> findNumbers();

	Optional<SpringNumber> getNumber(String number);
}
