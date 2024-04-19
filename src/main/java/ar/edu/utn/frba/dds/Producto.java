package ar.edu.utn.frba.dds;

import java.util.Objects;

/**
 .com
 */
public class Producto {
  //hola
  public Material material;
  public Trama trama;
  public Color color;
  public Color colorSecundario;

  /**
   .com
   */
  public Producto(Material material, Trama trama, Color color, Color colorSecundario) {
    this.material = Objects.requireNonNull(material, "Necesito un material");
    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
    this.color = Objects.requireNonNull(color, "Necesito un color");
    this.colorSecundario = colorSecundario;
  }
}
