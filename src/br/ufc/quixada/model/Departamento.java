package br.ufc.quixada.model;

public class Departamento {

	private int id;
	private String nome;


	/*Criando construtores*/
	public Departamento() {

	}

	public Departamento(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	/*Criando geters e seters*/
	public Departamento(String nome) {
		this(0, nome);
	}

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

	/*Criando toString*/
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + "]";
	}
}
