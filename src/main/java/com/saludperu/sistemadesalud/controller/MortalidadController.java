package com.saludperu.sistemadesalud.controller;

import com.saludperu.sistemadesalud.service.MortalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MortalidadController {

    @Autowired
    private MortalidadService mortalidadService;

    @GetMapping("/mortalidad")
    public String listarFallecidos(@RequestParam(name = "departamento", required = false) String departamento, Model model) {
        // Si no se selecciona departamento por defecto, se puede mandar vacío o nulo
        model.addAttribute("fallecidos", mortalidadService.listarFallecidosPorDepartamento(departamento));
        return "mortalidad"; // Este es el nombre de tu archivo HTML en templates (mortalidad.html)
    }


}