package br.cinema.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Filme;

public class FilmeBD implements FilmeDAO {
	
	private Connection conn = null;
	
	public FilmeBD(Connection conn) {

		try {
			conn = FabricaConexao.getConnection();
		} catch (CinemaDAOException e) {
			e.printStackTrace();
		}
	}

	// private Connection

	public void saveFilme(Filme filme) {
		String sql = "INSERT INTO tab_filme	values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	public boolean filme(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Filme> getFilmes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFilme(Filme filme) {
		// TODO Auto-generated method stub
		
	}

}
