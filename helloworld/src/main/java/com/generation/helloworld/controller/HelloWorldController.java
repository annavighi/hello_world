package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping ("/BSM")
	public String listaBSM() {
		return "Orientação ao futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de crescimento\r\n"
				+ "Persistência\r\n" + "Habilidade:\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Atenção aos detalhes\r\n"
				+ "Proatividade\r\n" + "Comunicação";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "Melhorar minhas habilidades em Java"
				+ "Melhorar as habilidades em MySQL\r\n"
				+ "Compreender API, redes e HTTPS\r\n"
				+ "Trabalhar minhas habilidades de soft skills\r\n"
				+ "Melhorar meu perfil do LinkedIn\r\n";
	}
}
