package com.saludperu.sistemadesalud.dao;

import com.saludperu.sistemadesalud.model.FallecidoCovid;
import java.util.List;

public interface MortalidadDao {
    List<FallecidoCovid> listarFallecidosPorDepartamento(String departamento);
}