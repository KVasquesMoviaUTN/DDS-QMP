package ar.edu.utn.frba.dds.prenda;

import static java.util.Objects.requireNonNull;

/**
 .com
 */
public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Color colorSecundario;
  private Producto producto;
  private Formalidad formalidad;
  private Integer temperaturaMaximaAdecuada;

  /**
   .com
   */
  public Prenda(TipoDePrenda tipoDePrenda, Producto producto, Formalidad formalidad) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
    this.producto = requireNonNull(producto, "Debe especificar los materiales");
  }

  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

  public Formalidad getFormalidad() {
    return this.formalidad;
  }

  public Integer getTemperaturaMaximaAdecuada() {
    return this.temperaturaMaximaAdecuada;
  }
}