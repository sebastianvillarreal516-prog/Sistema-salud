package com.saludperu.sistemadesalud.service.impl;

import com.saludperu.sistemadesalud.dao.ReporteDao;
import com.saludperu.sistemadesalud.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteDao reporteDao;

    @Override
    public Map<String, Object> obtenerResumenGeneralReportes() {
        return reporteDao.obtenerResumenGeneralReportes();
    }
}