package LacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0){
				soma = soma + numero;
			}
			
		}while (numero != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
	}

}
