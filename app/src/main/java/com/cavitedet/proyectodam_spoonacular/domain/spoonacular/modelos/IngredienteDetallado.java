package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;


import java.util.List;


public class IngredienteDetallado {

    private Integer id;

    private String original;

    private String nombreOriginal;

    private String nombre;

    private Double cantidad;

    private String unidadDeMedida;

    private String unidadDeMedidaReducida;

    private String unidadDeMedidaAlargada;

    private List<String> posiblesUnidades;

    private ValorEstimado valorEstimado;

    private String consistencia;

    private List<String> tiposDeUnidadesAlCobrar;

    private String categoria;

    private String imagen;

    private List<String> metaInformacion;

    private Nutricion nutricion;

    private List<String> caminoDeCategorias;

    public IngredienteDetallado(Integer id) {
        this.id = id;
    }

    public IngredienteDetallado(Integer id, String original, String nombreOriginal, String nombre, Double cantidad, String unidadDeMedida, String unidadDeMedidaReducida, String unidadDeMedidaAlargada, List<String> posiblesUnidades, ValorEstimado valorEstimado, String consistencia, List<String> tiposDeUnidadesAlCobrar, String categoria, String imagen, List<String> metaInformacion, Nutricion nutricion, List<String> caminoDeCategorias) {
        this.id = id;
        this.original = original;
        this.nombreOriginal = nombreOriginal;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
        this.unidadDeMedidaReducida = unidadDeMedidaReducida;
        this.unidadDeMedidaAlargada = unidadDeMedidaAlargada;
        this.posiblesUnidades = posiblesUnidades;
        this.valorEstimado = valorEstimado;
        this.consistencia = consistencia;
        this.tiposDeUnidadesAlCobrar = tiposDeUnidadesAlCobrar;
        this.categoria = categoria;
        this.imagen = imagen;
        this.metaInformacion = metaInformacion;
        this.nutricion = nutricion;
        this.caminoDeCategorias = caminoDeCategorias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getNombreOriginal() {
        return nombreOriginal;
    }

    public void setNombreOriginal(String nombreOriginal) {
        this.nombreOriginal = nombreOriginal;
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

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getUnidadDeMedidaReducida() {
        return unidadDeMedidaReducida;
    }

    public void setUnidadDeMedidaReducida(String unidadDeMedidaReducida) {
        this.unidadDeMedidaReducida = unidadDeMedidaReducida;
    }

    public String getUnidadDeMedidaAlargada() {
        return unidadDeMedidaAlargada;
    }

    public void setUnidadDeMedidaAlargada(String unidadDeMedidaAlargada) {
        this.unidadDeMedidaAlargada = unidadDeMedidaAlargada;
    }

    public List<String> getPosiblesUnidades() {
        return posiblesUnidades;
    }

    public void setPosiblesUnidades(List<String> posiblesUnidades) {
        this.posiblesUnidades = posiblesUnidades;
    }

    public ValorEstimado getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(ValorEstimado valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getConsistencia() {
        return consistencia;
    }

    public void setConsistencia(String consistencia) {
        this.consistencia = consistencia;
    }

    public List<String> getTiposDeUnidadesAlCobrar() {
        return tiposDeUnidadesAlCobrar;
    }

    public void setTiposDeUnidadesAlCobrar(List<String> tiposDeUnidadesAlCobrar) {
        this.tiposDeUnidadesAlCobrar = tiposDeUnidadesAlCobrar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<String> getMetaInformacion() {
        return metaInformacion;
    }

    public void setMetaInformacion(List<String> metaInformacion) {
        this.metaInformacion = metaInformacion;
    }

    public Nutricion getNutricion() {
        return nutricion;
    }

    public void setNutricion(Nutricion nutricion) {
        this.nutricion = nutricion;
    }

    public List<String> getCaminoDeCategorias() {
        return caminoDeCategorias;
    }

    public void setCaminoDeCategorias(List<String> caminoDeCategorias) {
        this.caminoDeCategorias = caminoDeCategorias;
    }

    @Override
    public String toString() {
        return "IngredienteDetallado{" +
                "id=" + id +
                ", original='" + original + '\'' +
                ", nombreOriginal='" + nombreOriginal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", unidadDeMedidaReducida='" + unidadDeMedidaReducida + '\'' +
                ", unidadDeMedidaAlargada='" + unidadDeMedidaAlargada + '\'' +
                ", posiblesUnidades=" + posiblesUnidades +
                ", valorEstimado=" + valorEstimado +
                ", consistencia='" + consistencia + '\'' +
                ", tiposDeUnidadesAlCobrar=" + tiposDeUnidadesAlCobrar +
                ", categoria='" + categoria + '\'' +
                ", imagen='" + imagen + '\'' +
                ", metaInformacion=" + metaInformacion +
                ", nutricion=" + nutricion +
                ", caminoDeCategorias=" + caminoDeCategorias +
                '}';
    }
}
