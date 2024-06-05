package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int codigo;
		float salario, novoSalario, reajuste;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Cargo | Cargo        |  Percentual do Reajuste ");
		System.out.println("     1 \t\t| Gerente      | 	10%");
		System.out.println("     2 \t\t| Vendedor     | 	7%");
		System.out.println("     3 \t\t| Supervisor   | 	9%");
		System.out.println("     4 \t\t| Motorista    | 	6%");
		System.out.println("     5 \t\t| Estoquista   | 	5%");
		System.out.println("     6 \t\t| Tecnico de TI|        8%");

		System.out.println("\nInforme o Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("Informe o código do seu cargo: ");
		codigo = leia.nextInt();
		System.out.println("Informe o Salário atual do colaborador: ");
		salario = leia.nextFloat();
		
		switch (codigo) {

		case 1:
			reajuste = (float) 0.10;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Gerente \nSalário: R$%.2f",nome, novoSalario);
			break;
		case 2:
			reajuste = (float) 0.07;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Vendedor \nSalário: R$%.2f",nome, novoSalario);
			break;
		case 3:
			reajuste = (float) 0.09;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Supervisor \nSalário: R$%.2f",nome, novoSalario);
			break;
		case 4:
			reajuste = (float) 0.06;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Motorista \nSalário: R$%.2f",nome, novoSalario);
			break;
		case 5:
			reajuste = (float) 0.05;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Estoquista \nSalário: R$%.2f",nome, novoSalario);
			break;
		case 6:
			reajuste = (float) 0.08;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do Colaborador: %s \nCargo: Técnico de TI \nSalário: R$%.2f",nome, novoSalario);
			break;
		default:
			System.out.println("\nOpção Inválida!");
		}
		
	}

}
