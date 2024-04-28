package co.edu.uniquindio.poo;

public class Te extends Bebida {
    @Override
    void agregarIngrediente() {
        System.out.println("Agregando hojas de té...");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando limón...");
    }
}