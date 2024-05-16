package ar.edu.utn.frba.dds.servicios;

import ar.edu.utn.frba.dds.APIs.AccuWeatherAPI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Cachea el clima
 .com
 */
public class ServicioMetereologico {
  private AccuWeatherAPI apiClima;
  private Duration periodoDeValidez;
  private String ciudad;
  private Double ultimaRespuesta;
  private LocalDateTime proximaExpiracion;

  /**
   * Inicializa el servicio metereologico
   .com
   */
  public ServicioMetereologico(Duration periodoDeValidez, String ciudad) {
    this.periodoDeValidez = periodoDeValidez;
    this.ciudad = ciudad;
  }

  /**
   * Actualiza el climacada determinado tiempo
   .com
   */
  public Double obtenerClimaCadaCiertoTiempo() {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = getTemperature();
      this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
    }
    return this.ultimaRespuesta;
  }

  private boolean expiro() {
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

  private Double getTemperature() {
    this.apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(this.ciudad);
    return (Double) condicionesClimaticas.get(0).get("Temperature");
  }

  private Double getPrecipitation() {
    this.apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(this.ciudad);
    return (Double) condicionesClimaticas.get(0).get("PrecipitationProbability");
  }
}