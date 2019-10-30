package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import javax.persistence.Entity;

@Entity
public class Limpeza extends Funcionario {

	private String cargo;
	private int jornadaDeTrabalho;
	public Limpeza() {

	}
	
	public Limpeza(String nome, String sexo, String dataAniversario, float salario, String cargo, int jornadaDeTrabalho) {
		super(nome, sexo, dataAniversario, salario);
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(int jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	@Override
	public String toString() {
		return  "Limpseza Nome:"+this.getNome()+ "Sexo: "+ this.getSexo()+ "Data de nascimento"+
				this.getDataAniversario()+ "Salario"+ this.getSalario()+ "Endereço: "+this.getSalario()+
				"Numero de departamento"+ this.getNumeroDepartamento()+
				"Cargo: " + cargo + ",Jornada De Trabalho: " + jornadaDeTrabalho;
	}
	
	
	
}
