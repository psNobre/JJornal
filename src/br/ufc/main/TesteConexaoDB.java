package br.ufc.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.ufc.factory.ConnectionFactory;

public class TesteConexaoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
