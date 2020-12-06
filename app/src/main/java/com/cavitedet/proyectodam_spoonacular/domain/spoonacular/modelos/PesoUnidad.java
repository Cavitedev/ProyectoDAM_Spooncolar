package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;

public class PesoUnidad {

    private Double cantidad;

    private String unidad;

    public PesoUnidad() {
    }

    public PesoUnidad(Double cantidad, String unidad) {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "PesoUnidad{" +
                "cantidad=" + cantidad +
                ", unidad='" + unidad + '\'' +
                '}';
    }
}
