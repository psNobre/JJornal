package br.ufc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufc.dao.interfaces.DAO;
import br.ufc.dao.interfaces.iUserDAO;
import br.ufc.factory.JPAUtilFactory;
import br.ufc.logger.Logger;
import br.ufc.model.User;

public class UserDAO implements iUserDAO {
	private static final String TAG = UserDAO.class.getName();
	

	@Override
	public User findUserByLogin(String login) {
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
	
}
