package br.ufc.jjornal.util.login;

import java.util.List;

import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public class LoginSystemSupport extends LoginSystem {
	private static final String TAG = LoginSystemSupport.class.getName();

	@Override
	User procurarUsuario(String login) {
		UserDAO dao = new UserDAO();
		User user = dao.findUserByLogin(login);
		return user;
	}

	@Override
	boolean atribuirPermissao(User user, String papel) {
		Logger.printLog(TAG, "Papel Solicitado "+papel);
		List<Papel> papeis = user.getPapeis();
		for (Papel papel2 : papeis) {
			Logger.printLog(TAG, "Papeis Encontrados "+papel2.getPapel());
			if (papel2.getPapel().equals(papel)){
				Logger.printLog(TAG, "Permissão atribuida ao usuário...");
				return true;
			}
		}
		Logger.printLog(TAG, "Permissão de usuario negada...");
		return false;
	}

	@Override
	String validarParametros(User user, String senha, boolean permissao) {
		if (permissao && user.getSenha().equals(senha)) {
			Logger.printLog(TAG, "Senha checada com sucesso...");
			return "noticias.jsp";
		}
		Logger.printLog(TAG, "Senha incorreta..");
		return "formlogin.jsp";
	}

}
