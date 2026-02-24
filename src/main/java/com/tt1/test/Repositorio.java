package com.tt1.test;

import java.util.List;
import java.util.Set;


public class Repositorio {
    private DBStub dbStub;
    public Repositorio(DBStub dbStub) {
        this.dbStub = dbStub;
    }



	public ToDo buscarToDo(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void marcarComoCompletado(int t) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void almacenarNuevoToDo(ToDo todo) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void almacenarNuevoEmail(String email) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public List<ToDo> obtenerToDosPendientes() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }





}
