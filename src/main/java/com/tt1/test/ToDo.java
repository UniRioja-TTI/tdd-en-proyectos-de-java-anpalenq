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

    // Getters y Setters
    public String getNombre() {
        //return nombre;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setNombre(String nombre) {
        //this.nombre = nombre;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public String getDescripcion() {
        //return descripcion;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setDescripcion(String descripcion) {
        //this.descripcion = descripcion;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public Date getFechaLimite() {
        //return fechaLimite;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setFechaLimite(Date fechaLimite) {
        //this.fechaLimite = fechaLimite;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean isCompletado() {
        //return completado;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setCompletado(boolean completado) {
        //this.completado = completado;
    	throw new UnsupportedOperationException("Clase aún no implementada.");
    }

}
