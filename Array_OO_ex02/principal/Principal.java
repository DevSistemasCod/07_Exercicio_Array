package principal;

import java.util.Scanner;

import entidades.Venda;

public class Principal {
    public static void main(String[] args) {
    	int[] parcelas;
    	int quantidadeParcelas, numeroDaVenda, posicaoParcela;
    	double valorCarro;
    	String nomeVendedor, modeloDoCarro;
    	
    	Scanner lerDados = new Scanner(System.in);
    	
    	System.out.println("Informe o nome do Vendedor: ");
    	nomeVendedor =  lerDados.next();
    	
    	System.out.println("Informe o modelo do Carro: ");
    	modeloDoCarro =  lerDados.next();
    	
    	System.out.println("Informe o valor do Carro: ");
    	valorCarro =  lerDados.nextDouble();
    	
    	System.out.println("Informe o número de Parcelas: ");
    	quantidadeParcelas =  lerDados.nextInt();
    	parcelas = new int[quantidadeParcelas];

    	System.out.println("Informe o número da Venda: ");
    	numeroDaVenda =  lerDados.nextInt();
    	
    	Venda venda = new Venda(numeroDaVenda, modeloDoCarro, valorCarro, nomeVendedor, parcelas);
        
        // imprime informações da venda
        System.out.println(venda.toString());
        
        // calcula e imprime valores das parcelas
        int[] valoresParcelas = venda.calcularParcelas(parcelas.length);
        System.out.print("Parcelas e Valores: ");
        for (int i = 0; i < valoresParcelas.length; i++) {
            posicaoParcela = i+1;
        	System.out.print("\n"+ posicaoParcela + " R$ " + valoresParcelas[i] + " ");
        }
        
        lerDados.close();
    }
}
