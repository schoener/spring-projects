package de.schoener.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import de.schoener.spring.rest.controller.api.HelloWorldController;

@Controller
public class HelloWorldControllerImpl implements HelloWorldController {

	private List<String> numbers = new ArrayList<String>();

	@Override
	public String getTest(@PathVariable String testNumber) {
		return "got : " + testNumber;
	}

	@Override
	public ResponseEntity<String> addTest(@RequestBody String testNumber) {
		HttpStatus status = null;

		if (testNumber != null) {
			numbers.add(testNumber);

			status = HttpStatus.CREATED;
		} else {
			status = HttpStatus.FORBIDDEN;
		}

		return ResponseEntity.status(status).build();
	}

	@Override
	public List<String> getTests() {
		return numbers;
	}

}
