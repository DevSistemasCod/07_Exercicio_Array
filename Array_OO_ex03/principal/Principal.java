package principal;

import java.util.Scanner;

import entidade.Produto;

public class Principal {
       public static void main(String[] args) {
       	String nomeProduto;
	Scanner lerDados = new Scanner(System.in);   
	double preco;
	int quantidadeProduto;
	int []vetorProduto;
	
	System.out.println("Informe o nome do Produto: ");
	nomeProduto = lerDados.next();
		
	System.out.println("Informe o preco do Produto: ");
	preco = lerDados.nextDouble();
		
	System.out.println("Informe a quantidade de Produtos: ");
	quantidadeProduto = lerDados.nextInt(); 
	vetorProduto = new int[quantidadeProduto];
		
	Produto produto = new Produto(nomeProduto, preco, vetorProduto);

        	for(int i = 0; i < vetorProduto.length; i++) {
        		System.out.printf("Informe o codigo do item[%d]: ",i);
        		produto.adicionarProduto(lerDados.nextInt());
        	}
        	System.out.println(produto.toString());
        
        	System.out.println("Para remover informe a posicao do item: ");
        	produto.removerProduto(lerDados.nextInt());
        	System.out.println(produto.toString());
        
        	lerDados.close();
     }
}
