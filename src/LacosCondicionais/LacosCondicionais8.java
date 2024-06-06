package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1, numero2, resultado;
		int codigo;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Código | Operação  ");
		System.out.println("   1    | Soma  ");
		System.out.println("   2    | Subtração  ");
		System.out.println("   3    | Multiplicação  ");
		System.out.println("   4    | Divisão  ");
		System.out.println("\nInforme o primeiro valor: ");
		numero1 = leia.nextFloat();
		System.out.println("\nInforme o segundo valor: ");
		numero2 = leia.nextFloat();
		System.out.println("\nInforme o código da operação que deseja realizar: ");
		codigo = leia.nextInt();
		
		
		switch(codigo) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println(numero1+" + "+numero2+" = "+resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println(numero1+" - "+numero2+" = "+resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println(numero1+" * "+numero2+" = "+resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println(numero1+" / "+numero2+" = "+resultado);
			break;
		default:
				System.out.println("Opção Inválida!");
			
		}

	}

}
