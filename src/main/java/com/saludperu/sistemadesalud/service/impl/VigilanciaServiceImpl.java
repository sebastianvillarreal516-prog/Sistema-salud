package com.saludperu.sistemadesalud.service.impl;

import com.saludperu.sistemadesalud.dao.VigilanciaDao;
import com.saludperu.sistemadesalud.model.CasoCovid;
import com.saludperu.sistemadesalud.model.Dengue;
import com.saludperu.sistemadesalud.service.VigilanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VigilanciaServiceImpl implements VigilanciaService {

    @Autowired
    private VigilanciaDao vigilanciaDao;

    @Override
    public List<Dengue> listarDenguePorDeptoYAnio(String departamento, int anio) {
        return vigilanciaDao.listarDenguePorDeptoYAnio(departamento, anio);
    }

    @Override
    public List<CasoCovid> listarCovidPorDepartamento(String departamento) {
        return vigilanciaDao.listarCovidPorDepartamento(departamento);
    }
}