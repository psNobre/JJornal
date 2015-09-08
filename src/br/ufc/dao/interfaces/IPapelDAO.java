package br.ufc.dao.interfaces;

import java.util.List;

import br.ufc.model.Papel;

public interface IPapelDAO {
	public void salvar(Papel papel);
	public List<Papel> listarPapeis();

}
