package com.saludperu.sistemadesalud.dao.impl;

import com.saludperu.sistemadesalud.dao.MortalidadDao;
import com.saludperu.sistemadesalud.model.FallecidoCovid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MortalidadDaoImpl implements MortalidadDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<FallecidoCovid> listarFallecidosPorDepartamento(String departamento) {
        // Ejecución de procedimiento almacenado para la vista de mortalidad
        String sql = "EXEC sp_ListarFallecidosPorDepto ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(FallecidoCovid.class), departamento);
    }
}