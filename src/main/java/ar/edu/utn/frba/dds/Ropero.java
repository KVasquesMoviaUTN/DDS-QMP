package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;


public class Ropero {
  private List<Prenda> prendas;

  public Ropero() {
    this.prendas = new ArrayList<Prenda>();
  }

  public List<Prenda> prendasDelRopero() {
    return this.prendas;
  }

}
