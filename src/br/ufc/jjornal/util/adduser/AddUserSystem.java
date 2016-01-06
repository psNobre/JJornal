package br.ufc.jjornal.util.adduser;


import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.User;

public abstract class AddUserSystem {
	
	private UserDAO dao =  new UserDAO();
	
	public String addUser(User user){	
		String redirect = atribuirPapelAoUsuario(adicionaUsuario(user));
		return redirect;
	}
	
	protected User adicionaUsuario(User user) {
		
		dao.salvar(user);
		return user;
	}
	
	abstract String atribuirPapelAoUsuario(User user);
	
}
