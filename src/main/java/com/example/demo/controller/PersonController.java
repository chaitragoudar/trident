package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.entity.ResponseVO;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	
	@PostMapping("/")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping("/{id}")
	public ResponseVO getPersonById(@PathVariable("id") int id) {
		return personService.getPeronById(id);
	}

}
