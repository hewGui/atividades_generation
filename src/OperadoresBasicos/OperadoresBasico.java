package OperadoresBasicos;

import java.util.*;

public class OperadoresBasico {

	
	public static void main(String[] args) {
		
		float salario, abono, NovoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		NovoSalario = salario + abono;
				
		System.out.printf("O seu novo salário é: %.2f ",NovoSalario);		
		
	}
	
	
}
