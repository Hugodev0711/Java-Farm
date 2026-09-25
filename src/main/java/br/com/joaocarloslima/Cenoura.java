package br.com.joaocarloslima;

public class Cenoura {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura(int tamanho, int tempoDeVida, int tempoDeCrescimento){
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public int getTamanho(){return tamanho;}
    public int getTempoDeVida(){return tempoDeVida;}
    public int getTempoDeCrescimento(){return tempoDeCrescimento;}
}
