package ejercicio;

public class Camarero extends Trabajador {

    protected double propinasAcumuladas;

    public Camarero(String nombre, String fechaNacimiento, double salarioBase, double propinasAcumuladas) {
        super(nombre, fechaNacimiento, salarioBase);
        this.propinasAcumuladas = 0.0;
    }

    public void servir(Bebida b) {
        if (!(b instanceof Coctel)) {

            double precio = b.getPrecioVenta();

            Bebida.registrarVenta(precio);

            double propina = precio * 0.05;
            this.propinasAcumuladas += propina;

            System.out.printf("Soy %s y te he servido %s por %.2f€\n",
                    this.getNombre(), b.getNombre(), precio);
        }
    }
}
