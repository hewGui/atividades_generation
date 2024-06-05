package OperadoresBasicos;

import java.util.Scanner;

public class OperadoresBasico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float SalarioBruto, AdcNoturno, HorasExtras, Descontos, SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do Salário Bruto:  ");
		SalarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno:  ");
		AdcNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das Horas Extras:  ");
		HorasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos Descontos:  ");
		Descontos = leia.nextFloat();
		
		SalarioLiquido = SalarioBruto + AdcNoturno + (HorasExtras * 5) - Descontos;
		
		System.out.printf("Seu Salário Liquido será: %.2f  ",SalarioLiquido);
		

	}

}
