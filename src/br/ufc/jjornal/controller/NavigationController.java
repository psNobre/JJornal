package br.ufc.jjornal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

	@RequestMapping("/index")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String formLogin(){
		return "formlogin";
	}
	
	@RequestMapping("/register")
	public String formRegistro(){
		return "formregistro";
	}
	
}
