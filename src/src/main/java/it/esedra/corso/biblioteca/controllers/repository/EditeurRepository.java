package it.esedra.corso.biblioteca.controllers.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.esedra.corso.biblioteca.entity.Editeur;

public interface EditeurRepository extends CrudRepository<Editeur,Long> {
	
	public List <Editeur> findAll();

}
