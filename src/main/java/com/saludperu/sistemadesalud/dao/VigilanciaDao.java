package com.saludperu.sistemadesalud.dao;

import com.saludperu.sistemadesalud.model.Dengue;
import com.saludperu.sistemadesalud.model.CasoCovid;
import java.util.List;

public interface VigilanciaDao {
    List<Dengue> listarDenguePorDeptoYAnio(String departamento, int anio);
    List<CasoCovid> listarCovidPorDepartamento(String departamento);
}