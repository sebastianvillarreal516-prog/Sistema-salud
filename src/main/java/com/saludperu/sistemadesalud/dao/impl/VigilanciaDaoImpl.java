package com.saludperu.sistemadesalud.dao.impl;

import com.saludperu.sistemadesalud.dao.VigilanciaDao;
import com.saludperu.sistemadesalud.model.Dengue;
import com.saludperu.sistemadesalud.model.CasoCovid;
import com.saludperu.sistemadesalud.model.VigilanciaMalaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VigilanciaDaoImpl implements VigilanciaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dengue> listarDenguePorDeptoYAnio(String departamento, int anio) {
        // Llamada directa al procedimiento almacenado creado en SQL Server
        String sql = "EXEC sp_ListarDenguePorDeptoYAnio ?, ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dengue.class), departamento, anio);
    }

    @Override
    public List<CasoCovid> listarCovidPorDepartamento(String departamento) {
        // Llamada limpia al stored procedure de COVID
        String sql = "EXEC sp_ListarCasosCovidPorDepto ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CasoCovid.class), departamento);
    }

    @Override
    public List<VigilanciaMalaria> listarMalariaPorDeptoYAnio(String departamento, int anio) {
        String sql = "EXEC sp_ObtenerTotalMalariaPorAnio ?, ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(VigilanciaMalaria.class), departamento, anio);
    }
}