package de.schoener.spring.integration.repository.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.domain.SpringNumberRepository;
import de.schoener.spring.integration.dao.SpringNumberDAO;
import de.schoener.spring.integration.entities.SpringNumberEntity;

@Repository
public class SpringNumberRepositoryImpl implements SpringNumberRepository {

	@Autowired
	@Qualifier("jpaSpringNumberDAO")
	private SpringNumberDAO<SpringNumberEntity> springNumberDAO;

	@Override
	public Optional<SpringNumber> getNumber(int number) {
		Optional<SpringNumberEntity> springNumberFound = springNumberDAO.getNumber(number);
		if (!springNumberFound.isPresent()) {
			return Optional.empty();
		}

		return Optional.of(new SpringNumber(springNumberFound.get().getSpringNumber()));
	}

	@Override
	public Collection<SpringNumber> findNumbers() {
		Collection<SpringNumberEntity> numbers = springNumberDAO.findNumbers();
		List<SpringNumber> springNumbers = numbers.stream().map(entity -> new SpringNumber(entity.getSpringNumber()))
				.collect(Collectors.toList());
		return springNumbers;
	}

	@Override
	public void addSpringNumber(SpringNumber number) {
		Optional<SpringNumberEntity> springNumberFound = springNumberDAO.getNumber(number.longValue());
		if (!springNumberFound.isPresent()) {
			SpringNumberEntity entity = new SpringNumberEntity();
			entity.setSpringNumber(number.longValue());
			springNumberDAO.save(entity);
		}
	}

}
