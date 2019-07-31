package de.schoener.spring.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRestController {
	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String home() {
		return "This is home page\n";
	}
}
