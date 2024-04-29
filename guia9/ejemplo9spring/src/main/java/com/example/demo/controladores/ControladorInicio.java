/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controladores;

import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.modelo.Usuario;
import com.example.demo.dao.IUsuarioCrud;
import static java.util.Collections.list;
import java.util.List;
import com.example.demo.servicio.IUsuarioServicio;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Sylandklk
 */

@Controller
@Slf4j
public class ControladorInicio {
 @Autowired
  IUsuarioServicio userServicio;
    @GetMapping("/")
    public String inicio(Model modelo){
          List<Usuario> listaUsuarios = (List<Usuario>) userServicio.listarUsuarios();
          modelo.addAttribute("usuarios",listaUsuarios);
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
}