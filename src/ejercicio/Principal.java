package ejercicio;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Refresco cola = new Refresco("Cola", "Coca-Cola", 2.5, 140.0, Sabor.DULCE, 35.0);
        Bebida ginebra = new Bebida("Ginebra", "Tanqueray", 5.0, 200.0, Sabor.AMARGO);
        Bebida tonica = new Bebida("Tónica", "Schweppes", 2.0, 80.0, Sabor.NEUTRO);
        Bebida ron = new Bebida("Ron", "Brugal", 4.0, 220.0, Sabor.DULCE);


        Camarero paco = new Camarero("Paco", "1983", 1200, 0.0);
        Mixologo elena = new Mixologo("Elena", "1999", 1200, 0.0, null);

        Coctel lagunaAzul = new Coctel("Laguna Azul", "Casa", 50.0, 350.0, Sabor.CITRICO);

        lagunaAzul.agregarIngredientes(ron);
        lagunaAzul.agregarIngredientes(cola);

        elena.cartaEspecialidades.add(lagunaAzul);

        System.out.println("El precio de " + lagunaAzul.getNombre() + " es " + lagunaAzul.getPrecioVenta());

        paco.servir(cola);

        Combinado gintonic = new Combinado("Gintonic", "Premium", 60.0, Sabor.AMARGO, ginebra, tonica);

        paco.servir(gintonic);

        elena.servir(lagunaAzul);

        System.out.println("---Sube el precio del Ron a 8.0€---");
        ron.setPrecioBase(8.0);

        elena.servir(lagunaAzul);

        System.out.println("---INFORME DE LA CAJA---");

        System.out.println("Bebidas totales servidas esta noche: " + Bebida.getTotalBebidasServidas());
        System.out.println("Recaudación total de la caja: " + Bebida.getRecaudacionTotalBar());
        System.out.println("Propinas de Paco: " + paco.propinasAcumuladas);
        System.out.println("Propinas de Elena: " + elena.propinasAcumuladas);


    }
}
