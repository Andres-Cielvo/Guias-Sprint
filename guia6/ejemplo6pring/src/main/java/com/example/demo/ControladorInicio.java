/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.modelo.Usuario;
/**
 *
 * @author Sylandklk
 */

@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje="Saludos desde Spring MVC";
        modelo.addAttribute("mensaje",mensaje);
          modelo.addAttribute("dato",dato);
          Usuario u = new Usuario();
          u.setCedula("1234");
          u.setClave("abcd");
          u.setNombre("Dyland Camilo Rada");
          u.setEmail("dyland.rada@unicolombo.edu.co");
          modelo.addAttribute("alguien",u);
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
}