package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);
		ArrayList<String> cores = new ArrayList();
		
		
		System.out.println("Digite 5 cores: ");
		for (int i=0; i < 5; i++) {
			System.out.println("Cor " +(i+1) + " : ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nCores adicionadas: "+cores);
		
		ArrayList<String> coresOrdenadas = new ArrayList(cores);
		Collections.sort(coresOrdenadas);
		
		System.out.println("\nOrdenar as cores: ");
		for (String cor : coresOrdenadas) {
			System.out.println(cor);
		}
	}

}
