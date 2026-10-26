package com.saludperu.sistemadesalud.controller;

import com.saludperu.sistemadesalud.service.VigilanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VigilanciaController {

    @Autowired
    private VigilanciaService vigilanciaService;

    @GetMapping("/vigilancia")
    public String verVigilancia(@RequestParam(name = "departamento", required = false) String departamento,
                                @RequestParam(name = "anio", required = false, defaultValue = "2024") int anio,
                                Model model) {
        // Carga los datos de Dengue y COVID filtrados para la vista de vigilancia
        model.addAttribute("listaDengue", vigilanciaService.listarDenguePorDeptoYAnio(departamento, anio));
        model.addAttribute("listaCovid", vigilanciaService.listarCovidPorDepartamento(departamento));
        return "vigilancia"; // Hace referencia a vigilancia.html en templates
    }
}