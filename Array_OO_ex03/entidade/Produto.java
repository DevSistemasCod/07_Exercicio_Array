package entidade;

import java.util.Arrays;

public class Produto {
   private String nome;
    private double preco;
    private int quantidade;
    private int[] vetorcDeCodigo;

    public Produto(String nome, double preco, int[] vetorcDeCodigo, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.vetorcDeCodigo = vetorcDeCodigo;
    }

    public void adicionarProduto(int codigo) {
        for (int i = 0; i < vetorcDeCodigo.length; i++) {
            if (vetorcDeCodigo[i] == 0) {
            	vetorcDeCodigo[i] = codigo;
                break;
            }
        }
    }

    public void removerProduto(int posicao) {
        if (sePosicaoValida(posicao)) {
        	vetorcDeCodigo[posicao] = 0;
        }
    }

    private boolean sePosicaoValida(int posicao) {
        if (posicao < 0 || posicao >= vetorcDeCodigo.length) {
            System.out.println("Posicao inválido.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nNome: '" + nome + '\'' +
                ", \nPreco: " + preco +
                ", \nQuantidade de Produto: " + quantidade + 
                " \nCodigos: "+ Arrays.toString(vetorcDeCodigo) + "";
    }
}
