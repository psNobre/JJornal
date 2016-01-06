package br.ufc.test;

import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.User;

public class TesteAddUser {
	public static void main(String[] args) {
		User user = new User();
		user.setNome("Pedro Savio Nobre");
		user.setLogin("psNobre");
		user.setSenha("Pedro@Nobre");
		user.setEmail("pedro.savio.nobre@gmail.com");
		
		User user2 = new User();
		user2.setNome("Julie Caroline Martins");
		user2.setLogin("juCarol");
		user2.setSenha("Julie@Martins");
		user2.setEmail("juliecaroline@gmail.com");
		
		UserDAO dao = new UserDAO();
		dao.salvar(user);
		dao.salvar(user2);
	}
}
