package com.saludperu.sistemadesalud.service;

import com.saludperu.sistemadesalud.model.Dengue;
import com.saludperu.sistemadesalud.model.CasoCovid;
import java.util.List;

public interface VigilanciaService {
    List<Dengue> listarDenguePorDeptoYAnio(String departamento, int anio);
    List<CasoCovid> listarCovidPorDepartamento(String departamento);
}