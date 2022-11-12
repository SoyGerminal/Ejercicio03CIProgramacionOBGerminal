package es.germinal;

public class Coche {
    int puertas;


    public Coche (int puertas) {
        this.puertas = puertas;
    }
    public void getPuertas(int quantity) {
        this.puertas += quantity;
    }
}
