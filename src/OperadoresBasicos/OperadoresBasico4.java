package OperadoresBasicos;

import java.util.Scanner;

public class OperadoresBasico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:  ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:  ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número:  ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número:  ");
		n4 = leia.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: "+calculo);

		

	}

}
