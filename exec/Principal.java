package br.ufc.qxd.persistencia.trabalho_02_jpa.exec;

import java.util.List;
import java.util.Scanner;

import br.ufc.qxd.persistencia.trabalho_02_jpa.controle.DepartamentoControle;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Departamento;


public class Principal {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		//System.out.println("Informe o nome do departamento: ");
		// inserir
		//String nome = scanner.nextLine();
		//DepartamentoControle.InserirDepartamento(nome);
		
		// remover
		//int id = scanner.nextInt();
		//DepartamentoControle.removerDepartamento(id);
		
		/* lista tudo
		List<Departamento> departamentos = new DepartamentoControle().buscarTodosOsDepartamentos();

		for (Departamento departamento : departamentos) {
			System.out.println(departamento);
		}
		*/
		
		/* lista por numero 
		System.out.println("Informe o numero do departamento: ");

		try {
			Integer numero = Integer.parseInt(scanner.nextLine());
			Departamento departamento = new DepartamentoControle().buscarDepartamentoPorNumero(numero);

			System.out.println(departamento);
		} catch (NumberFormatException e) {
			System.out.println("O numero informado não e valido!");
		}
		*/
		//System.out.println("Departamento salvo com sucesso");
		
		
		
		
	}
	
	
	
	
}
