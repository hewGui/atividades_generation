package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList();
		
		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("Digite o número que deseja encontrar: ");
		int numero = leia.nextInt();
		
		if(numeros.contains(numero)) {
			int posicao = numeros.indexOf(numero);
			System.out.println("O número "+numero+" foi encontrado na posição: "+posicao);
		}else
			System.out.println("O número "+numero+" não foi encontrado!");

	}

}
