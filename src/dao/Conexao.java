package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection getConexao() {
		String url = "jdbc:mysql://localhost/faculdade";
		String user = "root";
		String password = "root";
		Connection conexao = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return conexao;

	}

}
   