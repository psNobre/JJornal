package br.ufc.control.adduser;

import br.ufc.conf.Config;
import br.ufc.dao.PapelDAO;
import br.ufc.model.Papel;
import br.ufc.model.User;

public class UserComoLeitor extends AddUserSystem {

	@Override
	String atribuirPapelAoUsuario(User user) {
		PapelDAO dao = new PapelDAO();
		
		Papel leitor = new Papel();
		leitor.setPapel(Config.LEITOR);
		leitor.setUser(user);
		dao.salvar(leitor);
		
		return "index.jsp";
	}

}
