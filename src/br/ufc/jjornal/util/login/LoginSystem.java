package br.ufc.jjornal.util.login;

import br.ufc.jjornal.model.User;

public abstract class LoginSystem {
	
	public String login(String login, String senha, String papel){	
		
		User user = procurarUsuario(login);
		boolean permitido = atribuirPermissao(user, papel);	
		
		return validarParametros(user, senha, permitido);
	}
	
	abstract User procurarUsuario(String login);
	abstract boolean atribuirPermissao(User user, String papel);
	abstract String validarParametros(User user, String senha, boolean permissao);

}
