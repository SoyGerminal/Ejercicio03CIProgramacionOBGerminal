package es.germinal;

public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche(3);
        System.out.println("EL coche tiene: " + miCoche.puertas);
        miCoche.getPuertas(1);
        System.out.println("Ahora el coche tiene: " + miCoche.puertas);
        }
    }