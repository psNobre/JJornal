package br.ufc.jjornal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.ufc.jjornal.model.Noticia;

@Controller
public class JornalistaController {
	
	@RequestMapping("/cadastrarNoticias")
	public String cadastrarNoticia(Noticia noticia, String secao){
		//TODO DAO Noticia
		return "menu-jornalista";
	}

}
