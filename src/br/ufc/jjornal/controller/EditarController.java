package br.ufc.jjornal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.dao.SecaoDAO;
import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.Classificado;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.Secao;
import br.ufc.jjornal.model.User;


@Transactional
@Controller
public class EditarController {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private PapelDAO papelDao;
	
	@Autowired
	private SecaoDAO secaoDAO;
	
	@RequestMapping("/registerJornalista")
	public String registerJornalista(User user) {
		this.userDao.salvar(user);
		
		Papel jornalista = new Papel();
		jornalista.setPapel(Config.JORNALISTA);
		jornalista.setUser(user);
		this.papelDao.salvar(jornalista);
		
		return "menu-editor";
	}
	
	@RequestMapping("/cadastrarSecao")
	public String cadastrarSecao(Secao secao){
		secaoDAO.salvar(secao);
		return "menu-editor";
	}
	
	@RequestMapping("/cadastrarClassificados")
	public String cadastrarClassificados(Classificado classificado){
		//TODO Classificado DAO
		return "menu-editor";
	}
}
