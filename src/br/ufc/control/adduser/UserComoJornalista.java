package br.ufc.control.adduser;

import br.ufc.conf.Config;
import br.ufc.dao.PapelDAO;
import br.ufc.model.Papel;
import br.ufc.model.User;

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
