package vetores_matrizes;

import java.util.Scanner;

public class Vetores_Matrizes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[10];
		int x, soma=0;
		float media=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		for(x = 0; x < numeros.length; x++) {
			System.out.println("Informe o " +(x+1)+"° numero: ");
			numeros[x] = leia.nextInt();
			soma = soma + numeros[x];
			
		} media = (float)soma / numeros.length;;
		
		
		StringBuilder elementosImpares = new StringBuilder(); //um objeto "StringBuilder" chamado "ElementosImpares" é criado para construir a string de saida
		elementosImpares.append("Elementos nos índices ímpares: "); //é informado uma string inicial "Elementos nos índices ímpares: " e adicionada ao StringBuilder
			
		for (x = 0; x < numeros.length; x++) {
			if(x % 2 != 0) {
				elementosImpares.append(numeros[x]).append(" "); //Se o índice x for ímpar apos a verificação do if o valor que está dentro deste indice é adicionado ao StringBuilder, seguido de um espaço. 
				//Ex: Se o valor dentro do índice 1 (que é impar) for 4, a string começara a ser construida da seguinte forma ("Elementos nos índices ímpares: 4 "), no próximo numero que se encaixar na condição do if tera um espaço apos o 4 e dps ele será adicionado. 
			}
		}
		
		StringBuilder elementosPares = new StringBuilder();
		elementosPares.append("Elementos pares: ");
		
		for(x = 0; x <numeros.length; x++) {
			if(numeros[x] % 2 == 0) {
				elementosPares.append(numeros[x]).append(" ");
			}
		}
		
		System.out.println(elementosImpares.toString().trim()); //O conteudo do StringBuilder é convertido para String e o metodo trim() é utilizado para remover qualquer espaço extra no final da String.
		System.out.println(elementosPares.toString().trim());
		System.out.println("Soma: "+soma);
		System.out.printf("Média: %.2f ",media);
		
	}

}
