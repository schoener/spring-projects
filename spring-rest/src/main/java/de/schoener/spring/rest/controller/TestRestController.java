package de.schoener.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestRestController {
	@GetMapping(value = "/")
	public String home() {
		return "home";
	}
}
