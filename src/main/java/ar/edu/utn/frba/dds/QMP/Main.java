package ar.edu.utn.frba.dds.QMP;

import static ar.edu.utn.frba.dds.QMP.Categoria.*;
import static ar.edu.utn.frba.dds.QMP.Material.*;
import static ar.edu.utn.frba.dds.QMP.Trama.*;

public class Main {
    public static void main(String args[]){
        Color rojo = new Color(255,0,0);
        TipoDePrenda zapato = new TipoDePrenda(CALZADO);
        Materiales cueroLisoRojo = new Materiales(CUERO,LISA,rojo);

        System.out.println("Prueba: ");

        Prenda unaPrenda = new Prenda(zapato, CUERO, rojo, null, ESTAMPADO);
        Prenda otraPrenda = new Prenda(zapato, cueroLisoRojo, null);//ITERACION 2

        System.out.println("tonalidad de rojo: " + unaPrenda.color);
        System.out.println("tipoDePrenda: " + unaPrenda.tipoDePrenda);
        System.out.println("material: " + unaPrenda.material);
    }
}