//package br.cinema.JPA;
//
//import java.sql.Connection;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
////essa classe cria a conexão com o banco
//public class FabricaConexao {
//	
//	static Connection conn = null;
//
//	//public static Connection {
//
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			String user = "root";
//			String senha = "";
//			//return DriverManager.getConnection("jdbc:mysql://localhost/cinema", user, senha);
//		} catch (Exception ex) {
//			// essa linha chama o construtor da classe
//		}
//	}
////----------------------------------------------------------------------------------------------------------------------------------------------
//
//	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
//
//		//close(conn, stmt, null);
//
//	}
//
//	public static void closeConnection(Connection conn, Statement stmt)  {
//
//		//close(conn, stmt, null);
//
//	}
//
////----------------------------------------------------------------------------------------------------------------------------------------------
//
//
//	private static void close(Connection conn, Statement stmt, ResultSet rs) {
//
//		try {
//			if (conn != null)
//				conn.close();
//			if (stmt != null)
//				stmt.close();
//			if (rs != null)
//				rs.close();
//		} catch (Exception ex) {
//			
//		}
//	}
//	
////----------------------------------------------------------------------------------------------------------------------------------------------
//
//
//}
