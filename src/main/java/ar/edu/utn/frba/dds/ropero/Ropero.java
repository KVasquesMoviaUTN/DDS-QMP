package ar.edu.utn.frba.dds.ropero;

import ar.edu.utn.frba.dds.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;


public class Ropero {
  private List<Prenda> prendas;
  private List<Propuesta> propuestas;


  public Ropero() {
    this.prendas = new ArrayList<Prenda>();
    this.propuestas = new ArrayList<Propuesta>();
  }

  public List<Prenda> prendasDelRopero() {
    return this.prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public void agregarPropuesta(Propuesta propuesta) {
    this.propuestas.add(propuesta);
  }

  public void eliminarPropuesta(Propuesta propuesta) {
    this.propuestas.remove(propuesta);//Por ahora se borra, en un futuro se puede hacer una baja lógica instead
  }

  public List<Propuesta> mostrarPropuestas() {
    return this.propuestas;
  }

  public List<Propuesta> mostrarPropuestasAgregar() {
    return this.mostrarPropuestas().stream().filter(Propuesta::isAgregar).toList();
  }

  public List<Propuesta> mostrarPropuestasEliminar() {
    return this.mostrarPropuestas().stream().filter(Propuesta::isAgregar).toList();
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    if (propuesta.isAgregar()) {
      this.agregarPrenda(propuesta.getPrenda());
    } else {
      this.quitarPrenda(propuesta.getPrenda());
    }
  }

}
