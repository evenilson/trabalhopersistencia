package br.ufc.qxd.model;

import java.util.Date;
import java.util.List;



//@Table(name = "Pesquisador")

public class Pesquisador extends Funcionario {
	private String areaDeAtuacao;
	private String horasTrabalhadas;

	/*@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(name = "post_tag",
	joinColumns = @JoinColumn(name = "pesq_id"),
	inverseJoinColumns = @JoinColumn(name = "pro_id")
			)*/
	private List<Projetos> projetos;

	public Pesquisador() {

	}

	public Pesquisador(int id, String nome, String sexo, Date dataAniversario, float salario, Endereco endereco,int numeroDepartamento, List<Dependentes> dependentes,String areaDeAtuacao, String horasTrabalhadas, List<Projetos> projetos) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento,dependentes);
		this.areaDeAtuacao = areaDeAtuacao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.projetos = projetos;
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
				"Numero de departamento"+ this.getNumeroDepartamento()+ "Lista de dependentes"+ this.getDependentes() +
				" Area De Atuacao: " + areaDeAtuacao + ", Horas Trabalhadas: " + horasTrabalhadas + ", Projetos:"
				+ projetos ;
	}









}
