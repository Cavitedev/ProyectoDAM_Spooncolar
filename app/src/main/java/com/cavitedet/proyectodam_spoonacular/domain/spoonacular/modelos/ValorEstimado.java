package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;

public class ValorEstimado {

    private double valor;

    private String unidad;

    public ValorEstimado(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "ValorEstimado{" +
                "valor=" + valor +
                ", unidad='" + unidad + '\'' +
                '}';
    }

    public String valorFormateado() {
        return valor + " " + unidad;
    }
}
