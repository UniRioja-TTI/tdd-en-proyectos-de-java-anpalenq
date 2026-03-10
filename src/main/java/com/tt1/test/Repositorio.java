package com.tt1.test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase Repositorio.
 * 
 * Proporciona acceso y gestión de las tareas y emails mediante el uso de un DBStub.
 * Contiene métodos para buscar, almacenar y actualizar tareas, así como para manejar emails.
 * 
 * <p>Esta clase actúa como intermediaria entre la lógica de negocio (Servicio) y la
 * "base de datos" simulada (DBStub).</p>
 * 
 * @author anpalenq
 * @version 1.0
 */
public class Repositorio {
    
    /**
     * DBStub utilizado como almacenamiento simulado de tareas y emails.
     */
    private DBStub dbStub;

    /**
     * Constructor del Repositorio.
     * 
     * @param dbStub Instancia de DBStub que sirve como almacenamiento.
     */
    public Repositorio(DBStub dbStub) {
        this.dbStub = dbStub;
    }

    /**
     * Busca una tarea por su identificador (índice en la lista).
     * 
     * @param id indice de la tarea a buscar.
     * @return La tarea correspondiente al ID proporcionado.
     * @throws IllegalArgumentException Si no existe una tarea con ese ID.
     */
    public ToDo buscarToDo(int id) {
        return dbStub.obtenerToDo(id);
    }

    /**
     * Marca como completada la tarea indicada por su ID.
     * 
     * @param id indice de la tarea a marcar como completada.
     */
    public void marcarComoCompletado(int id) {
        ToDo tarea = dbStub.obtenerToDo(id); // Obtener la tarea por id
        if (tarea != null) {
            tarea.setCompletado(true);  // Marcar la tarea como completada
            dbStub.actualizarToDo(tarea); // Actualizar la tarea en DBStub
        }
    }

    /**
     * Almacena una nueva tarea en la base de datos simulada.
     * 
     * @param todo Objeto ToDo que representa la nueva tarea.
     */
    public void almacenarNuevoToDo(ToDo todo) {
        dbStub.crearToDo(todo);
    }

    /**
     * Almacena un nuevo email en la agenda de la base de datos simulada.
     * 
     * @param email Dirección de correo a almacenar.
     */
    public void almacenarNuevoEmail(String email) {
        dbStub.agregarEmail(email);
    }

    /**
     * Obtiene todas las tareas pendientes (no completadas).
     * 
     * @return Lista de tareas pendientes.
     */
    public List<ToDo> obtenerToDosPendientes() {
        return dbStub.getToDoList().stream()
                .filter(todo -> !todo.isCompletado())  // Filtramos las tareas no completadas
                .collect(Collectors.toList());
    }
}