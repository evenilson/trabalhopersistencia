package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.Date;

public abstract class Funcionario {
	private int id;
	private String nome;
	private String endereco;
	private String sexo;
	private Date dataDeNascimento;
	
	/*Construindo construtor*/
	public Funcionario() {
	
	}
	
	public Funcionario( String nome, String endereco, String sexo, Date dataDeNascimento) {
		this(0, nome, endereco, sexo, dataDeNascimento);
	}
	
	public Funcionario(int id, String nome, String endereco, String sexo, Date dataDeNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
	}

	/*Construindo os geters e seters*/
	
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	/*Construindo toString*/

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", sexo=" + sexo
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
	}	
}
