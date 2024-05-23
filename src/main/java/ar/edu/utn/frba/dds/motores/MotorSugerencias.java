package ar.edu.utn.frba.dds.motores;

import ar.edu.utn.frba.dds.ropero.Atuendo;
import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Prenda;
import com.google.common.collect.Lists;
import java.util.List;

public class MotorSugerencias {

  /**
   * Devuelve una lista con todas las combinaciones de ropa posibles garantizando 1 y solo 1 prenda de cada tipo
   .com
   */
  public List<Atuendo> generarSugerenciasCon(List<Prenda> prendas, Integer edad, Double temperature) {
    List<Prenda> prendasSuperiores = filtrarPrendasPorTipo(prendas, Categoria.PARTE_SUPERIOR);
    List<Prenda> prendasInferiores = filtrarPrendasPorTipo(prendas, Categoria.PARTE_INFERIOR);
    List<Prenda> prendasCalzados = filtrarPrendasPorTipo(prendas, Categoria.CALZADO);

    List<Prenda> prendasSuperioresAdecuadas = filtrarPrendasPorTemperatura(prendasSuperiores, temperature);
    List<Prenda> prendasInferioresAdecuadas = filtrarPrendasPorTemperatura(prendasInferiores, temperature);
    List<Prenda> prendasCalzadosAdecuadas = filtrarPrendasPorTemperatura(prendasCalzados, temperature);

    List<List<Prenda>> combinacionesDePrendas = Lists.cartesianProduct(prendasSuperioresAdecuadas, prendasInferioresAdecuadas, prendasCalzadosAdecuadas);

    return combinacionesDePrendas.stream().map(combinacion -> new Atuendo(combinacion.get(0), combinacion.get(1), combinacion.get(2))).toList();
  }

  private List<Prenda> filtrarPrendasPorTipo(List<Prenda> prendas, Categoria categoria) {
    return prendas.stream().filter(p -> p.getTipoDePrenda().getCategoria() == categoria).toList();
  }

  private List<Prenda> filtrarPrendasPorTemperatura(List<Prenda> prendas, Double temperature) {
    return prendas.stream().filter(p -> p.getTemperaturaMaximaAdecuada() >= temperature).toList();
  }
}