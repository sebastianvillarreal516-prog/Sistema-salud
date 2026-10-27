package com.saludperu.sistemadesalud.dao;

import com.saludperu.sistemadesalud.model.Dengue;
import com.saludperu.sistemadesalud.model.CasoCovid;
import com.saludperu.sistemadesalud.model.VigilanciaMalaria;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

import java.util.List;

public interface VigilanciaDao {
    List<Dengue> listarDenguePorDeptoYAnio(String departamento, int anio);
    List<CasoCovid> listarCovidPorDepartamento(String departamento);
    List<VigilanciaMalaria> listarMalariaPorDeptoYAnio(String departamento, int anio);
}