package com.saludperu.sistemadesalud.model;

import java.time.LocalDate;

public class FallecidoCovid {
    private Integer id; // id_fallecido (int)
    private Integer edad;
    private String sexo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String idUbigeo; // ubigeo (FK)
    private LocalDate fechaFallecimiento; // fecha_fallecimiento

    public FallecidoCovid() {}

    public FallecidoCovid(Integer id, Integer edad, String sexo, String departamento, String provincia, String distrito, String idUbigeo, LocalDate fechaFallecimiento) {
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.idUbigeo = idUbigeo;
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getIdUbigeo() { return idUbigeo; }
    public void setIdUbigeo(String idUbigeo) { this.idUbigeo = idUbigeo; }

    public LocalDate getFechaFallecimiento() { return fechaFallecimiento; }
    public void setFechaFallecimiento(LocalDate fechaFallecimiento) { this.fechaFallecimiento = fechaFallecimiento; }
}