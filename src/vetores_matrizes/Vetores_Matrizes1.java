package vetores_matrizes;

import java.util.Scanner;

public class Vetores_Matrizes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = {2,5,1,3,4,9,7,8,10,6};
		int numeroProcurado, x;
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		
		for(x = 0; x < numeros.length; x++) { // o numeros.length significa o tamanho do vetor, nesse caso "x < numeros.length;" é o equivalente a "x < 10" pois meu vetor tem 9 posições.
			if(numeros[x] == numeroProcurado) {
				encontrado = true;
				System.out.println("O número "+numeroProcurado+" está localizado na posição: "+x);
				break;
			}
			
		} 
		
		if(!encontrado) {
			System.out.println("O número "+numeroProcurado+" não foi encontrado!");
		}
		
	}

}
