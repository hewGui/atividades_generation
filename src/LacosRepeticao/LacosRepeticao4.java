package LacosRepeticao;

import java.util.Scanner;

public class LacosRepeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, idGenero, pessoaDev;
		int totalPessoasDevBack=0, totalMulheresFront=0, totalHomensMobile40=0, totalPessoasNB30=0, totalPessoas=0;
		float mediaIdade=0, somaIdade=0;
		String confirmacao;
		boolean continuar = true;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		while(continuar != false) {
			
			System.out.println("\nInforme a idade do Colaborador(a): ");
			idade = leia.nextInt();
			
			
			System.out.println("\t\t Identidade de Gênero \t");
			System.out.println("\n1 - Mulher Cis");
			System.out.println("\n2 - Homem Cis");
			System.out.println("\n3 - Não Binário");
			System.out.println("\n4 - Mulher Trans");
			System.out.println("\n5 - Homem Trans");
			System.out.println("\n6 - Outros");
			System.out.println("\nInforme o código que corresponde a identidade de Genero: ");
			idGenero = leia.nextInt();
			
			System.out.println("\t\t Pessoa Desenvolvedora \t");
			System.out.println("\n1 - Backend");
			System.out.println("\n2 - Frontend");
			System.out.println("\n3 - Mobile");
			System.out.println("\n4 - FullStack");
			System.out.println("\nInforme o código que corresponde ao cargo do Colaborador: ");
			pessoaDev = leia.nextInt();
			
			if(pessoaDev == 1) {
				totalPessoasDevBack++;
			}
			if((idGenero == 1 || idGenero == 4) && pessoaDev == 2){ //Os operadores lógicos tbm tem precedência, então é necessário usar parênteses para garantir que as condições sejam avaliadas corretamente.
				totalMulheresFront++;
				
			}
			if((idGenero == 2 || idGenero == 5) && idade > 40 && pessoaDev == 3) {
				totalHomensMobile40++;
			}
			if(idGenero == 3 && pessoaDev == 4 && idade < 30) {
				totalPessoasNB30++;
			}
			
			somaIdade = somaIdade + idade;
			
			totalPessoas++;
			
			mediaIdade = somaIdade / totalPessoas;
			
			
			System.out.println("\nDeseja continuar? Sim ou Não ");
			leia.nextLine();
			confirmacao = leia.nextLine();

			if(confirmacao.equalsIgnoreCase("Sim")) {
				continuar = true;
			}else {
				continuar = false;
			}
						
					
		} 
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+totalPessoasDevBack);
		System.out.println("\nTotal de mulheres Cis e Trans desenvolvedoras Frontend: "+totalMulheresFront);
		System.out.println("\nTotal de homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+totalHomensMobile40);
		System.out.println("\nTotal de pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+totalPessoasNB30);
		System.out.println("\nO número total de pesssoas que responderam à pesquisa: "+totalPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f",mediaIdade);
		
		System.out.println("\nPesquisa Encerrada!");	
		
		
		
	}

}
