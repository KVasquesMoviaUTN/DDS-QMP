package ar.edu.utn.frba.dds.motores;

import ar.edu.utn.frba.dds.Atuendo;
import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Prenda;
import com.google.common.collect.Lists;

import java.util.List;

public class MotorSugerenciasFormalidad extends MotorSugerencias {
  public List<Prenda> prendasValidas(List<Prenda> prendas, Integer edad) {
    return edad > 55 ? prendas.stream().filter(p -> p.getFormalidad() == Formalidad.FORMAL).toList() : prendas;
  }
  /**
   * Devuelve una lista con todas las combinaciones de ropa formal segun la edad
   .com
   */
  public List<Atuendo> generarSugerenciasFormalesCon(List<Prenda> prendas, Integer edad) {
    return generarSugerenciasCon(prendasValidas(prendas, edad), edad);
  }
}