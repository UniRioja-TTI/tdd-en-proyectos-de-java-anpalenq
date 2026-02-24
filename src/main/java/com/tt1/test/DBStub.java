package com.tt1.test;

import java.util.List;
import java.util.Set;


import java.util.ArrayList;
import java.util.HashSet;

public class DBStub  {
    private List<ToDo> todos;
    private Set<String> agendaEmails;

    public DBStub() {
        todos = new ArrayList<>();
        agendaEmails = new HashSet<>();
    }

 // Métodos CRUD de tareas
    public void crearToDo(ToDo todo) {
        // Agregar tarea a la lista
        todos.add(todo);
    }

    public ToDo obtenerToDo(int id) {
        // Buscar tarea por ID (en este caso usamos el índice en la lista como "id")
        if (id >= 0 && id < todos.size()) {
            return todos.get(id);
        } else {
            throw new IllegalArgumentException("Tarea no encontrada.");
        }
    }

    public void actualizarToDo(ToDo todo) {
        // Actualizar tarea en la lista
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getNombre().equals(todo.getNombre())) {
                todos.set(i, todo);
                return;
            }
        }
        throw new IllegalArgumentException("Tarea no encontrada.");
    }

    public void eliminarToDo(int id) {
        // Eliminar tarea por ID (en este caso usamos el índice en la lista como "id")
        if (id >= 0 && id < todos.size()) {
            todos.remove(id);
        } else {
            throw new IllegalArgumentException("Tarea no encontrada.");
        }
    }

    // Métodos de agenda de emails
    public boolean agregarEmail(String email) {
        return agendaEmails.add(email); // Agrega el email a la agenda
    }

    public Set<String> obtenerEmails() {
        return agendaEmails; // Devuelve los emails agregados
    }

    public List<ToDo> getToDoList() {
        return todos; // Devuelve la lista de todos
    }
}
