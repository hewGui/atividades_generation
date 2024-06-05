package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.printf("O número %d é par e positivo!", numero);
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.printf("O número %d é par e negativo!", numero);
		}else if(numero % 2 != 0 && numero > 0) {
			System.out.printf("O número %d é impar e positivo!", numero);
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.printf("O número %d é impar e negativo!", numero);
		}
		
	}

}
