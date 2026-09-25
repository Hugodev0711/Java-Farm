package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro (int capacidade, int qtdeBatatas, int qtdeCenouras, int qtdeMorangos){
        this.capacidade = capacidade;
        this.qtdeBatatas = qtdeBatatas;
        this.qtdeCenouras = qtdeCenouras;
        this.qtdeMorangos = qtdeMorangos;
    }

    public int getCapacidade() {return capacidade;}
    public int getQtdeBatatas() {return qtdeBatatas;}
    public int getQtdeCenouras() {return qtdeCenouras;}
    public int getQtdeMorangos() {return qtdeMorangos;}

    public void armazenarBatata(){
        if(!celeiroCheio()){
            qtdeBatatas +=2;
        }
    }

    public void armazenarCenoura(){
        if(!celeiroCheio()){
            qtdeCenouras += 2;
        }
    }

    public void armazenarMorango(){
        if(!celeiroCheio()){
            qtdeMorangos += 2;
        }
    }

    public void consumirBatata(){
        if(!(qtdeBatatas == 0)){
            qtdeBatatas =- 1;
        }
    }

    public void consumirCenoura(){
        if(!(qtdeCenouras == 0)){
            qtdeCenouras =- 1;
        }
    }
    public void consumirMorango(){
        if(!(qtdeMorangos == 0)){
            qtdeMorangos =- 1;
        }
    }

    public int getEspacoDisponivel(){
        int armazenado = qtdeBatatas + qtdeMorangos + qtdeCenouras;
        return armazenado - capacidade;
    }

    public int getOcupacao(){
        int armazenado = qtdeBatatas + qtdeMorangos + qtdeCenouras;
        double porcentagemD = (armazenado - capacidade)/(0.15 * 100);
        int porcentagem = (int)porcentagemD;
        return porcentagem;
    }

    public boolean celeiroCheio(){
        int armazenado = qtdeBatatas + qtdeMorangos + qtdeCenouras;
        if(armazenado == capacidade){
            return true;
        }
        return false;
    }
}
