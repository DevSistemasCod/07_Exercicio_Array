package entidades;

public class Pedido {
	private int codigo;
	private String[] itens;
	private double[] valores;

	public Pedido(int codigo, String[] itens, double[] valores) {
		this.codigo = codigo;
		this.itens = itens;
		this.valores = valores;
	}

	public int getCodigo() {
		return codigo;
	}

	public String[] getItens() {
		return itens;
	}

	public double[] getValores() {
		return valores;
	}
}
