package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.factory.JPAUtilFactory;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Secao;

@Repository
public class SecaoDAO implements DAO<Secao> {
	private static final String TAG = SecaoDAO.class.getName();

	@Override
	public Secao findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Secao entidade) {
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(entidade);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Seção persistido com sucesso...");
		
		entityManager.close();
	}

	@Override
	public void remover(Secao entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Secao> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Secao entidade) {
		// TODO Auto-generated method stub
		
	}

}
