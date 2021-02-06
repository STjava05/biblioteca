package it.esedra.corso.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.esedra.corso.biblioteca.controllers.repository.AuteurRepository;
import it.esedra.corso.biblioteca.entity.Auteur;

@RestController
//@RequestMapping("/auteur")

public class AuteurController {

	
	@Autowired // This means to get the bean called userRepository
	private AuteurRepository auteurRepository;

	@GetMapping("/auteurs")
	@CrossOrigin
	public @ResponseBody Iterable<Auteur> getAllAuteurs() {
		return auteurRepository.findAll();

}
}