package de.schoener.spring.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.integration.SpringNumberDAO;

@Component
public class NumbersService {

	@Autowired
	private SpringNumberDAO springNumberDAO;

	private List<SpringNumber> numbers = new ArrayList<SpringNumber>();

	public void addNumber(String number) {
		numbers.add(new SpringNumber(number));
	}

	public List<SpringNumber> getNumbers() {
		return numbers;
	}

	public Optional<SpringNumber> getNumber(String number) {
		SpringNumber springNumberToSearch = new SpringNumber(number);
		// Optional<SpringNumber> findFirst = numbers.stream()
		// .filter(n -> n.equals(springNumberToSearch)).findFirst();

		return springNumberDAO.getNumber(springNumberToSearch.intValue());
	}
}
