package de.schoener.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpittleController {
	@GetMapping(value = "/spittles")
	public String home() {
		return "spittles";
	}

}
