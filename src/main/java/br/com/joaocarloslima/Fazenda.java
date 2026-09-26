package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro = new Celeiro(30, 1, 1,1);

    public Fazenda (){
        for(int i = 0; i < 13; i++){
            for(int j = 0; j < 13; j++){
                terrenos.add(new Terreno(i, j));
            }
        }
    }

    public void plantarBatata(int x, int y){
        if(celeiro.getQtdeBatatas() != 0){
            if(!getTerreno(x,y).estaOcupado()){
                Batata batata = new Batata(1, 0, 4);
                getTerreno(x,y).plantar(batata);
                celeiro.consumirBatata();
            }
        }
    }

    public void plantarMorango(int x, int y){
        if(celeiro.getQtdeMorangos() != 0){
            if(!getTerreno(x,y).estaOcupado()){
                Morango morango = new Morango(1, 0, 4);
                getTerreno(x,y).plantar(morango);
                celeiro.consumirMorango();
            }
        }
    }

    public void plantarCenoura(int x, int y){
        if(celeiro.getQtdeCenouras() != 0){
            if(!getTerreno(x,y).estaOcupado()){
                Cenoura cenoura = new Cenoura(1, 0, 4);
                getTerreno(x,y).plantar(cenoura);
                celeiro.consumirCenoura();
            }
        }
    }

    public Terreno getTerreno(int x, int y){return terrenos.get(x+13*y);}

    public void colher(int x, int y){
        getTerreno(x,y).colher(celeiro);
    }

    public Celeiro getCeleiro(){return celeiro;}
}
