package br.org.generation.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")
public class Exercicio2Controller {
	
	@GetMapping
	public String exercicio2() {
		return "Meu objetivo de aprendizagem é absorver ao maximo as aulas de Spring e "
				+ "conseguir ter um bom desenvolvimento com os meus projetos!";
		
	}

}