package entidades;

public class Aluno {
    private String nome;
    private int numero;
    private float[] notas;
    
    //Construtor   
    public Aluno(String nome, int numero, float[] notas) {
        this.nome = nome;
        this.numero = numero;
        this.notas = notas;
    }
    
    //Calcular a média
    public float calcularMedia() {
        float soma = 0, media;
        
        for (float nota : notas) {
            soma = (soma + nota);
        }
        
        media = (soma / notas.length);
        return media;
    }
    
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public float[] getNotas() {
        return notas;
    }
    
    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    public String toString() {
        return "Nome: " + nome + ", Número: " + numero + ", Média: " + calcularMedia();
    }
}
