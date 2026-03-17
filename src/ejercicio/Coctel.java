package ejercicio;

import java.util.ArrayList;

public class Coctel extends Bebida{
    private ArrayList<Bebida> ingredientes;

    public Coctel(String nombre, String marca, double precioBase, double calorias, Sabor sabor) {
        super(nombre, marca, 0.0, calorias, sabor);
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngredientes(Bebida ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public double getPrecioVenta() {
        double totalIngredientes = 0;
        for (Bebida bebida : ingredientes) {
            totalIngredientes += bebida.getPrecioVenta();
        }
        return totalIngredientes + 2.0;
    }
}
