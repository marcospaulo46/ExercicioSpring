package br.org.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class Exercicio1Controller {
	
	@GetMapping
	public String hello() {
		return "Persistência e atenção ao detalhe!";
		
	}

}
