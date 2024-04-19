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
    TipoDePrenda zapato = new TipoDePrenda(Categoria.CALZADO);
    Producto cueroLisoRojo = new Producto(Material.CUERO, Trama.LISA, rojo, null);

    System.out.println("Prueba: ");

    Prenda otraPrenda = new Prenda(zapato, cueroLisoRojo, null); //ITERACION 2
  }
}