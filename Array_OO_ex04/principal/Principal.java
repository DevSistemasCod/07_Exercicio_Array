package principal;

import java.util.Scanner;

import entidades.Lanchonete;
import entidades.Pedido;

public class Principal {
	public static void main(String[] args) {
		int capacidadeItens;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe o numero de itens: ");
		capacidadeItens = lerDados.nextInt();
		
		Lanchonete lanchonete = new Lanchonete(capacidadeItens);
		
		System.out.println("Informe o numero de iten: ");
		
		String[] itens1 = { "Dogão", "Batata Frita", "Coca-Cola" };
		double[] valores1 = { 18.0, 10.0, 8.0 };
		Pedido pedido1 = new Pedido(1, itens1, valores1);

		String[] itens2 = { "X-Salada", "Suco de Laranja" };
		double[] valores2 = { 12.0, 5.0 };
		Pedido pedido2 = new Pedido(2, itens2, valores2);

		lanchonete.fazerPedido(pedido1);
		lanchonete.fazerPedido(pedido2);

		Pedido pedidoEncontrado = lanchonete.buscarPedido(1);
		if (pedidoEncontrado != null) {
			System.out.println("Pedido encontrado: Código " + pedidoEncontrado.getCodigo());
			System.out.println("Itens:");
			for (String item : pedidoEncontrado.getItens()) {
				System.out.println(item);
			}
			System.out.println("Valores:");
			for (double valor : pedidoEncontrado.getValores()) {
				System.out.println(valor);
			}
		} else {
			System.out.println("Pedido não encontrado.");
		}
		lanchonete.listarPedidos();

	}
}
