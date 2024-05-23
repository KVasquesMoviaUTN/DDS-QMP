package ar.edu.utn.frba.dds.motores;

import ar.edu.utn.frba.dds.ropero.Atuendo;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Prenda;

import java.util.List;

public class MotorSugerenciasFormalidad extends MotorSugerencias {
  private List<Prenda> prendasValidas(List<Prenda> prendas, Integer edad) {
    return edad > 55 ? prendas.stream().filter(p -> p.getFormalidad() == Formalidad.FORMAL).toList() : prendas;
  }
  /**
   * Llama a generarSugerencias pasando las prendas ya filtradas
   .com
   */
  public List<Atuendo> generarSugerenciasFormalesCon(List<Prenda> prendas, Integer edad, Double temperature) {
    return generarSugerenciasCon(prendasValidas(prendas, edad), edad, temperature);
  }
}