package br.ufc.test;

import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.User;

public class TesteAddUser {
	public static void main(String[] args) {
		User user = new User();
		user.setNome("Administrador");
		user.setLogin("admin");
		user.setSenha("admin");
		user.setEmail("admin.jjornal@gmail.com");
		
		UserDAO dao = new UserDAO();
		dao.salvar(user);

	}
}
