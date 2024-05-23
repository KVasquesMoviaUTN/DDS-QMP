package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.motores.MotorSugerencias;
import ar.edu.utn.frba.dds.motores.MotorSugerenciasFormalidad;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.ropero.Atuendo;
import ar.edu.utn.frba.dds.ropero.Propuesta;
import ar.edu.utn.frba.dds.ropero.Ropero;
import ar.edu.utn.frba.dds.servicios.ServicioMetereologico;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private Integer edad;
  private MotorSugerencias motorSugerencias;
  private MotorSugerenciasFormalidad motorSugerenciasFormalidad;
  private ServicioMetereologico servicioMetereologico;
  private List<Ropero> roperos;
  private List<Propuesta> propuestas;

  public Usuario(Integer edad, String ciudad) {
    this.servicioMetereologico = new ServicioMetereologico(Duration.ofHours(3), ciudad);
    this.edad = edad;
    this.roperos = new ArrayList<Ropero>();
    this.propuestas = new ArrayList<Propuesta>();
  }

  public List<Atuendo> generarSugerenciasConRopero(Ropero ropero, Formalidad formalidad, ServicioMetereologico servicioMetereologico) {
    if (formalidad == Formalidad.FORMAL) {
      return motorSugerenciasFormalidad.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad, servicioMetereologico.obtenerClimaCadaCiertoTiempo());
    }
    return motorSugerencias.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad, servicioMetereologico.obtenerClimaCadaCiertoTiempo());
  }

  public void agregarRopero(Ropero ropero) {
    this.roperos.add(ropero);
  }

  public void quitarRopero(Ropero ropero) {
    this.roperos.remove(ropero);
  }

  public void proponer(Propuesta propuesta, Ropero ropero) {
    ropero.agregarPropuesta(propuesta);
  }

  public void cancelarPropuesta(Propuesta propuesta, Ropero ropero) {
    ropero.mostrarPropuestas().remove(propuesta);
  }

  public List<Propuesta> verPropuestas(Ropero ropero) {
    return ropero.mostrarPropuestas();
  }

  public void aceptarPropuesta(Propuesta propuesta, Ropero ropero) {//TODO mejorar este método
    ropero.aceptarPropuesta(propuesta);
  }

}