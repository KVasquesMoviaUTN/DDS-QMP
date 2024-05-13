package ar.edu.utn.frba.dds.prenda;

import ar.edu.utn.frba.dds.prenda.Categoria;

/**
 .com
 */
public enum TipoDePrenda {
  ZAPATO(Categoria.CALZADO),
  REMERA(Categoria.PARTE_SUPERIOR),
  POLLERA(Categoria.PARTE_INFERIOR);

  private final Categoria categoria;//

  /**
   .com
   */
  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;//
  }

  public Categoria getCategoria() {
    return categoria;
  }


}
