package br.ufc.quixada.model;

import java.util.Date;
import java.util.List;

public class Secretario extends Funcionario {
	
	private String grauDeEscolaridade;

	
	
	public Secretario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretario(int id, String nome, String endereco, String sexo, String dataDeNascimento,
			List<Endereco> enderecos) {
		super(id, nome, endereco, sexo, dataDeNascimento, enderecos);
		// TODO Auto-generated constructor stub
	}

	public Secretario(String nome, String endereco, String sexo, String dataDeNascimento) {
		super(nome, endereco, sexo, dataDeNascimento);
		// TODO Auto-generated constructor stub
	}

	public String getGrauDeEscolaridade() {
		return grauDeEscolaridade;
	}

	public void setGrauDeEscolaridade(String grauDeEscolaridade) {
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	@Override
	public String toString() {
		return "Secretario [grauDeEscolaridade=" + grauDeEscolaridade + "]";
	}
	
	
	
	

}
