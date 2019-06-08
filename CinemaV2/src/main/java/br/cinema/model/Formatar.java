package br.cinema.model;

public interface Formatar {

	public String cpf(String num, String mascara);

	public String cnpj(String num, String mascara);

	public String fone(String num, String mascara);

	public String cep(String num, String mascara);

	boolean validCpf(String num);

}
