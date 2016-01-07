package br.ufc.jjornal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.User;
import br.ufc.jjornal.util.login.LoginComoEditor;
import br.ufc.jjornal.util.login.LoginComoJornalista;
import br.ufc.jjornal.util.login.LoginComoLeitor;
import br.ufc.jjornal.util.login.LoginSystem;

@Transactional
@Controller
public class LoginController {
	
	private static final String TAG = LoginController.class.getName();
	
	@Autowired
	private UserDAO dao;
	
	@RequestMapping("/loginUser")
	public String loginUser(HttpSession session, String login, String senha, String papel){
		String redirect = null;
		LoginSystem loginSystem;
		
		switch (papel) {
		case Config.LEITOR:
			User leitor = this.dao.findById(login);
			if (leitor != null) {
				Logger.printLog(TAG, "Leitor: "+leitor.toString()); 
				loginSystem = new LoginComoLeitor();
				redirect = loginSystem.login(session, leitor, senha, papel);
			}
		
			break;
		
		case Config.JORNALISTA:
			User jornalista = this.dao.findById(login);
			if (jornalista != null) {
				Logger.printLog(TAG, "Jornalista: "+jornalista.toString()); 
				loginSystem = new LoginComoJornalista();
				redirect = loginSystem.login(session, jornalista, senha, papel);
			}
			
			break;
			
		case Config.EDITOR:
			User editor = this.dao.findById(login);
			if (editor != null) {
				Logger.printLog(TAG, "Editor: "+editor.toString()); 
				loginSystem = new LoginComoEditor();
				redirect = loginSystem.login(session, editor, senha, papel);
			}
			
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
