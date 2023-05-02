package entidades;

public class Venda {
	private int numero;
	private String modelo;
	private double valor;
	private String vendedor;
	private int[] parcelas;

	//Construtor
	public Venda(int numero, String modelo, double valor, String vendedor, int[] parcelas) {
		this.numero = numero;
		this.modelo = modelo;
		this.valor = valor;
		this.vendedor = vendedor;
		this.parcelas = parcelas;
	}

	//Método para calcular as parcelas com base no nro de parcelas
	public int[] calcularParcelas(int numParcelas) {
		int[] valoresParcelas;
		double valorParcela;
		
		valoresParcelas = new int[numParcelas];
		valorParcela = (valor / numParcelas);
		//Math.round usada para arredondar o valor da parcela
		for (int i = 0; i < numParcelas; i++) {
			valoresParcelas[i] = (int) Math.round(valorParcela);
		}
		
		return valoresParcelas;
	}

	
	//Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
	//implementação do método toString
	@Override
	public String toString() {
		return "Venda: " + numero + " - Carro: " + modelo + ", Valor: R$" + valor + ", Vendedor: " + vendedor;
	}
}
