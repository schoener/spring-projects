package de.schoener.spring.rest.controller.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import de.schoener.spring.rest.data.object.SpringNumberDO;

@RequestMapping("/tests")
public interface NumbersController {

	@RequestMapping(value = "/{testNumber}/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	ResponseEntity<SpringNumberDO> getNumber(@PathVariable String testNumber);

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	ResponseEntity<List<SpringNumberDO>> getNumbers();

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	ResponseEntity<String> addNumber(@RequestBody String testNumber);

}
