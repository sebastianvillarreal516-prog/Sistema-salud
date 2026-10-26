package com.saludperu.sistemadesalud.model;

public class Dengue {
    private Integer id;
    private String departamento;
    private String provincia;
    private String distrito;
    private String enfermedad;
    private Integer anio;
    private String idUbigeo;
    private Integer edad;
    private String sexo;

    public Dengue() {}

    public Dengue(Integer id, String departamento, String provincia, String distrito, String enfermedad, Integer anio, String idUbigeo, Integer edad, String sexo) {
        this.id = id;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.enfermedad = enfermedad;
        this.anio = anio;
        this.idUbigeo = idUbigeo;
        this.edad = edad;
        this.sexo = sexo;
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

    public String getEnfermedad() { return enfermedad; }
    public void setEnfermedad(String enfermedad) { this.enfermedad = enfermedad; }

    public Integer getAnio() { return anio; }
    public void setAnio(Integer anio) { this.anio = anio; }

    public String getIdUbigeo() { return idUbigeo; }
    public void setIdUbigeo(String idUbigeo) { this.idUbigeo = idUbigeo; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
}
