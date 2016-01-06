package br.ufc.test;

import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.User;

public class TestaFindByLogin {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		User user = userDAO.findUserByLogin("psNobre");
		
		System.out.println(user.toString());

	}

}
