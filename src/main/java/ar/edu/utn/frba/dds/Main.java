package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.prenda.Color;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Material;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.prenda.Producto;
import ar.edu.utn.frba.dds.prenda.TipoDePrenda;
import ar.edu.utn.frba.dds.prenda.Trama;

/**
 .com
 */
public class Main {
  /**
  .com
   */
  public static void main(String[] args) {
    Color rojo = new Color(255, 0, 0);
    Producto cueroLisoRojo = new Producto(Material.CUERO, Trama.LISA, rojo, null);

    Prenda prenda = new Prenda(TipoDePrenda.ZAPATO, cueroLisoRojo, Formalidad.FORMAL);

    System.out.println(prenda);

  }
}