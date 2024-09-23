package br.com.fiap.robocupbet.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	 private final String ORACLE_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
			 	ORACLE_USER = "", //coloque o usuario
			 	ORACLE_PASSWORD = ""; //coloque o password
	 
	 public Connection getConnection() {
		 try {
			 return DriverManager.getConnection(ORACLE_URL, ORACLE_USER, ORACLE_PASSWORD);
		 } catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return null;
	 }
}