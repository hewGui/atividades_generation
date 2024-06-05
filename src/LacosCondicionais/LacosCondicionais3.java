package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, confirmacao;
		int idade;
		boolean primeiraVez = false;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do Doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do Doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? Sim ou Não ");
		leia.nextLine();
		confirmacao = leia.nextLine();

		if(confirmacao.equalsIgnoreCase("Sim")) {
			primeiraVez = true;
		}
			
		if(idade >=18 && idade<=69) {
			if(idade >=60 && idade <=69 && primeiraVez == true) {
				System.out.printf("%s não está apto para doar sangue ", nome);				
			}else {
				System.out.printf("%s está apto para doar sangue", nome);
			}
		}else {
			System.out.printf("%s não está apto para doar sangue", nome);
		}
				
	}

}
