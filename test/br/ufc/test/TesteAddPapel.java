package br.ufc.test;

import br.ufc.dao.PapelDAO;
import br.ufc.dao.UserDAO;
import br.ufc.model.Papel;

public class TesteAddPapel {

	public static void main(String[] args) {
		UserDAO usuarioDao = new UserDAO();
		PapelDAO papelDAO = new PapelDAO();
		
		Papel papel = new Papel();
		papel.setPapel("Leitor");		
		papel.setUser(usuarioDao.findUserByLogin("carlos"));
		
		papelDAO.salvar(papel);

	}

}
