package de.schoener.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import de.schoener.spring.domain.NumbersCollector;
import de.schoener.spring.rest.controller.api.HelloWorldController;

@Controller
public class HelloWorldControllerImpl implements HelloWorldController {

	@Autowired
	private NumbersCollector numbersCollector;

	@Override
	public String getNumber(@PathVariable String testNumber) {
		return numbersCollector.getNumber(testNumber);
	}

	@Override
	public ResponseEntity<String> addNumber(@RequestBody String number) {
		HttpStatus status = null;

		if (number != null) {
			numbersCollector.addNumber(number);
			status = HttpStatus.CREATED;
		} else {
			status = HttpStatus.FORBIDDEN;
		}

		return ResponseEntity.status(status).build();
	}

	@Override
	public List<String> getNumbers() {
		return numbersCollector.getNumbers();
	}

}
