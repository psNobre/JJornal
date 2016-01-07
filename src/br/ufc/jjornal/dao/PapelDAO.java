package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Papel;

@Repository
public class PapelDAO implements DAO<Papel> {
	private static final String TAG = PapelDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void salvar(Papel entidade) {	
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public Papel findById(Object id) {
		Papel papel = this.manager.find(Papel.class, id);
		return papel;
	}

	@Override
	public void remover(Papel entidade) {
		 this.manager.remove(this.manager.getReference(Papel.class, entidade.getId()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<Papel> listar() {
		List<Papel> papeis = this.manager.createQuery("select p from papel p").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return papeis;
	}

	@Override
	public void alterar(Papel entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}

}
