package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

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

	public Secretario(String nome, String sexo, String dataAniversario, float salario, String grauDeEscolaridade) {
		super(nome, sexo, dataAniversario, salario);
		this.grauDeEscolaridade = grauDeEscolaridade;

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
