/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelo;


import jakarta.persistence.Basic;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;


import lombok.Data;

/**
 *
 * @author Sylandklk
 */
@Entity
@Table(name="usuarios", catalog ="mi_base_de_datos")
@Data 
public class Usuario implements Serializable {
    //propiedades:
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotEmpty
    private String Cedula;
    @NotEmpty
    private String Clave;
    @NotEmpty
    private String Nombre;
    @Email
    private String Email;
}
