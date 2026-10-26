package com.saludperu.sistemadesalud.dao.impl;

import com.saludperu.sistemadesalud.dao.ReporteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ReporteDaoImpl implements ReporteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> obtenerResumenGeneralReportes() {
        // Ejecución limpia del procedimiento almacenado sin sentencias SQL en Java
        String sql = "EXEC sp_ObtenerResumenGeneralDashboard";
        return jdbcTemplate.queryForMap(sql);
    }
}