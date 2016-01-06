package br.ufc.test;


import java.util.List;

import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public class TesteGetPapelByUser {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		User user = userDAO.findUserByLogin("psNobre");
		
		List<Papel> papels = user.getPapeis();
		
		for (Papel papel : papels) {
			System.out.println(papel.toString());
		}

	}

}
