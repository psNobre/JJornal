package br.ufc.jjornal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.jjornal.model.User;
import br.ufc.jjornal.util.adduser.AddUserSystem;
import br.ufc.jjornal.util.adduser.UserComoLeitor;

@Controller
public class LeitorController {
	
	@RequestMapping("/cadastrarLeitor")
	public String cadastrarLeitor(User user){
		AddUserSystem addUserSystem =  new UserComoLeitor();
		String  redirect = addUserSystem.addUser(user);
		return redirect;
	}
	
	
}
