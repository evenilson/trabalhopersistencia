package br.ufc.qxd.model;

import java.util.Date;


import javax.persistence.*;


@Entity
public class Dependentes {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDep;
	private String nomeDep;
	private String sexo;
	private Date dataNascimento;
	private String grauDeParentesco;
	
	
	private Funcionario funcionario;
	
	public Dependentes() {

	}
	
	public Dependentes(String nomeDep, String sexo, Date dataNascimento, String grauDeParentesco,Funcionario funcionario) {
		this(0, nomeDep, sexo, dataNascimento, grauDeParentesco,funcionario);
	}
	
	public Dependentes(int idDep, String nomeDep, String sexo, Date dataNascimento, String grauDeParentesco, Funcionario funcionario) {
		this.idDep = idDep;
		this.nomeDep = nomeDep;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauDeParentesco = grauDeParentesco;
		this.funcionario = funcionario;
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGrauDeParentesco() {
		return grauDeParentesco;
	}

	public void setGrauDeParentesco(String grauDeParentesco) {
		this.grauDeParentesco = grauDeParentesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependentes [idDep=" + idDep + ", nomeDep=" + nomeDep + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", grauDeParentesco=" + grauDeParentesco + ", funcionario=" + funcionario + "]";
	}
	
	
	
	
	
	
}
