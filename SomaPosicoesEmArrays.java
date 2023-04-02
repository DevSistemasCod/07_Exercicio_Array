package exemplosComArray;

import java.util.Scanner;

public class SomaPosicoesEmArrays {
	public static void main(String[] args) {
		int []arrayNumeros; 
		int totalSoma = 0; 
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números que serão somados: ");
		arrayNumeros = new int[lerDados.nextInt()];
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.printf("Informe o número de posição[%d]: ",i);
			arrayNumeros[i] = lerDados.nextInt(); 
			totalSoma = totalSoma + arrayNumeros[i];
		}
		
		System.out.printf("Valor da Soma: %d",totalSoma);
		lerDados.close();
	}
}
