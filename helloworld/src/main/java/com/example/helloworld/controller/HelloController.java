package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello Fámilia 41!";
	}
	@GetMapping("/mentalidade")
	public String mentalidade() {
		return "PERSISTÊNCIA, é o que devemos ter todos os dias!";
	}
	
	@GetMapping("/habilidade")
	public String habilidade() {
		return "ATENÇÃO AOS DETALHES essa é a principal fonte para alcançar os objetivos!";
	}
}
