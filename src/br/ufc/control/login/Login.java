package br.ufc.control.login;

import br.ufc.model.User;

public abstract class Login {
	
	protected String login(String login, String senha, String papel){	
		
		User user = procurarUsuario(login);
		boolean permitido = atribuirPermissao(user, papel);
		validarParametros(user, senha, permitido);
		
		return null;
	}
	
	abstract User procurarUsuario(String login);
	abstract boolean atribuirPermissao(User user, String papel);
	abstract String validarParametros(User user, String senha, boolean permissao);
	
	

}
