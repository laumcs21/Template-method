package co.edu.uniquindio.poo;

// Clase abstracta que define el método de plantilla para preparar una bebida
public abstract class Bebida {

    // Método plantilla que define los pasos para preparar la bebida
    public final void preparar() {
        calentarAgua();
        agregarIngrediente();
        verterEnTaza();
        agregarCondimentos();
    }

    // Métodos abstractos que deben ser implementados por las subclases
    abstract void agregarIngrediente();

    abstract void agregarCondimentos();

    // Métodos comunes que pueden ser reutilizados por todas las subclases
    void calentarAgua() {
        System.out.println("Calentando agua...");
    }

    void verterEnTaza() {
        System.out.println("Vertiendo en taza...");
    }
}
