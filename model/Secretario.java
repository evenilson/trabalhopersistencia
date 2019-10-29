package br.ufc.qxd.persistencia.trabalho_02_jpa.model;


import java.util.List;

import javax.persistence.Entity;


@Entity
public class Secretario extends Funcionario{

	private String grauDeEscolaridade;

	public Secretario() {
		super();

	}
	public Secretario(String grauDeEscolaridade) {
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	public Secretario(int id, String nome, String sexo, String dataAniversario, float salario, List<Endereco> endereco,
			Departamento numeroDepartamento, List<Dependentes> dependentes) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento, dependentes);

	}

	public Secretario(String nome, String sexo, String dataAniversario, float salario) {
		this(0,nome, sexo, dataAniversario, salario, null, null ,null);		
	}

	public String getGralDeEscolaridade() {
		return grauDeEscolaridade;
	}

	public void setGralDeEscolaridade(String gralDeEscolaridade) {
		this.grauDeEscolaridade = gralDeEscolaridade;
	}

	@Override
	public String toString() {
		return "Secretario Nome:"+this.getNome()+ "Sexo: "+ this.getSexo()+ "Data de nascimento"+
				this.getDataAniversario()+ "Salario"+ this.getSalario()+ "Endereço: "+this.getSalario()+
				"Numero de departamento"+ this.getNumeroDepartamento()+ "Grau de excolaridade"+this.grauDeEscolaridade;
	}









}
