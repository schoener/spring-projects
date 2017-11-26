package de.schoener.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.domain.service.NumbersService;
import de.schoener.spring.rest.controller.api.NumbersController;
import de.schoener.spring.rest.data.object.SpringNumberDO;

@Controller
public class NumbersControllerImpl implements NumbersController {

	@Autowired
	private NumbersService numbersService;

	@Override
	public ResponseEntity<SpringNumberDO> getNumber(
			@PathVariable String testNumber) {
		SpringNumber springNumber = numbersService.getNumber(testNumber);
		SpringNumberDO numberDO = new SpringNumberDO(springNumber.intValue());

		return new ResponseEntity<SpringNumberDO>(numberDO, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> addNumber(@RequestBody String number) {
		HttpStatus status = null;

		if (number != null) {
			numbersService.addNumber(number);
			status = HttpStatus.CREATED;
		} else {
			status = HttpStatus.FORBIDDEN;
		}

		return ResponseEntity.status(status).build();
	}

	@Override
	public ResponseEntity<List<SpringNumberDO>> getNumbers() {
		List<SpringNumber> numbers = numbersService.getNumbers();
		List<SpringNumberDO> numbersDO = new ArrayList<SpringNumberDO>();

		for (SpringNumber springNumber : numbers) {
			numbersDO.add(new SpringNumberDO(springNumber.intValue()));
		}

		return new ResponseEntity<List<SpringNumberDO>>(numbersDO,
				HttpStatus.OK);
	}

}
