package com.softgraf.primavera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softgraf.primavera.data.entity.Produto;
import com.softgraf.primavera.data.repository.ProdutoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoRepository repository;
	

	// localhost:8080/home
	@GetMapping("home")  
	public String home(Model model) {
		/*
		Produto p1 = new Produto(1L, "celular iphone 13 128GB", 5199.0f, 2);
		Produto p2 = new Produto(2L, "celular galaxy a03 64GB", 801.1f, 3);
		Produto p3 = new Produto(3L, "celular motorola moto e20 32GB", 699.0f, 2);
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		*/
		
		List<Produto> produtos = repository.findAll();
		
		// objeto responsavel por enviar dados para o front end
		model.addAttribute("produtos", produtos);
		
		// carrega "templates/home.html"
		return "home";
	}
	
}

