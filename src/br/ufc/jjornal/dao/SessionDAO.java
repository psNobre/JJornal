package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.factory.JPAUtilFactory;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Session;

@Repository
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
