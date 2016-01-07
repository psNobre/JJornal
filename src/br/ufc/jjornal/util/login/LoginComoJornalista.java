package br.ufc.jjornal.util.login;

import javax.servlet.http.HttpSession;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.User;

public class LoginComoJornalista extends LoginSystem {
	
	private static final String TAG = LoginComoJornalista.class.getName();
	
	@Override
	String validarParametros(HttpSession session, User user, String senha, boolean permissao) {
		if (permissao && user.getSenha().equals(senha)) {
			Logger.printLog(TAG, "Senha checada com sucesso...");
			session.setAttribute("UserLogado", user);
			session.setAttribute("UserTipo", Config.JORNALISTA);
			Logger.printLog(TAG, "Usuário adicionado na Sessão...");
			return "menu-jornalista";
		}
		return "formlogin";
	}

}
