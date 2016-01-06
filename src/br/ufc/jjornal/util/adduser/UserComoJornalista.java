package br.ufc.jjornal.util.adduser;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public class UserComoJornalista extends AddUserSystem {
	
	@Override
	String atribuirPapelAoUsuario(User user) {
		PapelDAO dao = new PapelDAO();
		
		Papel jornalista = new Papel();
		jornalista.setPapel(Config.JORNALISTA);
		jornalista.setUser(user);
		dao.salvar(jornalista);
		
		return "index.jsp";
	}

}
