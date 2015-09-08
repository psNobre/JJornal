package br.ufc.test;

import java.util.List;

import br.ufc.dao.PapelDAO;
import br.ufc.model.Papel;

public class TesteListPapel {

	public static void main(String[] args) {
		PapelDAO papelDao = new PapelDAO();
		List<Papel> papeis = papelDao.listarPapeis();
		
		for (Papel papel : papeis) {
			System.out.println(papel.toString());
			
		}
	}

}
