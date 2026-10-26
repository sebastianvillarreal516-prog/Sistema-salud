package com.saludperu.sistemadesalud.service;

import com.saludperu.sistemadesalud.model.FallecidoCovid;
import java.util.List;

public interface MortalidadService {
    List<FallecidoCovid> listarFallecidosPorDepartamento(String departamento);
}