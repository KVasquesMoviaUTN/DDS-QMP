package ar.edu.utn.frba.dds.QMP;

import static ar.edu.utn.frba.dds.QMP.Categoria.*;
import static java.util.Objects.requireNonNull;

public class Prenda {
    public TipoDePrenda tipoDePrenda;
    public Material material;
    public Color color;
    public Color colorSecundario;
    public Trama trama;
    public Materiales materiales;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color, Color colorSecundario) {
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "El Material es obligatorio");
        this.color = requireNonNull(color, "El Color es obligatorio");
        this.colorSecundario = colorSecundario;
    }

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color, Color colorSecundario, Trama trama) {
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "El Material es obligatorio");
        this.color = requireNonNull(color, "El Color es obligatorio");
        this.colorSecundario = colorSecundario;
        this.trama = requireNonNull(trama, "La Trama es obligatoria");
    }

    public Prenda(TipoDePrenda tipoDePrenda, Materiales materiales, Color colorSecundario) {
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "El Tipo de prenda es obligatorio");
        this.materiales = requireNonNull(materiales, "Debe especificar los materiales");
        this.colorSecundario = colorSecundario;
    }
}