package com.tt1.test;

import java.io.Serializable;
import java.util.Date;

public class ToDo implements Serializable{
	
    private String nombre;
    private String descripcion;
    private Date fechaLimite;
    private boolean completado;
    
    
    // Constructor vacío
    public ToDo() {
    }
    
    public ToDo(String nombre, String descr, Date limite, boolean completado) {
    	this.nombre=nombre;
    	this.descripcion=descr;
    	this.fechaLimite=limite;
    	this.completado=completado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter y Setter para fechaLimite
    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    // Getter y Setter para completado
    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

}
