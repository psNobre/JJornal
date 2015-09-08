package br.ufc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufc.dao.interfaces.IPapelDAO;
import br.ufc.factory.JPAUtilFactory;
import br.ufc.logger.Logger;
import br.ufc.model.Papel;

public class PapelDAO implements IPapelDAO {
	private static final String TAG = PapelDAO.class.getName();

	@Override
	public void salvar(Papel papel) {
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(papel);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Papel persistido com sucesso..."); 
		
		entityManager.close();
		
	}

	@Override
	public List<Papel> listarPapeis() {
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		List<Papel> papeis = entityManager.createQuery("select p from papel p", Papel.class).getResultList();	
		Logger.printLog(TAG, "Retornando papeis com sucesso..."); 
		return papeis;
	}

}
