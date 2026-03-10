package com.tt1.test;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase ToDo.
 * 
 * Representa una tarea en el sistema de gestión de tareas.
 * Contiene información sobre el nombre de la tarea, su descripción,
 * fecha límite y estado de completado.
 * 
 * <p>Esta clase implementa Serializable, por lo que los objetos ToDo
 * pueden ser serializados para almacenamiento o transmisión.</p>
 * 
 * @author anpalenq
 * @version 1.0
 */
public class ToDo implements Serializable {
    
    /**
     * Nombre de la tarea.
     */
    private String nombre;

    /**
     * Descripción de la tarea.
     */
    private String descripcion;

    /**
     * Fecha límite para completar la tarea.
     */
    private Date fechaLimite;

    /**
     * Indica si la tarea ha sido completada.
     */
    private boolean completado;
    
    /**
     * Constructor vacío.
     * Permite crear un objeto ToDo sin inicializar sus atributos.
     */
    public ToDo() {
    }

    /**
     * Constructor con todos los atributos.
     *
     * @param nombre Nombre de la tarea.
     * @param descr Descripción de la tarea.
     * @param limite Fecha límite de la tarea.
     * @param completado Estado de completado de la tarea.
     */
    public ToDo(String nombre, String descr, Date limite, boolean completado) {
        this.nombre = nombre;
        this.descripcion = descr;
        this.fechaLimite = limite;
        this.completado = completado;
    }

    /**
     * Obtiene el nombre de la tarea.
     * 
     * @return Nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la tarea.
     * 
     * @param nombre Nuevo nombre de la tarea.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la tarea.
     * 
     * @return Descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la tarea.
     * 
     * @param descripcion Nueva descripción de la tarea.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha límite de la tarea.
     * 
     * @return Fecha límite.
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Modifica la fecha límite de la tarea.
     * 
     * @param fechaLimite Nueva fecha límite.
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Indica si la tarea ha sido completada.
     * 
     * @return true si la tarea está completada, false en caso contrario.
     */
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Modifica el estado de completado de la tarea.
     * 
     * @param completado Nuevo estado de completado.
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}