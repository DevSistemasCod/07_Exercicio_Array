package exemplosComArray;

import java.util.Scanner;

public class OrdenarArray {
	public static void main(String[] args) {
		int []arrayNumeros;
		int trocaAux = 0;
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números: ");
		arrayNumeros = new int [lerDados.nextInt()];
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.printf("Informe o numero de posição[%d]: ",i);
			arrayNumeros[i] = lerDados.nextInt();
		}
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			for(int j = i + 1; j < arrayNumeros.length; j++) {
				if(arrayNumeros[i] > arrayNumeros[j]) {
					trocaAux = arrayNumeros[i];
					arrayNumeros[i] = arrayNumeros[j];
					arrayNumeros[j] = trocaAux;
				}
			}
		}
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		lerDados.close();
	}
}
