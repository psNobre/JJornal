package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.User;

@Repository
public class UserDAO implements DAO<User> {
	private static final String TAG = UserDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void salvar(User entidade) {	
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public User findById(Object login) {
		User user = this.manager.find(User.class, (String)login);
		return user;
	}

	@Override
	public void remover(User entidade) {
		 this.manager.remove(this.manager.getReference(User.class, entidade.getLogin()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<User> listar() {
		List<User> usuarios = this.manager.createQuery("select u from usuario u").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return usuarios;
	}

	@Override
	public void alterar(User entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}

	
}
