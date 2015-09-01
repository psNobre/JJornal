package br.ufc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufc.dao.interfaces.DAO;
import br.ufc.factory.JPAUtilFactory;
import br.ufc.logger.Logger;
import br.ufc.model.Session;

public class SessionDAO implements DAO<Session> {
	private static final String TAG = SessionDAO.class.getName();

	@Override
	public Session findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Session entidade) {
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(entidade);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Seção persistido com sucesso...");
		
		entityManager.close();
		
	}

	@Override
	public void remover(Session entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Session> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Session entidade) {
		// TODO Auto-generated method stub
		
	}

}
