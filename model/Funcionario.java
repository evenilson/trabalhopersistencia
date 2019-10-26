package br.ufc.qxd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.*;


@Entity
@NamedQueries({
	@NamedQuery(name="Funcionario.findAll", query="from Funcionario"),

})
public abstract class Funcionario {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="funcionario_id")
	private int id;
	private String nome;
	private String sexo;
	private Date dataAniversario;
	private float salario;
	@ManyToMany(mappedBy="Funcionario")
	private Endereco endereco;
	private int numeroDepartamento;
	//@OneToMany(mappedBy="funcionario", fetch=FetchType.EAGER)
	private List<Dependentes> dependentes;

	public Funcionario() {
		this.id = 0;
		this.nome = null;
		this.sexo = null;
		this.dataAniversario = null;
		this.salario = 0;
		this.endereco = null;
		this.numeroDepartamento = 0;
		this.dependentes = null;
	}

	public Funcionario(int id, String nome, String sexo, Date dataAniversario, float salario, Endereco endereco,int numeroDepartamento, List<Dependentes> dependentes) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
		this.numeroDepartamento = numeroDepartamento;
		this.dependentes = new ArrayList<>();

	}

	public Funcionario(int id, String nome, String sexo, float salario, Endereco endereco,int numeroDepartamento,List<Dependentes> dependentes ) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;
		this.endereco = endereco;
		this.numeroDepartamento = numeroDepartamento;
		this.dependentes = new ArrayList<>();
	}

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

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public List<Dependentes> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependentes> dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario=" + dataAniversario
				+ ", salario=" + salario + ", endereco=" + endereco + ", numeroDepartamento=" + numeroDepartamento
				+ ", dependentes=" + dependentes + "]";
	}







}
