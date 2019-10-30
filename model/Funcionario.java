package br.ufc.qxd.persistencia.trabalho_02_jpa.model;



import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario{

	/**
	 * 
	 */
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="funcionario_id")
	private int id;
	private String nome;
	private String sexo;
	private String dataAniversario;
	private float salario;
	@ManyToMany
	private List<Endereco> enderecos;
	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento numeroDepartamento;
	
	@OneToMany(mappedBy="funcionario")
	private List<Dependentes> dependentes;

	public Funcionario() {

	}

	

	public Funcionario(int id, String nome, String sexo, String dataAniversario, float salario,
			List<Endereco> enderecos, Departamento numeroDepartamento, List<Dependentes> dependentes) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.enderecos = enderecos;
		this.numeroDepartamento = numeroDepartamento;
		this.dependentes = dependentes;
	}



	public Funcionario(String nome, String sexo, String dataAniversario, float salario) {
		this(0,nome,sexo,dataAniversario,salario,null,null,null);
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

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}



	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}



	public Departamento getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(Departamento numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public List<Dependentes> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependentes> dependentes) {
		this.dependentes = dependentes;
	}
	
	public void addEndereco(Endereco endereco) {
		enderecos.add(endereco);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario=" + dataAniversario
				+ ", salario=" + salario + ", enderecos=" + enderecos + ", numeroDepartamento=" + numeroDepartamento
				+ ", dependentes=" + dependentes + "]";
	}
	
}
