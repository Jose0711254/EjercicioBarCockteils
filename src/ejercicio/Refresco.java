package ejercicio;

public class Refresco extends Bebida {

    private Double nivelCafeina;

    public Refresco(String nombre, String marca, double precioBase, double calorias, Sabor sabor, Double nivelCafeina) {
        super(nombre, marca, precioBase, calorias, sabor);
        this.nivelCafeina = nivelCafeina;
    }

    public Double getNivelCafeina() {
        return nivelCafeina;
    }

    public void setNivelCafeina(Double nivelCafeina) {
        this.nivelCafeina = nivelCafeina;
    }
}
