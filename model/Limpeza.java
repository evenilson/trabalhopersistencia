package br.ufc.qxd.model;

import java.util.Date;
import java.util.List;

//@Table(name = "Limpeza")
public class Limpeza extends Funcionario {
	private String cargo;
	private int jornadaDeTrabalho;
	public Limpeza() {

	}
	
	public Limpeza(int id, String nome, String sexo, Date dataAniversario, float salario, Endereco endereco,int numeroDepartamento, List<Dependentes> dependentes, String cargo, int jornadaDeTrabalho) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento,dependentes);
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
				"Numero de departamento"+ this.getNumeroDepartamento()+ "Lista de dependentes"+ this.getDependentes() +
				"Cargo: " + cargo + ",Jornada De Trabalho: " + jornadaDeTrabalho;
	}
	
	
	
}
