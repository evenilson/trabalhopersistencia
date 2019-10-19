package br.ufc.quixada.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

public abstract class Funcionario {
	private int id;
	private String nome;
	private List<Endereco> enderecos;
	private String sexo;
	private String dataDeNascimento;
	
	/*Construindo construtor*/
	public Funcionario() {
	
	}
	
	public Funcionario( String nome, String endereco, String sexo, String dataDeNascimento) {
		this(0, nome, endereco, sexo, dataDeNascimento, new ArrayList<>());
	}
	
	public Funcionario(int id, String nome, String endereco, String sexo, String dataDeNascimento, List<Endereco> enderecos) {
		this.id = id;
		this.nome = nome;
		this.enderecos = enderecos;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", enderecos=" + enderecos + ", sexo=" + sexo
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
	}
	

}

