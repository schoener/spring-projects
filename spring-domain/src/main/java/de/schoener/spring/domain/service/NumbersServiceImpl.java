package de.schoener.spring.domain.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.domain.SpringNumberRepository;

@Component
public class NumbersServiceImpl implements NumbersService {

	@Autowired
	private SpringNumberRepository springNumberRepository;

	@Override
	public void addNumber(String number) {
		springNumberRepository.addSpringNumber(new SpringNumber(number));
	}

	@Override
	public Collection<SpringNumber> findNumbers() {
		return springNumberRepository.findNumbers();
	}

	@Override
	public Optional<SpringNumber> getNumber(String number) {
		return springNumberRepository.getNumber(Long.valueOf(number));
	}
}
