package ar.edu.utn.frba.dds;

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

    Prenda prenda = new Prenda(TipoDePrenda.ZAPATO, cueroLisoRojo, null);

    System.out.println(prenda);

  }
}