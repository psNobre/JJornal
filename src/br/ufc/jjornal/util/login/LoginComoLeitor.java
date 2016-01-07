package br.ufc.jjornal.util.login;

import javax.servlet.http.HttpSession;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.User;

public class LoginComoLeitor extends LoginSystem {
	

	private static final String TAG = LoginComoLeitor.class.getName();
	
	@Override
	String validarParametros(HttpSession session, User user, String senha, boolean permissao) {
		if (permissao && user.getSenha().equals(senha)) {
			Logger.printLog(TAG, "Senha checada com sucesso...");
			session.setAttribute("UserLogado", user);
			session.setAttribute("UserTipo", Config.LEITOR);
			Logger.printLog(TAG, "Usuário adicionado na Sessão...");
			return "menu-leitor";
		}
		return "formlogin";
	}
}
