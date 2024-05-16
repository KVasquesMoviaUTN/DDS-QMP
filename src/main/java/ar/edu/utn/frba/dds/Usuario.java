package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.motores.MotorSugerencias;
import ar.edu.utn.frba.dds.motores.MotorSugerenciasFormalidad;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.servicios.ServicioMetereologico;
import java.time.Duration;
import java.util.List;

public class Usuario {
  private Integer edad;
  private MotorSugerencias motorSugerencias;
  private MotorSugerenciasFormalidad motorSugerenciasFormalidad;
  private ServicioMetereologico servicioMetereologico;
  private Ropero ropero;

  public Usuario(Integer edad, String ciudad) {
    this.servicioMetereologico = new ServicioMetereologico(Duration.ofHours(3), ciudad);
    this.edad = edad;
  }

  public List<Atuendo> generarSugerenciasConRopero(Ropero ropero, Formalidad formalidad, ServicioMetereologico servicioMetereologico) {
    if (formalidad == Formalidad.FORMAL) {
      return motorSugerenciasFormalidad.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad, servicioMetereologico.obtenerClimaCadaCiertoTiempo());
    }
    return motorSugerencias.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad, servicioMetereologico.obtenerClimaCadaCiertoTiempo());
  }

}