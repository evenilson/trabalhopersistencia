package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Pesquisador extends Funcionario {

	private String areaDeAtuacao;
	private String horasTrabalhadas;
	
	@ManyToMany(mappedBy="pesquisador")
	private List<Projetos> projetos;

	public Pesquisador() {

	}

	public Pesquisador(String areaDeAtuacao, String horasTrabalhadas, List<Projetos> projetos) {
		this.areaDeAtuacao = areaDeAtuacao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.projetos = projetos;
	}

	public Pesquisador(int id, String nome, String sexo, String dataAniversario, float salario, List<Endereco> endereco,
			Departamento numeroDepartamento, List<Dependentes> dependentes, String areaDeAtuacao, String horasTrabalhadas, List<Projetos> projetos) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento, dependentes);
		this.areaDeAtuacao = areaDeAtuacao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.projetos = projetos;
	}

	public Pesquisador(String nome, String sexo, String dataAniversario, float salario, String areaDeAtuacao, String horasTrabalhadas) {
		this(0,nome, sexo, dataAniversario, salario,null,null, null, areaDeAtuacao, horasTrabalhadas, null);
	}



	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public List<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projetos> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Pesquisado  Nome:"+this.getNome()+ "Sexo: "+ this.getSexo()+ "Data de nascimento"+
				this.getDataAniversario()+ "Salario"+ this.getSalario()+ "Endereço: "+this.getSalario()+
				"Numero de departamento"+ this.getNumeroDepartamento()+ 
				" Area De Atuacao: " + areaDeAtuacao + ", Horas Trabalhadas: " + horasTrabalhadas + ", Projetos:"
				+ projetos ;
	}









}
