package br.ufc.jjornal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.model.User;


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
	
	@RequestMapping("/formJornalista")
	public String formRegistroJornalista(){
		return "formregister_jornalista";
	}
	
	@RequestMapping("/formSecao")
	public String formRegistroSecao(){
		return "formregister_secao";
	}
	
	@RequestMapping("/formClassificados")
	public String formRegistroClassificados(){
		return "formregister_classificados";
	}
	
	@RequestMapping("/listaNoticias")
	public String listaNoticias(){
		return "lista_noticias";
	}
	
	@RequestMapping("/home")
	public String paginaInicial(HttpSession session){
		User user = (User)session.getAttribute("UserLogado");
		if (user != null) {
			if (session.getAttribute("UserTipo").equals(Config.EDITOR)) {
				return "menu-editor";
			}else if (session.getAttribute("UserTipo").equals(Config.JORNALISTA)){
				return "menu-jornalista";
			}else{
				return "menu-leitor";
			}	
		}
		return "index";		
	}
	
}
