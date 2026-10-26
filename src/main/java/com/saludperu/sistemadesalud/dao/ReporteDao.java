package com.saludperu.sistemadesalud.dao;

import java.util.Map;

public interface ReporteDao {
    // Obtiene el resumen general de los totales para las tarjetas y reportes
    Map<String, Object> obtenerResumenGeneralReportes();
}