package exemplosComArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArmazenarEOrdenaNomeEmArrays {
	public static void main(String[] args) {
		String[]arrayNomes;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de nome que serão cadastrados: ");
		arrayNomes = new String[lerDados.nextInt()];
		
		for(int i = 0; i < arrayNomes.length; i++) {
			System.out.printf("Informe o nome da posição[%d]: ",i);
			arrayNomes[i] = lerDados.next();
		}
		
		Arrays.sort(arrayNomes);
		for(String s : arrayNomes) {
			System.out.println(s);
		}
		
		lerDados.close();
	}
}
