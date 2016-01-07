package br.ufc.jjornal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.util.login.LoginComoEditor;
import br.ufc.jjornal.util.login.LoginComoJornalista;
import br.ufc.jjornal.util.login.LoginComoLeitor;
import br.ufc.jjornal.util.login.LoginSystem;

@Controller
public class LoginController {
	
	@RequestMapping("/loginUser")
	public String loginUser(HttpSession session, String login, String senha, String papel){
		String redirect = null;
		LoginSystem loginSystem;
		
		switch (papel) {
		case Config.LEITOR:
			loginSystem = new LoginComoLeitor();
			 redirect = loginSystem.login(session, login, senha, papel);
			break;
		
		case Config.JORNALISTA:
			loginSystem = new LoginComoJornalista();
			redirect = loginSystem.login(session, login, senha, papel);
			break;
			
		case Config.EDITOR:
			loginSystem = new LoginComoEditor();
			redirect = loginSystem.login(session, login, senha, papel);
			break;

		default:
			redirect = "formlogin";
			break;
		}
		
		return redirect;
	}
	
	@RequestMapping("/logoutUser")
	public String logoutUser(HttpSession session) {
		if (session != null) {
			session.invalidate();
		}
		return "index";
	}

}
