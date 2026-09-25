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

    public void crescer(){
        tempoDeVida+=1;

        if(tempoDeVida == tempoDeCrescimento){
            tempoDeVida = 0;
            if(tamanho != 4){
                tamanho += 1;
            }
        }
    }

    public boolean podeColher(){
        if(tamanho == 4){
            return true;
        }
        return false;
    }

    public String getImagem(){return "images/cenoura" + tamanho + ".png";}
}
