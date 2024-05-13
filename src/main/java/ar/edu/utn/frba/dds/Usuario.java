package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.motores.MotorSugerencias;

import java.util.List;

public class Usuario {
  private Integer edad;
  private MotorSugerencias motorSugerencias;
  private Ropero ropero;
  public List<Atuendo> generarSugerenciasConRopero(Ropero ropero) {
    return motorSugerencias.generarSugerenciasCon(ropero.prendasDelRopero(), this.edad);
  }

}
