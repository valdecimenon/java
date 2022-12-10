package com.softgraf.primavera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	// cria uma rota para o navegador
	// localhost:8080/hello
	// este método é uma Action que atende uma requisição http
//	@GetMapping("/hello")
//	public String hello(HttpServletRequest request) {
		// uma uma requisição http servlet para salvar dados para o front end
//		request.setAttribute("nome", "João da Silva");
//		// retorna hello.html para o navegador
//		return "hello";
//	}
	
	@GetMapping("/hello")
	// a action hello recebe um objeto Model que representa os dados para o front end
	public String hello(Model model) {
		model.addAttribute("nome", "João da Silva");
		return "hello";
	}
	
}
