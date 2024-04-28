package co.edu.uniquindio.poo;

public class Cafe extends Bebida {
    @Override
    void agregarIngrediente() {
        System.out.println("Agregando café molido...");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche...");
    }
}