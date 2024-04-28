package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        System.out.println("Preparando café:");
        Bebida cafe = new Cafe();
        cafe.preparar();

        System.out.println("\nPreparando té:");
        Bebida te = new Te();
        te.preparar();
    }
}
