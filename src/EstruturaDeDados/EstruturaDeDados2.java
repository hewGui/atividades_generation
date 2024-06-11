package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDeDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilhaLivros = new Stack<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			System.out.print("\nEscolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				String nomeLivro = leia.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("O livro " + nomeLivro + " foi adicionado a pilha.");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println("\nLivros na Pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("\nLivro " + livroRemovido + " foi retirado da pilha");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida");

			}

		} while (opcao != 0);

	}

}
