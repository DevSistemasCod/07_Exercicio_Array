package exemplosComArray;

import java.util.Scanner;

public class CalculoMediaDeNotas {
	
	public static float calcularMedia(float nota_1, float nota_2, float nota_3) {
		float media=0;
	
		media = (nota_1 + nota_2 + nota_3)/3;
		return media;
	}

	public static void main(String[] args) {
		float []arrayNotas;
		float nota1, nota2, nota3; 
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de Alunos: ");
		arrayNotas = new float [lerDados.nextInt()];
		
		for(int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Para o aluno[%d] : ",i);
			System.out.println("\nInforme a Nota 1: ");
			nota1 = lerDados.nextFloat();
			System.out.println("Informe a Nota 2: ");
			nota2 = lerDados.nextFloat();
			System.out.println("Informe a Nota 3: ");
			nota3 = lerDados.nextFloat();
			arrayNotas[i] = calcularMedia(nota1, nota2, nota3);
		}
		
		for(int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Media do Aluno[%d]: %.2f \n",i ,arrayNotas[i]);
		}
		
		lerDados.close();
	}
}
