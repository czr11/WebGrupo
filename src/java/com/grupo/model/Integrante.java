package com.grupo.model;
// Generated 04-23-2013 11:00:50 PM by Hibernate Tools 3.2.1.GA



/**
 * Integrante generated by hbm2java
 */
public class Integrante  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private String direccion;
     private String referencia;
     private String lineas;
     private String telefono;
     private String celular;
     private String operador;
     private String email;
     private boolean estado;

    public Integrante() {
    }

    public Integrante(String nombre, String apellido, String direccion, String referencia, String lineas, String telefono, String celular, String operador, String email, boolean estado) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.referencia = referencia;
       this.lineas = lineas;
       this.telefono = telefono;
       this.celular = celular;
       this.operador = operador;
       this.email = email;
       this.estado = estado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getLineas() {
        return this.lineas;
    }
    
    public void setLineas(String lineas) {
        this.lineas = lineas;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getOperador() {
        return this.operador;
    }
    
    public void setOperador(String operador) {
        this.operador = operador;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}

