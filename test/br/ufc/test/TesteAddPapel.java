package br.ufc.test;

import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.dao.UserDAO;
import br.ufc.jjornal.model.Papel;

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
