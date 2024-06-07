package vetores_matrizes;

import java.util.Scanner;

public class Vetores_Matrizes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int[3][3];
		int i, j, somaDiagonalPrincipal=0, somaDiagonalSecundaria=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite os elementos da Matriz");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				 System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
			
		}
		
		// Localizando e imprimindo na tela a  Diagonal Principal 
		
		StringBuilder diagonalPrincipal = new StringBuilder();
		diagonalPrincipal.append("\nElementos da Diagonal Principal: ");
		
		for(i = 0; i < 3; i++) {
			diagonalPrincipal.append((matriz[i][i])).append(" ");						
		
		} System.out.println(diagonalPrincipal.toString().trim());
		
		
		//Localizando e imprimindo na tela a Diagonal Secundaria
		
		StringBuilder diagonalSecundaria = new StringBuilder();
		diagonalSecundaria.append("\nElementos da Diagonal Secundária: ");
		
		for (i = 0; i < 3; i++) {
			diagonalSecundaria.append((matriz[i][2 - i])).append(" "); //nesta construção o meu primeiro colchete recebe o valor atual de i e meu segundo colchete recebe 2 - o valor atual de i. Ex:[0][2-0] caso seja o primeiro loop, pois eu quero que meu segundo colchete que seria a coluna comece na posição 2;
		}System.out.println(diagonalSecundaria.toString().trim());
		
		
		//localizando e imprimindo na tela as soma da diagonal Principal
		
		for (i = 0; i < 3; i++) {
		    somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][i];
		} System.out.println("Soma dos Elementos da Diagonal Principal: "+somaDiagonalPrincipal);
		
		
		//localizando e imprimindo na tela as soma da diagonal Secundária		
		
		for (i = 0; i < 3; i++) {
		    somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][2 - i];
		}System.out.println("Soma dos Elementos da Diagonal Secundária: "+somaDiagonalSecundaria);

	}

}
