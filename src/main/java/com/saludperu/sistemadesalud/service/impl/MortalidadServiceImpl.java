package com.saludperu.sistemadesalud.service.impl;

import com.saludperu.sistemadesalud.dao.MortalidadDao;
import com.saludperu.sistemadesalud.model.FallecidoCovid;
import com.saludperu.sistemadesalud.service.MortalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortalidadServiceImpl implements MortalidadService {

    @Autowired
    private MortalidadDao mortalidadDao;

    @Override
    public List<FallecidoCovid> listarFallecidosPorDepartamento(String departamento) {
        return mortalidadDao.listarFallecidosPorDepartamento(departamento);
    }
}