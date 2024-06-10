package vetores_matrizes;

import java.util.Scanner;

public class Vetores_Matrizes4 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo o número de participantes e bimestres (Constante)
        final int NUM_PARTICIPANTES = 10;
        final int NUM_BIMESTRES = 4;
        
        // Declarando a matriz de notas e o vetor de médias
        double[][] notas = new double[NUM_PARTICIPANTES][NUM_BIMESTRES];
        double[] medias = new double[NUM_PARTICIPANTES];
        
        // Lendo as notas dos participantes
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < NUM_BIMESTRES; j++) {
                System.out.print("Nota do " + (j + 1) + "º bimestre: ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        
        // Calculando as médias dos participantes
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            double soma = 0;
            for (int j = 0; j < NUM_BIMESTRES; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / NUM_BIMESTRES;
        }
        
        // Exibindo as médias dos participantes
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }
        
        
    }
}
