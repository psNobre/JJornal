package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Secao;

@Repository
public class SecaoDAO implements DAO<Secao>{
	private static final String TAG = SecaoDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Secao findById(Object id) {
		Secao secao = this.manager.find(Secao.class, id);
		return secao;
	}

	@Override
	public void salvar(Secao entidade) {
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public void remover(Secao entidade) {
		 this.manager.remove(this.manager.getReference(Secao.class, entidade.getId()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<Secao> listar() {
		List<Secao> secoes = this.manager.createQuery("select s from secao s").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return secoes;
	}

	@Override
	public void alterar(Secao entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}



}
