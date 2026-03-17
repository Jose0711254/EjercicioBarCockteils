package ejercicio;

public class Combinado extends Bebida {

    private Bebida alcohol;
    private Bebida mezclador;

    public Combinado(String nombre, String marca, double calorias, Sabor sabor, Bebida alcohol, Bebida mezclador) {
        super(nombre, marca, 0.0, calorias, sabor);
        this.alcohol = alcohol;
        this.mezclador = mezclador;
    }

    @Override
    public double getPrecioVenta() {
        double sumaPrecios = alcohol.getPrecioVenta() + mezclador.getPrecioVenta();
        return sumaPrecios * 1.1;
    }
}
