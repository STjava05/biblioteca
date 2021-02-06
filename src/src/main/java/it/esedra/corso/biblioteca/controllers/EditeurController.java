package it.esedra.corso.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.esedra.corso.biblioteca.controllers.repository.EditeurRepository;
import it.esedra.corso.biblioteca.entity.Editeur;

@RestController
//@RequestMapping("/editeur")
public class EditeurController {
	
	@Autowired // This means to get the bean called userRepository
	private EditeurRepository editeurRepository;

	@GetMapping("/editeurs")
	@CrossOrigin
	public @ResponseBody Iterable<Editeur> getAllEditeurs() {
		return editeurRepository.findAll();

}
}