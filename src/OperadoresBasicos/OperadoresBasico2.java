package OperadoresBasicos;

import java.util.Scanner;

public class OperadoresBasico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, MediaFinal;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		MediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Sua média final é: %.1f ",MediaFinal);
		

	}

}
