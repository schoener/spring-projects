package de.schoener.spring.rest.controller.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/tests")
public interface HelloWorldController {

	@RequestMapping(value = "/{testNumber}/test", method = RequestMethod.GET)
	@ResponseBody
	String getNumber(@PathVariable String testNumber);
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	List<String> getNumbers();
	
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	ResponseEntity<String> addNumber(@RequestBody String testNumber);
	
}
