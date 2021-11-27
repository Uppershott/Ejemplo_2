package com.nttdata.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/") //método inicial
	public String inicio() {
		return "Hola mundo!";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "el index!";
	}
	
	@RequestMapping("/inicio/menu")
	public String menu() {
		return "el menu!";
	}
	
}
