package entidades;


public class Lanchonete {
	private Pedido[] pedidos;

	public Lanchonete(int capacidade) {
		pedidos = new Pedido[capacidade];
	}

	public void fazerPedido(Pedido pedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				break;
			}
		}
	}

	public Pedido buscarPedido(int codigo) {
		for (Pedido pedido : pedidos) {
			if (pedido != null && pedido.getCodigo() == codigo) {
				return pedido;
			}
		}
		return null;
	}

	public void listarPedidos() {
		for (Pedido pedido : pedidos) {
			if (pedido != null) {
				System.out.println("Código: " + pedido.getCodigo());
				System.out.print("Itens: ");
				for (String item : pedido.getItens()) {
					System.out.print(item + " ");
				}
				System.out.print("\nValores: ");
				for (double valor : pedido.getValores()) {
					System.out.print(valor + " ");
				}
				System.out.println("\n");
			}
		}
	}
}