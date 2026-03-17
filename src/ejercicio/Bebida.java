package ejercicio;

public class Bebida {

    private String nombre;
    private String marca;
    private double precioBase;
    private Double calorias;
    private Sabor sabor;

    private static int totalBebidasServidas = 0;
    private static double recaudacionTotalBar = 0.0;


    public Bebida(String nombre, String marca, double precioBase, double calorias, Sabor sabor) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.calorias = calorias;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public static int getTotalBebidasServidas() {
        return totalBebidasServidas;
    }

    public static void setTotalBebidasServidas(int totalBebidasServidas) {
        Bebida.totalBebidasServidas = totalBebidasServidas;
    }

    public static double getRecaudacionTotalBar() {
        return recaudacionTotalBar;
    }

    public static void setRecaudacionTotalBar(double recaudacionTotalBar) {
        Bebida.recaudacionTotalBar = recaudacionTotalBar;
    }

    public double getPrecioVenta() {
        return precioBase;
    }

    public static void registrarVenta (double monto){
        totalBebidasServidas++;
        recaudacionTotalBar += monto;
    }
}
