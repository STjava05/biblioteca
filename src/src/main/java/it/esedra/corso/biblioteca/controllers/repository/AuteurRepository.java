package it.esedra.corso.biblioteca.controllers.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.esedra.corso.biblioteca.entity.Auteur;

public interface AuteurRepository extends CrudRepository <Auteur,Long> {
	
 public List <Auteur>	findAll();

}
