package exemplosComArray;

import java.util.Arrays;
import java.util.Scanner;

public class VerificaTempEmArrays {
	public static void main(String[] args) {
		float []arrayDeTemperaturas; 
		int tamanhoDoArray;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de temperatura de entrada:  ");
		tamanhoDoArray = lerDados.nextInt();
		arrayDeTemperaturas = new float[tamanhoDoArray];
		
		for(int i = 0; i < arrayDeTemperaturas.length; i++) {
			System.out.printf("Informe a temperatura[%d]: ",i);
			arrayDeTemperaturas[i] = lerDados.nextFloat(); 
		}
		
		Arrays.sort(arrayDeTemperaturas);
		
		System.out.printf("Temperatura mais baixa: %.2f",arrayDeTemperaturas[0]);
		System.out.printf("\nTemperatura mais elevada: %.2f",arrayDeTemperaturas[tamanhoDoArray-1]);
		lerDados.close();
	}
}
