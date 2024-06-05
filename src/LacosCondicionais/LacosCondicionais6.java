package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigo, qtd;
		float preco, valorTotal;

		Scanner leia = new Scanner(System.in);

		System.out.println("\t\t\t Cardápio \t\t\t");
		System.out.println("\n1 - Cachorro-Quente R$10,00");
		System.out.println("\n2 - X-Salada R$15,00");
		System.out.println("\n3 - X-Bacon 18,00");
		System.out.println("\n4 - Bauru R$12,00");
		System.out.println("\n5 - Refrigerante R$8,00");
		System.out.println("\n6 - Suco de Laranja R$13,00");

		System.out.println("\nInforme o código do produto:     ");
		codigo = leia.nextInt();
		System.out.println("Informe a quantidade que deseja: ");
		qtd = leia.nextInt();

		switch (codigo) {

		case 1:
			preco = (float) 10.0;
			valorTotal = qtd * preco;
			System.out.printf("Produto: Cachorro-Quente \nValor Total: R$ %.2f", valorTotal);
			break;
		case 2:
			preco = (float) 15.00;
			valorTotal = qtd * preco;
			System.out.printf("Produto: X-Salada \nValor Total: R$ %.2f", valorTotal);
			break;
		case 3:
			preco = (float) 18.0;
			valorTotal = qtd * preco;
			System.out.printf("Produto: X-Bacon \nValor Total: R$ %.2f", valorTotal);
			break;
		case 4:
			preco = (float) 12.0;
			valorTotal = qtd * preco;
			System.out.printf("Produto: Bauru \nValor Total: R$ %.2f", valorTotal);
			break;
		case 5:
			preco = (float) 8.0;
			valorTotal = qtd * preco;
			System.out.printf("Produto: Refrigerante \nValor Total: R$ %.2f", valorTotal);
			break;
		case 6:
			preco = (float) 13.0;
			valorTotal = qtd * preco;
			System.out.printf("Produto: Suco de Laranja \nValor Total: R$ %.2f", valorTotal);
			break;
		default:
			System.out.println("Opção Inválida");
		}

	}

}
