package ar.edu.utn.frba.dds.prenda;

import java.util.Objects;

/**
 .com
 */
public class Producto {
  //hola
  private Material material;
  private Trama trama = Trama.LISA;
  private Color color;
  private Color colorSecundario;

  /**
   .com
   */
  public Producto(Material material, Trama trama, Color color, Color colorSecundario) {
    this.color = Objects.requireNonNull(color, "Necesito un color");
    this.colorSecundario = colorSecundario;

    this.material = Objects.requireNonNull(material, "Necesito un material");
    if (trama != null) {
      this.trama = trama;
    }
  }
}
