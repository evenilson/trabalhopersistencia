package br.ufc.quixada.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "Pesquisador.findAll", query ="from Pesquisador" )
})

public class Pesquisador extends Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String areaDeAtuacao;


	/*Criando construtores*/
	public Pesquisador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(String nome, String endereco, String sexo, String dataDeNascimento, String areaDeAtuacao) {
		this(0, nome, endereco, sexo, dataDeNascimento, areaDeAtuacao);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(int id, String nome, String endereco, String sexo, String dataDeNascimento, String areaDeAtuacao) {
		super(id, nome, endereco, sexo, dataDeNascimento, null);
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

