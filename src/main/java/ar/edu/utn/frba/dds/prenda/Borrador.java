package ar.edu.utn.frba.dds.prenda;

import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.prenda.Producto;
import ar.edu.utn.frba.dds.prenda.TipoDePrenda;

import static java.util.Objects.requireNonNull;

/**
 .com
 */
public class Borrador {
  private TipoDePrenda tipoDePrenda;
  private Producto producto;
  private Formalidad formalidad;


  public void especificarTipoDePrenda(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
  }

  public void especificarProductos(Producto producto) {
    this.producto = requireNonNull(producto, "Debe especificar los materiales");
  }

  public void especificarFormalidad(Formalidad formalidad) {
    this.formalidad = formalidad;
  }

  public Prenda crearPrenda() {
    return new Prenda(tipoDePrenda, producto, formalidad);
  }
}
