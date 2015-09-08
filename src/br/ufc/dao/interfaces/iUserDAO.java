package br.ufc.dao.interfaces;

import br.ufc.model.User;

public interface IUserDAO {
	public User findUserByLogin(String login);
	public void salvar(User user);

}
