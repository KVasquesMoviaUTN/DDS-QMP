package ar.edu.utn.frba.dds.motores;

import ar.edu.utn.frba.dds.Atuendo;
import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Prenda;
import com.google.common.collect.Lists;

import java.util.List;

public class MotorSugerencias {
  /**
   * Devuelve una lista con todas las combinaciones de ropa posibles garantizando 1 y solo 1 prenda de cada tipo
   .com
   */
  public List<Atuendo> generarSugerenciasCon(List<Prenda> prendas, Integer edad) {
    List<Prenda> prendasSuperiores = prendas.stream().filter(p -> p.getTipoDePrenda().getCategoria() == Categoria.PARTE_SUPERIOR).toList();
    List<Prenda> prendasInferiores = prendas.stream().filter(p -> p.getTipoDePrenda().getCategoria() == Categoria.PARTE_INFERIOR).toList();
    List<Prenda> prendasCalzados = prendas.stream().filter(p -> p.getTipoDePrenda().getCategoria() == Categoria.CALZADO).toList();

    List<List<Prenda>> combinacionesDePrendas = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, prendasCalzados);

    return combinacionesDePrendas.stream().map(combinacion -> new Atuendo(combinacion.get(0), combinacion.get(1), combinacion.get(2))).toList();
  }
}