package it.esedra.corso.biblioteca.controllers.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.esedra.corso.biblioteca.entity.Livre;

public interface LivreRepository extends CrudRepository<Livre,Long> {
	
	public List <Livre> findAll();

}
