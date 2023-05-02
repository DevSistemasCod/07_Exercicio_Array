package entidade;

import java.util.Arrays;

public class Produto {
    private String nome;
    private double preco;
    private int[] quantidadeProduto;

    public Produto(String nome, double preco, int[] quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeProduto = quantidade;
    }

    public void adicionarProduto(int codigo) {
        for (int i = 0; i < quantidadeProduto.length; i++) {
            if (quantidadeProduto[i] == 0) {
                quantidadeProduto[i] = codigo;
                break;
            }
        }
    }

    public void removerProduto(int posicao) {
        if (sePosicaoValida(posicao)) {
            quantidadeProduto[posicao] = 0;
        }
    }

    private boolean sePosicaoValida(int posicao) {
        if (posicao < 0 || posicao >= quantidadeProduto.length) {
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
                ", \nQuantidade de Produto: " + quantidadeProduto.length + 
                " \nCodigos: "+ Arrays.toString(quantidadeProduto) + "";
    }
}