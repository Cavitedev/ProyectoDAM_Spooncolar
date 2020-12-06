package com.cavitedet.proyectodam_spoonacular.domain.spoonacular.modelos;


public class DescomposicionCalorica {

    private Double porcentajeProteinas;

    private Double porcentajeGrasas;

    private Double porcentajeCarbohidratos;

    public DescomposicionCalorica() {
    }

    public DescomposicionCalorica(Double porcentajeProteinas, Double porcentajeGrasas, Double porcentajeCarbohidratos) {
        this.porcentajeProteinas = porcentajeProteinas;
        this.porcentajeGrasas = porcentajeGrasas;
        this.porcentajeCarbohidratos = porcentajeCarbohidratos;
    }

    public Double getPorcentajeProteinas() {
        return porcentajeProteinas;
    }

    public void setPorcentajeProteinas(Double porcentajeProteinas) {
        this.porcentajeProteinas = porcentajeProteinas;
    }

    public Double getPorcentajeGrasas() {
        return porcentajeGrasas;
    }

    public void setPorcentajeGrasas(Double porcentajeGrasas) {
        this.porcentajeGrasas = porcentajeGrasas;
    }

    public Double getPorcentajeCarbohidratos() {
        return porcentajeCarbohidratos;
    }

    public void setPorcentajeCarbohidratos(Double porcentajeCarbohidratos) {
        this.porcentajeCarbohidratos = porcentajeCarbohidratos;
    }

    @Override
    public String toString() {
        return "DescomposicionCalorica{" +
                "porcentajeProteinas=" + porcentajeProteinas +
                ", porcentajeGrasas=" + porcentajeGrasas +
                ", porcentajeCarbohidratos=" + porcentajeCarbohidratos +
                '}';
    }
}
