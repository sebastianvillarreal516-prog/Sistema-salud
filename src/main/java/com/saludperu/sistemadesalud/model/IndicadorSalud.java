package com.saludperu.sistemadesalud.model;

public class IndicadorSalud {
    private String departamento;
    private String distrito;
    private String enfermedad;
    private Integer totalCasos;
    private Integer totalFallecidos;
    private Double tasaLetalidad;

    public IndicadorSalud() {}

    public IndicadorSalud(String departamento, String distrito, String enfermedad, Integer totalCasos, Integer totalFallecidos, Double tasaLetalidad) {
        this.departamento = departamento;
        this.distrito = distrito;
        this.enfermedad = enfermedad;
        this.totalCasos = totalCasos;
        this.totalFallecidos = totalFallecidos;
        this.tasaLetalidad = tasaLetalidad;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getEnfermedad() { return enfermedad; }
    public void setEnfermedad(String enfermedad) { this.enfermedad = enfermedad; }

    public Integer getTotalCasos() { return totalCasos; }
    public void setTotalCasos(Integer totalCasos) { this.totalCasos = totalCasos; }

    public Integer getTotalFallecidos() { return totalFallecidos; }
    public void setTotalFallecidos(Integer totalFallecidos) { this.totalFallecidos = totalFallecidos; }

    public Double getTasaLetalidad() { return tasaLetalidad; }
    public void setTasaLetalidad(Double tasaLetalidad) { this.tasaLetalidad = tasaLetalidad; }
}
