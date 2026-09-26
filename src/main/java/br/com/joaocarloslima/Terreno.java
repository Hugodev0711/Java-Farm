package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;

    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plantar(Batata batata) {
        if(!estaOcupado()) {
            this.batata = batata;
        }
        else {
            throw new RuntimeException("Terreno Ocupado");
        }
    }

    public void plantar(Cenoura cenoura) {
        if(!estaOcupado()) {
            this.cenoura = cenoura;
        }
        else {
            throw new RuntimeException("Terreno Ocupado");
        }
    }

    public void plantar(Morango morango) {
        if(!estaOcupado()) {
            this.morango = morango;
        }
        else {
            throw new RuntimeException("Terreno Ocupado");
        }
    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public void colher(Celeiro celeiro) {
        if(batata.podeColher() && !celeiro.celeiroCheio()) {
            celeiro.armazenarBatata();
        }
        else if (morango.podeColher() && celeiro.celeiroCheio()) {
            celeiro.armazenarMorango();
        }
        else if (cenoura.podeColher() && celeiro.celeiroCheio()) {
            celeiro.armazenarCenoura();
        }
    }
}
