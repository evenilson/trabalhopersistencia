package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Endereco {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="endereco_id")
	private int id;
	private String rua;
	private int numeroCasa;
	private String cidade;
	private String bairro;
	private String estado;
	@ManyToMany
	@JoinTable(
			name="funcionario_endereco",
			joinColumns=
				@JoinColumn(name="endereco_id", 
				referencedColumnName="endereco_id"),
			inverseJoinColumns =
				@JoinColumn(name="funcionario_id", 
				referencedColumnName="funcionario_id")
			)
	private List<Funcionario> Funcionario;

	public Endereco() {

	}
	
	
	
	public Endereco(int id, String rua, int numeroCasa, String cidade, String bairro, String estado,
			List<Funcionario> funcionario) {
		super();
		this.id = id;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		Funcionario = funcionario;
	}
	
	public Endereco( String rua, int numeroCasa, String cidade, String bairro, String estado) {
		super();
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;

	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	public List<Funcionario> getFuncionario() {
		return Funcionario;
	}



	public void setFuncionario(List<Funcionario> funcionario) {
		Funcionario = funcionario;
	}



	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", cidade=" + cidade + ", bairro="
				+ bairro + ", estado=" + estado + ", Funcionario=" + Funcionario + "]";
	}

}
