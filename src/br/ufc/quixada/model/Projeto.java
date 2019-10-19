package br.ufc.quixada.model;

public class Projeto {
	private int id;
	private String nome;
	private String dataDeDesenvolvimento;
	
	
	/*Criando construtores*/
	public Projeto() {
		
	}
	
	public Projeto(int id, String nome, String dataDeDesenvolvimento) {
		this.id = id;
		this.nome = nome;
		this.dataDeDesenvolvimento = dataDeDesenvolvimento;
	}
	
	public Projeto(String nome, String dataDeDesenvolvimento) {
		this(0,nome, dataDeDesenvolvimento);
	}

	
	/*Contruindo geters e seters*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeDesenvolvimento() {
		return dataDeDesenvolvimento;
	}

	public void setDataDeDesenvolvimento(String dataDeDesenvolvimento) {
		this.dataDeDesenvolvimento = dataDeDesenvolvimento;
	}

	/*Crinado toString*/
	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", dataDeDesenvolvimento=" + dataDeDesenvolvimento + "]";
	}
	
	
}

