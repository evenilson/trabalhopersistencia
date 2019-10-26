package br.ufc.qxd.persistencia.trabalho_02_jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


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
	@ManyToOne
	private Funcionario funcionario;

	public Endereco() {

	}



	public Endereco(String rua, int numeroCasa, String cidade, String bairro, String estado) {
		this(0, rua, numeroCasa, cidade, bairro, estado, null);
	}



	public Endereco(int id, String rua, int numeroCasa, String cidade, String bairro, String estado,Funcionario funcionario) {
		this.id = id;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.funcionario = funcionario;
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



	public Funcionario getFuncionario() {
		return funcionario;
	}



	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", cidade=" + cidade + ", bairro="
				+ bairro + ", estado=" + estado + ", funcionario=" + funcionario + "]";
	}



}
