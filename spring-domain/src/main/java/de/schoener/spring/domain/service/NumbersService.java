package de.schoener.spring.domain.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.domain.SpringNumberRepository;

@Component
public class NumbersService {

	@Autowired
	private SpringNumberRepository springNumberRepository;

	public void addNumber(String number) {
		springNumberRepository.addSpringNumber(new SpringNumber(number));
	}

	public Collection<SpringNumber> getNumbers() {
		return springNumberRepository.findNumbers();
	}

	public Optional<SpringNumber> getNumber(String number) {
		return springNumberRepository.getNumber(Long.valueOf(number));
	}
}
