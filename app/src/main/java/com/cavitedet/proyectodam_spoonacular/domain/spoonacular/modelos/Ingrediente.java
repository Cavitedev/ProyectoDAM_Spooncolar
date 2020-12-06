package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;



public class Ingrediente {

    private Integer id;

    private String nombre;

    private String imagen;

    public Ingrediente() {
    }

    public Ingrediente(Integer id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + nombre + '\'' +
                ", image='" + imagen + '\'' +
                '}';
    }
}
