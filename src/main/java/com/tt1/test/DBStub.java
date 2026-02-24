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
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public ToDo obtenerToDo(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void actualizarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void eliminarToDo(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    // Métodos de agenda de emails
    public boolean agregarEmail(String email) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public Set<String> obtenerEmails() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

	public List<ToDo> getToDoList() {
		// TODO Auto-generated method stub
		return null;
	}
}
