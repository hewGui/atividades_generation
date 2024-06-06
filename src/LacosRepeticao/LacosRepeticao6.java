package LacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,  somaMult3=0, contMult3=0;
		float mediaMult3=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				somaMult3 = somaMult3 + numero;
				contMult3++;
			}
						
		}while (numero != 0);
		
		if(contMult3 > 0) {
		   mediaMult3 = (float)somaMult3 / contMult3;
		   System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", mediaMult3);
		}else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}
		
		
		
	}

}
