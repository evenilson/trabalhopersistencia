package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.Date;

public class Pesquisador extends Funcionario {
	private String areaDeAtuacao;

	
	/*Criando construtores*/
	public Pesquisador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pesquisador(String nome, String endereco, String sexo, Date dataDeNascimento, String areaDeAtuacao) {
		this(0, nome, endereco, sexo, dataDeNascimento, areaDeAtuacao);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(int id, String nome, String endereco, String sexo, Date dataDeNascimento, String areaDeAtuacao) {
		super(id, nome, endereco, sexo, dataDeNascimento);
		this.areaDeAtuacao = areaDeAtuacao;
		// TODO Auto-generated constructor stub
	}

	
	/*criando geters e seters*/
	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	/*Criando toString*/
	@Override
	public String toString() {
		return "Pesquisador [areaDeAtuacao=" + areaDeAtuacao + "]";
	}

	
	
	
	

	
}
