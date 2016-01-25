package br.ufc.jjornal.dao.interfaces;

import java.util.List;

import br.ufc.jjornal.model.Comentario;
import br.ufc.jjornal.model.Noticia;

public interface IComentarioDAO {

	public List<Comentario> findComentariosByNoticia(Noticia noticia);
}
