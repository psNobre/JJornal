package br.ufc.jjornal.util.adduser;


import br.ufc.jjornal.conf.Config;
import br.ufc.jjornal.dao.PapelDAO;
import br.ufc.jjornal.model.Papel;
import br.ufc.jjornal.model.User;

public class UserComoLeitor extends AddUserSystem {
	private PapelDAO dao = new PapelDAO();
	
	@Override
	String atribuirPapelAoUsuario(User user) {
		Papel leitor = new Papel();
		leitor.setPapel(Config.LEITOR);
		leitor.setUser(user);
		dao.salvar(leitor);
		
		return "login";
	}

}
