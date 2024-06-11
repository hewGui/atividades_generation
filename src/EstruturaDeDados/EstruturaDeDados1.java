package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDeDados1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> filaClientes = new LinkedList<>();
		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\nMenu de Opções: ");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\nEscolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine(); // limpar buffer

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do Cliente: ");
				String nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " foi adicionado à fila!");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila de clientes está vazia.");
				} else {
					System.out.println("\nClientes na fila: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				} else {
					String clienteAtendido = filaClientes.poll();
					System.out.println("\nCliente " + clienteAtendido + " foi chamado.");
				}
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida. Tente novamente.");
			}

		} while (opcao != 0);

	}

}
