package br.ufc.jjornal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

@Transactional
@Controller
public class LeitorController {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private PapelDAO papelDao;
	
	@RequestMapping("/registerLeitor")
	public String registerUser(User user) {		
		this.userDao.salvar(user);
		
		Papel leitor = new Papel();
		leitor.setPapel(Config.LEITOR);
		leitor.setUser(user);
		this.papelDao.salvar(leitor);
		
		return "formlogin" ;
	}

}
