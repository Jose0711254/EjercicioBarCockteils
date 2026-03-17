package ejercicio;

import java.util.ArrayList;

public class Mixologo extends Camarero {

    ArrayList<Coctel> cartaEspecialidades;
    public Mixologo(String nombre, String fechaNacimiento, double salarioBase, double propinasAcumuladas, ArrayList<Coctel> cartaEspecialidades) {

        super(nombre, fechaNacimiento, salarioBase, propinasAcumuladas);
        this.cartaEspecialidades = new ArrayList<>();
    }

    @Override
    public void servir(Bebida b) {
        if (b instanceof Coctel) {
            double precio = b.getPrecioVenta();
            Bebida.registrarVenta(precio);

            this.propinasAcumuladas += precio * 0.1;

            System.out.println("Soy " + getNombre() + " y te he servido " + b.getNombre() + " por " + precio + "€.");
        }else{
            super.servir(b);
        }
    }
}
