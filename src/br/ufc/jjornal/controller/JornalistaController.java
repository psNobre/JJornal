package br.ufc.jjornal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.dao.NoticiaDAO;
import br.ufc.jjornal.dao.SecaoDAO;
import br.ufc.jjornal.model.Noticia;
import br.ufc.jjornal.model.Secao;
import br.ufc.jjornal.model.User;

@Transactional
@Controller
public class JornalistaController {
	
	@Autowired
	private NoticiaDAO noticiaDAO;
	
	@Autowired
	private SecaoDAO secaoDAO;
	
	@RequestMapping("/cadastrarNoticias")
	public String cadastrarNoticia(HttpSession session, String titulo, String subtitulo, String texto, String secao){
		//Adicionar Seção correspondente a notícia.
		Secao mSecao = this.secaoDAO.findById(Integer.parseInt(secao));
		Noticia noticia = new Noticia();
		
		noticia.setTitulo(titulo);
		noticia.setSubtitulo(subtitulo);
		noticia.setTexto(texto);
		
		//Adicionando Secao
		noticia.setSecao(mSecao);
		
		//Adicionar Autor da notícia.
		User user = (User) session.getAttribute("UserLogado");
		noticia.setUser(user);
		
		noticiaDAO.salvar(noticia);
		
		return "redirect:home";
	}

}
