package info.christianbatista.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.christianbatista.exceptions.ResourceNotFoundException;
import info.christianbatista.model.Person;
import info.christianbatista.repositories.PersonRepository;


@Service
public class PersonServices {
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		logger.info("Finding All Persons!");
		
	return repository.findAll();
			
		}
	
	public Person findById(Long id) {
		
		logger.info("Finding one Person!");
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records find by this ID"));
	}
	public Person create(Person person) {
		
		logger.info("Creating one Person!");
		
		return repository.save(person);
	}
public Person update(Person person) {
		
		logger.info("Updating one Person!");
		var entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records find by this ID"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		return repository.save(person);
	}
public void delete(Long id) {
	
	logger.info("Deleting one Person!");
	
	var entity = repository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("No records find by this ID"));
	repository.delete(entity);
	
}
}