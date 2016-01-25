package br.ufc.jjornal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.DAO;
import br.ufc.jjornal.dao.interfaces.INoticiaDAO;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.Noticia;
import br.ufc.jjornal.model.Secao;

@Repository
public class NoticiaDAO implements DAO<Noticia>, INoticiaDAO {
	private static final String TAG = NoticiaDAO.class.getName();
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Noticia findById(Object id) {
		Noticia noticia = this.manager.find(Noticia.class, id);
		return noticia;
	}

	@Override
	public void salvar(Noticia entidade) {
		this.manager.persist(entidade);
		Logger.printLog(TAG, "Entidade persistido com sucesso..."); 
		
	}

	@Override
	public void remover(Noticia entidade) {
		 this.manager.remove(this.manager.getReference(Noticia.class, entidade.getId()));
		 Logger.printLog(TAG, "Entidade removido com sucesso..."); 
		
	}

	@Override
	public List<Noticia> listar() {
		List<Noticia> noticias = this.manager.createQuery("select n from noticia n").getResultList();
		Logger.printLog(TAG, "Lista retornada com sucesso..."); 
		return noticias;
	}

	@Override
	public void alterar(Noticia entidade) {
		this.manager.merge(entidade);
		Logger.printLog(TAG, "Entidade Atualizado com sucesso..."); 
		
	}

	@Override
	public List<Noticia> findNoticiasBySecao(Secao secao) {
		String hql  = "select n from noticia n where id_secao = :secao";
		return this.manager.createQuery(hql, Noticia.class).setParameter("secao", secao.getId()).getResultList();
	}

}
