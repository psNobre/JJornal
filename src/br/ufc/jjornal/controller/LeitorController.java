package br.ufc.jjornal.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.ComentarioDAO;
import br.ufc.jjornal.dao.NoticiaDAO;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.dao.SecaoDAO;
import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.Comentario;
import br.ufc.jjornal.model.Noticia;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.Secao;
import br.ufc.jjornal.model.User;

@Transactional
@Controller
public class LeitorController {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private PapelDAO papelDao;
	
	@Autowired
	private ComentarioDAO comentarioDAO;
	
	@Autowired
	private SecaoDAO secaoDAO;
	
	@Autowired
	private NoticiaDAO noticiaDAO;
	
	@RequestMapping("/registerLeitor")
	public String registerUser(User user) {		
		this.userDao.salvar(user);
		
		Papel leitor = new Papel();
		leitor.setPapel(Config.LEITOR);
		leitor.setUser(user);
		this.papelDao.salvar(leitor);
		
		return "formlogin" ;
	}
	
	@RequestMapping("/cadastrarComentarios/{id}")
	public ModelAndView cadastrarComentarios(HttpSession session, String texto, @PathVariable Integer id) {
		User user = (User) session.getAttribute("UserLogado");
		
		List<Secao> secoes = secaoDAO.listar();	
		Noticia noticia = noticiaDAO.findById(id);
		List<Comentario> comentarios = comentarioDAO.findComentariosByNoticia(noticia);
		
		ModelAndView modelAndView =  new ModelAndView("noticia");
		modelAndView.addObject("noticia", noticia);
		modelAndView.addObject("secoes", secoes);
		modelAndView.addObject("comentarios", comentarios);
		
		System.out.println("NOME "+comentarios.get(0).getUser().getLogin());
		
		if (user != null) {
			for (Papel papel : user.getPapeis()) {
				if (papel.getPapel().equals(Config.LEITOR)) {
					Comentario comentario = new Comentario();
					comentario.setTexto(texto);
					comentario.setUser(user);
					comentario.setNoticia(noticia);
					comentarioDAO.salvar(comentario);
					
				}
			}
			
		}
		
		return modelAndView;
	}

}
