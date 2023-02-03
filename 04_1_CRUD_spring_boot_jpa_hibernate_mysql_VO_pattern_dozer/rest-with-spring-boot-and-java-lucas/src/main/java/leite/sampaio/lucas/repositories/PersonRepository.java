package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
