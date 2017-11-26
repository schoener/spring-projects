package de.schoener.spring.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NumbersCollector {

	private List<String> numbers = new ArrayList<String>();

	public void addNumber(String number) {
		numbers.add(number);
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public String getNumber(String number) {
		return "got : " + number;

	}
}
