package br.ufc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.ufc.conf.Config;
import br.ufc.logger.Logger;

public class ConnectionFactory {
	
	private static final String TAG = ConnectionFactory.class.getName();
	 
	public static Connection getConnection(){
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(Config.URL, Config.USER, Config.PASSWORD);
			Logger.printLog(TAG, "Banco conectado com sucesso...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.printLog(TAG, "Banco não conectado...");
		}
		
		return connection;
	}
}
