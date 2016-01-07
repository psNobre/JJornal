package br.ufc.jjornal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.dao.SecaoDAO;
import br.ufc.jjornal.model.Secao;
import br.ufc.jjornal.model.User;
import br.ufc.jjornal.util.adduser.AddUserSystem;
import br.ufc.jjornal.util.adduser.UserComoJornalista;

@Controller
public class EditarController {
	
	@RequestMapping("/registerJornalista")
	public String registerJornalista(User user) {
		AddUserSystem addUserSystem = new UserComoJornalista();
		return addUserSystem.addUser(user);
	}
	
	@RequestMapping("/cadastrarSecao")
	public String cadastrarSecao(Secao secao){
		SecaoDAO dao = new SecaoDAO();
		dao.salvar(secao);
		return "index";
	}
	
	@RequestMapping("/cadastrarClassificados")
	public String cadastrarClassificados(){
		//TODO
		return null;
	}
}
