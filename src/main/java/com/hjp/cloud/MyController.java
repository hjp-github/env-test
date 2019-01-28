package com.hjp.cloud;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping(value = "/person/{personId}", method = RequestMethod.GET
			, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findPerson(@PathVariable("personId") Integer personId) {
		Person person = new Person();
		person.setId(personId);
		person.setName("胡际鹏");
		person.setAge(18);
		
		return person;
	}
	
}
