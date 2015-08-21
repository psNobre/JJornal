package br.ufc.dao;

import javax.persistence.EntityManager;

import br.ufc.dao.interfaces.DAO;
import br.ufc.factory.JPAUtilFactory;
import br.ufc.logger.Logger;
import br.ufc.model.User;

public class UserDAO implements DAO<User> {
	private static final String TAG = UserDAO.class.getName();
	@Override
	public User findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(User entidade) {
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(entidade);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Usuário persistido com sucesso...");
		
		entityManager.close();
	}

	@Override
	public void remover(User entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(User entidade) {
		// TODO Auto-generated method stub
		
	}

}
