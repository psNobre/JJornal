package br.ufc.jjornal.util.adduser;

import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public class UserComoEditor extends AddUserSystem {

	@Override
	String atribuirPapelAoUsuario(User user) {
		PapelDAO dao = new PapelDAO();
		
		Papel editor = new Papel();
		editor.setPapel(Config.EDITOR);
		editor.setUser(user);
		dao.salvar(editor);
		
		return "index.jsp";
	}

}
