package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;


public class Nutriente {

    private String nombre;

    private Double cantidad;

    private String unidad;

    private Double porcentajeNecesitadoAlDia;

    public Nutriente(String nombre) {
        this.nombre = nombre;
    }


    public Nutriente(String nombre, Double cantidad, String unidad, Double porcentajeNecesitadoAlDia) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.porcentajeNecesitadoAlDia = porcentajeNecesitadoAlDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Double getPorcentajeNecesitadoAlDia() {
        return porcentajeNecesitadoAlDia;
    }

    public void setPorcentajeNecesitadoAlDia(Double porcentajeNecesitadoAlDia) {
        this.porcentajeNecesitadoAlDia = porcentajeNecesitadoAlDia;
    }

    @Override
    public String toString() {
        return "Nutriente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", unidad='" + unidad + '\'' +
                ", porcentajeNecesitadoAlDia=" + porcentajeNecesitadoAlDia +
                '}';
    }
}
