package de.schoener.spring.domain;

import java.util.Collection;
import java.util.Optional;

public interface SpringNumberRepository {

	Optional<SpringNumber> getNumber(Long number);

	Collection<SpringNumber> findNumbers();

	void addSpringNumber(SpringNumber number);
}
