package br.ufc.dao.interfaces;

public interface DAO<E> {
	
	public E findById(Object id);
	public void salvar(E entidade);
	public void remover(E entidade);
	public void listar();
	public void alterar(E entidade);

}
