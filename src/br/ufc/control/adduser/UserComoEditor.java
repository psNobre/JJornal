package br.ufc.control.adduser;

import br.ufc.conf.Config;
import br.ufc.dao.PapelDAO;
import br.ufc.model.Papel;
import br.ufc.model.User;

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
