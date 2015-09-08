package br.ufc.conf;

/** 
 * Classe Responsável por variáveis do Sistema
 * 
 * */
public class Config {

	public static final String URL = "jdbc:mysql://localhost:3306/teste";
	public static final String USER = "root";
	public static final String PASSWORD = "root";
	
	/** 
	 * Nome do Banco de Dados que será persistido objetos
	 * */
	public static final String PERSISTENCE_DB = "teste";

	/** 
	 * Tipos de Usuários do Sistema
	 * */
	public static final String EDITOR = "Editor";
	public static final String JORNALISTA = "Jornalista";
	public static final String LEITOR = "Leitor";

}
