package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;


import java.util.List;

public class Ingredientes {

    private List<Ingrediente> listaIngredientes;

    private Integer offset;

    private Integer numeroPedido;

    private Integer resultadosTotales;

    public Ingredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Ingredientes(List<Ingrediente> listaIngredientes, Integer offset, Integer numeroPedido, Integer resultadosTotales) {
        this.listaIngredientes = listaIngredientes;
        this.offset = offset;
        this.numeroPedido = numeroPedido;
        this.resultadosTotales = resultadosTotales;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getResultadosTotales() {
        return resultadosTotales;
    }

    public void setResultadosTotales(Integer resultadosTotales) {
        this.resultadosTotales = resultadosTotales;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredientList=" + listaIngredientes +
                ", offset=" + offset +
                ", number=" + numeroPedido +
                ", totalResults=" + resultadosTotales +
                '}';
    }


}
