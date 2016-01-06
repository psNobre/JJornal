package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.IPapelDAO;
import br.ufc.jjornal.factory.JPAUtilFactory;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Papel;

@Repository
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
