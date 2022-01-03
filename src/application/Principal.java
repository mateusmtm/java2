package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Paciente;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		System.out.printf("Digite a altura: ");
		double altura = sc.nextDouble();
		Paciente paciente1 = new Paciente(peso, altura);
		System.out.println(paciente1.diagnostico());
		System.out.println();
				
		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.printf("Digite a altura: ");
		altura = sc.nextDouble();
		Paciente paciente2 = new Paciente(peso, altura);
		System.out.println(paciente2.diagnostico());
		System.out.println();
		
		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.printf("Digite a altura: ");
		altura = sc.nextDouble();
		Paciente paciente3 = new Paciente(peso, altura);
		System.out.println(paciente3.diagnostico());

		sc.close();
	}

}
