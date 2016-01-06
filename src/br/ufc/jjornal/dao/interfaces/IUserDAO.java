package br.ufc.jjornal.dao.interfaces;

import br.ufc.jjornal.model.User;

public interface IUserDAO {
	public User findUserByLogin(String login);
	public void salvar(User user);

}
