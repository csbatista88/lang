package info.christianbatista.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.christianbatista.model.Person;
import info.christianbatista.services.PersonServices;



@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonServices service;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
		
	public List<Person> findAll() {
			return service.findAll();  
	}
	
	@GetMapping(value = "/{id}",
		produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Person findById(
			@PathVariable(value = "id") Long id) throws Exception{
		return service.findById(id);
	}
	@PostMapping(value = "/",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Person create(@RequestBody Person person) throws Exception{
		return service.create(person);
	}
	@PutMapping(value = "/",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Person update(@RequestBody Person person) throws Exception{
		return service.create(person);
	}
	@DeleteMapping(value = "/{id}")
	
	public void delete(@PathVariable(value = "id") Long id) throws Exception{
		service.delete(id);
	}
	}