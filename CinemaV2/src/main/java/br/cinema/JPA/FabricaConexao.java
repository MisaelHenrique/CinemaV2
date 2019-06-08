package br.cinema.JPA;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//essa classe cria a conexão com o banco
public class FabricaConexao {
	
	static Connection conn = null;

	public static Connection getConnection() throws CinemaDAOException {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String user = "root";
			String senha = "";
			return DriverManager.getConnection("jdbc:mysql://localhost/cinema", user, senha);
		} catch (Exception ex) {
			// essa linha chama o construtor da classe
			throw new CinemaDAOException(ex.getMessage());
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {

		close(conn, stmt, null);

	}

	public static void closeConnection(Connection conn, Statement stmt) throws CinemaDAOException {

		close(conn, stmt, null);

	}

//----------------------------------------------------------------------------------------------------------------------------------------------


	private static void close(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {

		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		} catch (Exception ex) {
			throw new CinemaDAOException(ex.getMessage());
		}
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------


}
