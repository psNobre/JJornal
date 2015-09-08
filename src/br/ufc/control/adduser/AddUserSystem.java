package br.ufc.control.adduser;

import br.ufc.dao.UserDAO;
import br.ufc.model.User;

public abstract class AddUserSystem {
	
	public String addUser(User user){
		adicionaUsuario(user);
		String redirect = atribuirPapelAoUsuario(user);
		return redirect;
	}
	
	protected User adicionaUsuario(User user) {
		UserDAO dao = new UserDAO();
		dao.salvar(user);
		return user;
	}
	
	abstract String atribuirPapelAoUsuario(User user);
	
}
