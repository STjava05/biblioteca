package it.esedra.corso.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.esedra.corso.biblioteca.controllers.repository.LivreRepository;
import it.esedra.corso.biblioteca.entity.Livre;

@RestController
//@RequestMapping("/livre")
public class LivreController {
	
	@Autowired // This means to get the bean called userRepository
	private LivreRepository livreRepository;

	@GetMapping("/livres")
	@CrossOrigin
	public @ResponseBody Iterable<Livre> getAllLivres() {
		return livreRepository.findAll();

}
}