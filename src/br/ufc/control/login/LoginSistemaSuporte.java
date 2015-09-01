package br.ufc.control.login;

import br.ufc.dao.UserDAO;
import br.ufc.model.Papel;
import br.ufc.model.User;

public class LoginSistemaSuporte extends Login{

	@Override
	User procurarUsuario(String login) {
		UserDAO dao = new UserDAO();
		User user = dao.findUserByLogin(login);
		return user;
	}

	@Override
	boolean atribuirPermissao(User user, String papel) {
		for ( Papel regra : user.getPapeis()) {
			if (regra.getPapel().equals(papel)) {
				return true;
			}
		}
		return false;
	}

	@Override
	String validarParametros(User user, String senha, boolean permissao) {
		if (permissao && user.getSenha().equals(senha)) {
			return "session.jsp";
		}
		return "formlogin.jsp";
	}

}
