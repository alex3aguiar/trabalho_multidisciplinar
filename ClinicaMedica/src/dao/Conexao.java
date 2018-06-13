package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection con;

	public Connection conexao() {
		String url = "jdbc:mysql://localhost:3306/clinica";
		String usuario = "root";
		String senha = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("conectado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
