package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Classificado;

@Repository
public class ClassificadoDAO implements DAO<Classificado>{
	private static final String TAG = ClassificadoDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Classificado findById(Object id) {
		Classificado classificado = this.manager.find(Classificado.class, id);
		return classificado;
	}

	@Override
	public void salvar(Classificado entidade) {
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public void remover(Classificado entidade) {
		 this.manager.remove(this.manager.getReference(Classificado.class, entidade.getId()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<Classificado> listar() {
		List<Classificado> classificados = this.manager.createQuery("select cl from classificado cl").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return classificados;
	}

	@Override
	public void alterar(Classificado entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}

}
