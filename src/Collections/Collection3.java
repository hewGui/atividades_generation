package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);
		Set<Integer> listaNumeros = new HashSet<>();
		
		System.out.println("Digite 10 valores inteiros não repetidos");
		while(listaNumeros.size() < 10) {
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();
			if(listaNumeros.contains(numero)) {
				System.out.println("O número "+numero+" já foi digitado. Informe outro número.");
			}else {
				listaNumeros.add(numero);
			}
		}
		System.out.println("\nElementos do Set");
		Iterator<Integer> iterator = listaNumeros.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
