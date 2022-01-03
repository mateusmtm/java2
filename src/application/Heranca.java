package application;

import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioComissionado;
import entities.FuncionarioComissionadoBase;

public class Heranca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.print("Digite o CPF do funcionário: ");
		String cpf = sc.nextLine();
		System.out.print("Digite o total de vendas do funcionário: ");
		double totalVendas = sc.nextDouble();
		System.out.print("Digite o percentual sob as vendas: ");
		double percentualSobVendas = sc.nextDouble();
		
		System.out.println();
		System.out.print("O funcionário recebe um valor base? (y/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			FuncionarioComissionadoBase emp;
			System.out.print("Digite o valor base: ");
			double valorBase = sc.nextDouble();
			emp = new FuncionarioComissionadoBase(nome, cpf, percentualSobVendas, totalVendas, valorBase);
			System.out.println();
			System.out.println("O total do salário é igual a: " + String.format("%.2f", emp.getSalario()));
		}else {
			FuncionarioComissionado emp;
			emp = new FuncionarioComissionado(nome, cpf, percentualSobVendas, totalVendas);
			System.out.println();
			System.out.println("O total do salário é igual a: " + String.format("%.2f", emp.getSalario()));

		}		
		
		
		sc.close();
	}

}
