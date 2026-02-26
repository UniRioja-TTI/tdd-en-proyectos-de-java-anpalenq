package com.tt1.test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Repositorio {
	
	private DBStub dbStub;

    public Repositorio(DBStub dbStub) {
        this.dbStub = dbStub;
    }

    // Buscar tarea por ID (Índice en la lista)
    public ToDo buscarToDo(int id) {
        return dbStub.obtenerToDo(id);
    }

    // Marcar una tarea como completada
    public void marcarComoCompletado(int id) {
        ToDo tarea = dbStub.obtenerToDo(id); // Obtener la tarea por id
        if (tarea != null) {
            tarea.setCompletado(true);  // Marcar la tarea como completada
            dbStub.actualizarToDo(tarea); // Actualizar la tarea en DBStub
        }
    }

    // Almacenar nueva tarea
    public void almacenarNuevoToDo(ToDo todo) {
        dbStub.crearToDo(todo);
    }

    // Almacenar nuevo email
    public void almacenarNuevoEmail(String email) {
        dbStub.agregarEmail(email);
    }

    // Obtener tareas pendientes (incompletas)
    public List<ToDo> obtenerToDosPendientes() {
        return dbStub.getToDoList().stream()
                .filter(todo -> !todo.isCompletado())  // Filtramos las tareas no completadas
                .collect(Collectors.toList());
    }





}
