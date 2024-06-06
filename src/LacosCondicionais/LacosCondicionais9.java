package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo;
		float saldo = 1000, saque,deposito;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tOPERAÇÕES DISPONIVEIS ");
		System.out.println("\n Código | Operação  ");
		System.out.println("   1    | Saldo  ");
		System.out.println("   2    | Saque  ");
		System.out.println("   3    | Depósito  ");
		System.out.println("\nDigite o código da operação que deseja realizar: ");
		codigo = leia.nextInt();
		
		
		switch(codigo) {
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("\nO seu saldo atual: R$%.2f", saldo);
			break;
		case 2:
			System.out.println("\nOperação - Saque");
			System.out.printf("\nInforme o valor que deseja sacar: ");
			saque = leia.nextFloat();
			if(saque > saldo) {
				System.out.println("\nO seu saldo é insuficiente para realizar este saque!");
				break;	
			}else {
				System.out.println("\nSaque realizado!");
				saldo = saldo - saque;
				System.out.printf("\nO seu saldo atual é: R$ %.2f", saldo);
				break;
			}	
		case 3:
			System.out.println("\nOperação - Depósito");
			System.out.println("\nInforme o valor que deseja depositar");
			deposito = leia.nextFloat();
			saldo = saldo + deposito;
			System.out.printf("\nO seu saldo atual é: R$ %.2f", saldo);
			break;
		default:
				System.out.println("Operação Inválida");
		}


		

	}

}
