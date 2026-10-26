package com.saludperu.sistemadesalud.controller;

import com.saludperu.sistemadesalud.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/reportes")
    public String verReportes(Model model) {
        // Obtiene el resumen general en formato Map para las tarjetas del dashboard
        model.addAttribute("resumen", reporteService.obtenerResumenGeneralReportes());
        return "reportes"; // Hace referencia a reportes.html en templates
    }
}