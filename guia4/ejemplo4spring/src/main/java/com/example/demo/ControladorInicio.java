/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Sylandklk
 */
@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
}