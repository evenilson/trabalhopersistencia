package br.ufc.qxd.model;

import java.util.Date;
import java.util.List;


//@Table(name = "Secretario")
public class Secretario extends Funcionario{
	
	private String grauDeEscolaridade;
		
	public Secretario() {
		super();

	}

	public Secretario(int id, String nome, String sexo, Date dataAniversario, float salario, Endereco endereco,int numeroDepartamento, String grauDeEscolaridade, List<Dependentes> dependentes) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento,dependentes);
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	public Secretario( String nome, String sexo, Date dataAniversario, float salario, Endereco endereco,int numeroDepartamento, String grauDeEscolaridade,List<Dependentes> dependentes) {
		super(0, nome, sexo, dataAniversario, salario, endereco,numeroDepartamento,dependentes);
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
				"Numero de departamento"+ this.getNumeroDepartamento()+ "Lista de dependentes"+ this.getDependentes() + "Grau de excolaridade"+this.grauDeEscolaridade;
	}
	
	
	

	
	
	
	

}
