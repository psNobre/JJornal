package br.ufc.jjornal.util.login;

import java.util.List;
import javax.servlet.http.HttpSession;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public abstract class LoginSystem {
	
	private static final String TAG = LoginSystem.class.getName();
	
	public String login(HttpSession session, User user, String senha, String papel){	
		
		boolean permitido = checarPermissao(user, papel);	
		return validarParametros(session, user, senha, permitido);
	
	}
		
	protected boolean checarPermissao(User user, String papel) {
		Logger.printLog(TAG, "Papel Solicitado "+ papel);
		List<Papel> papeis = user.getPapeis();
		for (Papel mPapel : papeis) {
			Logger.printLog(TAG, "Papeis Encontrados "+mPapel.getPapel());
			if (mPapel.getPapel().equals(papel)){
				Logger.printLog(TAG, "Permissão atribuida ao usuário...");
				return true;
			}
		}
		Logger.printLog(TAG, "Permissão de usuario negada...");
		return false;
	}
	
	abstract String validarParametros(HttpSession session, User user, String senha, boolean permissao);

}
