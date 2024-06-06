package LacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contPares = 0, contImpares = 0;
		int numero;

		Scanner leia = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {
			System.out.printf("Digite o " + x + "º número: ");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}

		}
		System.out.println("\nTotal de números pares: " + contPares);
		System.out.println("\nTotal de números impares: " + contImpares);
	}

}
