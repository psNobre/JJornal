package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Comentario;

@Repository
public class ComentarioDAO implements DAO<Comentario> {
	private static final String TAG = ComentarioDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Comentario findById(Object id) {
		Comentario comentario = this.manager.find(Comentario.class, id);
		return comentario;
	}

	@Override
	public void salvar(Comentario entidade) {
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public void remover(Comentario entidade) {
		 this.manager.remove(this.manager.getReference(Comentario.class, entidade.getId()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<Comentario> listar() {
		List<Comentario> comentarios = this.manager.createQuery("select co from comentario co").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return comentarios;
	}

	@Override
	public void alterar(Comentario entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}

}
