package br.ufc.qxd.persistencia.trabalho_02_jpa.controle;

import java.util.List;

import javax.persistence.PersistenceException;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.EnderecoDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.FuncionarioDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.LimpezaDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.PesquisadorDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.EnderecoJPADAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.FuncionarioJPADAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.LimpezaJPADAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.PesquisadorJPADAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Endereco;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Funcionario;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Limpeza;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Pesquisador;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Secretario;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.*;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.SecretarioDAO;;


public class FuncionarioControle {
	
	public void adicionarPesquisador(String nome, String rua, int numeroCasa, String cidade,String bairro, String estado,
			String sexo, String dataAniversario, float salario, String areaDeAtuacao,String horasTrabalhadas) {
		EnderecoDAO enderecoDAO = new EnderecoJPADAO();
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();

		Endereco enderecoFuncionario = new Endereco(rua, numeroCasa, cidade, bairro , estado);

		Pesquisador pesquisador = new Pesquisador( nome, sexo, dataAniversario, salario, areaDeAtuacao, horasTrabalhadas);
		pesquisador.addEndereco(enderecoFuncionario);

		try {
			enderecoDAO.beginTransaction();
			enderecoDAO.save(enderecoFuncionario);
			enderecoDAO.commit();

			pesquisadorDAO.beginTransaction();
			pesquisadorDAO.save(pesquisador);
			pesquisadorDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			enderecoDAO.rollback();
			pesquisadorDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				enderecoDAO.close();
				pesquisadorDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void adicionarSecretario(String nome, String rua, int numeroCasa, String cidade,String bairro, String estado
			, String sexo,String dataAniversario, float salario, String grauEscolaridade) {
		EnderecoDAO enderecoDAO = new EnderecoJPADAO();
		SecretarioDAO secretarioDAO = new SecretarioJPADAO();

		Endereco enderecoFuncionario = new Endereco(rua, numeroCasa, cidade, bairro , estado);

		Secretario secretario = new Secretario(nome, sexo, dataAniversario, salario, grauEscolaridade);
		secretario.addEndereco(enderecoFuncionario);

		try {
			enderecoDAO.beginTransaction();
			enderecoDAO.save(enderecoFuncionario);
			enderecoDAO.commit();

			secretarioDAO.beginTransaction();
			secretarioDAO.save(secretario);
			secretarioDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			enderecoDAO.rollback();
			secretarioDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				enderecoDAO.close();
				secretarioDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void adicionarFuncionarioLimpeza(String nome,  String rua, int numeroCasa, String cidade,String bairro, 
			String estado, String sexo, String dataAniversario, float salario, String cargo, int jornadaDeTrabalho) {
		EnderecoDAO enderecoDAO = new EnderecoJPADAO();
		LimpezaDAO limpezaDAO = new LimpezaJPADAO();

		Endereco enderecoFuncionario = new Endereco(rua, numeroCasa, cidade, bairro , estado);

		Limpeza limpeza = new Limpeza(nome, sexo, dataAniversario, salario, cargo, jornadaDeTrabalho);
		limpeza.addEndereco(enderecoFuncionario);

		try {
			enderecoDAO.beginTransaction();
			enderecoDAO.save(enderecoFuncionario);
			enderecoDAO.commit();

			limpezaDAO.beginTransaction();
			limpezaDAO.save(limpeza);
			limpezaDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			enderecoDAO.rollback();
			limpezaDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				enderecoDAO.close();
				limpezaDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removerFuncionario(int id) {
		FuncionarioDAO funcionarioDAO = new FuncionarioJPADAO();

		try {
			funcionarioDAO.beginTransaction();

			funcionarioDAO.delete(funcionarioDAO.find(id));

			funcionarioDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			funcionarioDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				funcionarioDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Funcionario> buscarTodosOsFuncionarios() {
		FuncionarioDAO funcionarioDAO = new FuncionarioJPADAO();

		return funcionarioDAO.findAll();
	}

	public Funcionario buscarFuncionarioPorNumero(int id) {
		FuncionarioDAO funcionarioDAO = new FuncionarioJPADAO();

		return funcionarioDAO.find(id);
	}

}
