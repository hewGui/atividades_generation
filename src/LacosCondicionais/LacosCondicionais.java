package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A, B, C, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		A = leia.nextInt();
		System.out.println("Informe o segundo valor: ");
		B = leia.nextInt();
		System.out.println("Informe o terceiro valor: ");
		C = leia.nextInt();
		
		resultado = A + B;
		
		
		if(resultado > C) {
			System.out.println(A+" + "+B+" = "+resultado+ " > "+C);
			System.out.printf("A Soma de A + B é Maior que C");
		}else if(resultado < C) {
			System.out.println(A+" + "+B+" = "+resultado+ " < "+C);
			System.out.printf("A Soma de A + B é Menor que C");	
		}else if(resultado == C) {
			System.out.println(A+" + "+B+" = "+resultado+ " = "+C);
			System.out.printf("A Soma de A + B é Igual a C");
		}
	}

}
