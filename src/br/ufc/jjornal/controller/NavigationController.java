package br.ufc.jjornal.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.SecaoDAO;
import br.ufc.jjornal.model.Secao;
import br.ufc.jjornal.model.User;


@Controller
public class NavigationController {
	
	@Autowired
	private SecaoDAO secaoDao;

	@RequestMapping("/index")
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView("index");
		List<Secao> secoes = secaoDao.listar();	
		modelAndView.addObject("secoes", secoes);
		return modelAndView;
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
	
	@RequestMapping("/formNoticias")
	public ModelAndView formRegistroNoticias(){
		ModelAndView modelAndView = new ModelAndView("formregister_noticias");
		List<Secao> secoes = secaoDao.listar();	
		modelAndView.addObject("secoes", secoes);
		return modelAndView;
	}
	
	@RequestMapping("/listaNoticias")
	public String listaNoticias(){
		return "lista_noticias";
	}
	
	@RequestMapping("/listaClassificados")
	public ModelAndView listaClassificados(){
		ModelAndView modelAndView = new ModelAndView("lista_classificados");
		List<Secao> secoes = secaoDao.listar();	
		modelAndView.addObject("secoes", secoes);
		return modelAndView;
	}
	
	@RequestMapping("/home")
	public ModelAndView paginaInicial(HttpSession session){
		
		ModelAndView modelAndView;
		List<Secao> secoes = secaoDao.listar();	
		
		User user = (User)session.getAttribute("UserLogado");
		if (user != null) {
			if (session.getAttribute("UserTipo").equals(Config.EDITOR)) {
				modelAndView = new ModelAndView("menu-editor");
				modelAndView.addObject("secoes", secoes);
				return modelAndView;
			}else if (session.getAttribute("UserTipo").equals(Config.JORNALISTA)){
				modelAndView = new ModelAndView("menu-jornalista");
				modelAndView.addObject("secoes", secoes);
				return modelAndView;
			}else{
				modelAndView = new ModelAndView("menu-leitor");
				modelAndView.addObject("secoes", secoes);
				return modelAndView;
			}	
		}
		modelAndView = new ModelAndView("index");
		modelAndView.addObject("secoes", secoes);
		return modelAndView;		
	}
	
}
