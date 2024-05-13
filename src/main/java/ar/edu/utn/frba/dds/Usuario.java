package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.motores.MotorSugerencias;
import ar.edu.utn.frba.dds.motores.MotorSugerenciasFormalidad;
import ar.edu.utn.frba.dds.prenda.Formalidad;

import java.util.List;

public class Usuario {
  private Integer edad;
  private MotorSugerencias motorSugerencias;
  private MotorSugerenciasFormalidad motorSugerenciasFormalidad;
  private Formalidad preferenciaFormalidad;

  private Ropero ropero;
  public List<Atuendo> generarSugerenciasConRopero(Ropero ropero) {
    if (this.preferenciaFormalidad == Formalidad.FORMAL) {
      return motorSugerenciasFormalidad.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad);
    }
    return motorSugerencias.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad);
  }

}