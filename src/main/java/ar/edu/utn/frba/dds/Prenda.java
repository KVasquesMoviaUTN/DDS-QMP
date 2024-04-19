package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

/**
 .com
 */
public class Prenda {
  public TipoDePrenda tipoDePrenda;
  public Color colorSecundario;
  public Producto productos;

  /**
   .com
   */
  public Prenda(TipoDePrenda tipoDePrenda, Producto productos, Color colorSecundario) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
    this.productos = requireNonNull(productos, "Debe especificar los materiales");
    this.colorSecundario = colorSecundario;
  }
}