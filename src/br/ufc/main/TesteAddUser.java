package br.ufc.main;

import br.ufc.dao.UserDAO;
import br.ufc.model.User;

public class TesteAddUser {
	public static void main(String[] args) {
		User user = new User();
		user.setNome("Pedro Sávio Nobre");
		user.setLogin("psNobre");
		user.setSenha("Pedro@Nobre");
		user.setEmail("pedro.savio.nobre@gmail.com");
		
		UserDAO dao = new UserDAO();
		dao.salvar(user);
	}
}
