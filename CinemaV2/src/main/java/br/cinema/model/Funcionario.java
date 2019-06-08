package br.cinema.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	//---------------------------------------------------------------------------------------------------------------------------
	public Funcionario(String cpf, String nome, String endereco, String fone, Date dtNascimento, String email) {
		super(cpf, nome, endereco, fone, dtNascimento, email);
		// TODO Auto-generated constructor stub
	}
	//---------------------------------------------------------------------------------------------------------------------------
	private String funcao;
	private Date data_admissao;
	private Date horario;
	private float salario;
	
	//---------------------------------------------------------------------------------------------------------------------------
	public float getSalario() {
		return salario;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setSalario(float salario) {
		this.salario = salario;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public String getFuncao() {
		return funcao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public Date getData_admissao() {
		return data_admissao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public Date getHorario() {
		return horario;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	//---------------------------------------------------------------------------------------------------------------------------

	

}
