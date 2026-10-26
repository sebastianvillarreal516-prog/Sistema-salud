package com.saludperu.sistemadesalud.model;

import java.time.LocalDate;

public class CasoCovid {
    private Integer id;
    private String departamento;
    private String provincia;
    private String distrito;
    private String metodoDiagnostico;
    private Integer edad;
    private String sexo;
    private String idUbigeo;
    private LocalDate fechaResultado;

    public CasoCovid() {}

    public CasoCovid(Integer id, String departamento, String provincia, String distrito, String metodoDiagnostico, Integer edad, String sexo, String idUbigeo, LocalDate fechaResultado) {
        this.id = id;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.metodoDiagnostico = metodoDiagnostico;
        this.edad = edad;
        this.sexo = sexo;
        this.idUbigeo = idUbigeo;
        this.fechaResultado = fechaResultado;
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getMetodoDiagnostico() { return metodoDiagnostico; }
    public void setMetodoDiagnostico(String metodoDiagnostico) { this.metodoDiagnostico = metodoDiagnostico; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getIdUbigeo() { return idUbigeo; }
    public void setIdUbigeo(String idUbigeo) { this.idUbigeo = idUbigeo; }

    public LocalDate getFechaResultado() { return fechaResultado; }
    public void setFechaResultado(LocalDate fechaResultado) { this.fechaResultado = fechaResultado; }
}