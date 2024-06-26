package info.christianbatista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.christianbatista.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
