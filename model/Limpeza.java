package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Limpeza extends Funcionario {

	private String cargo;
	private int jornadaDeTrabalho;
	public Limpeza() {

	}
	
	public Limpeza(int id, String nome, String sexo, String dataAniversario, float salario, List<Endereco> endereco,
			Departamento numeroDepartamento, List<Dependentes> dependentes, String cargo, int jornadaDeTrabalho) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento, dependentes);
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	public Limpeza(String nome, String sexo, String dataAniversario, float salario, String cargo, int jornadaDeTrabalho) {
		this(0, nome, sexo, dataAniversario, salario, null, null,null, cargo, jornadaDeTrabalho);
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
