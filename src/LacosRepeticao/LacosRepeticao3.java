package LacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int idadeMenor=0, idadeMaior=0, idade;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {			

			if(idade < 21) {				
				idadeMenor++;
				
			}else if (idade > 50) {
				idadeMaior++;				
			}
		
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();	
		} System.out.println("\nTotal de pessoas menores de 21 anos: "+idadeMenor);
		  System.out.println("\nTotal de pessoas maiores de 50 anos: "+idadeMaior);

	}

}
