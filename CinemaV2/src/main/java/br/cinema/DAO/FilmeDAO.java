package br.cinema.DAO;

import java.util.List;

import br.cinema.model.Filme;

public interface FilmeDAO {

	public void saveFilme(Filme filme);

	public boolean filme(int id);

	public List<Filme> getFilmes();

	public void updateFilme(Filme filme);

}
