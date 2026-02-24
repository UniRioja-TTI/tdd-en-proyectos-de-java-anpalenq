package com.tt1.test;

import java.util.List;


public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailerStub;

    public Servicio(Repositorio repositorio, MailerStub mailerStub) {
        this.repositorio = repositorio;
        this.mailerStub = mailerStub;
    }



	public void agregarToDo(ToDo r) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public boolean agregarEmail(String email) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void marcarComoCompletado(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void listarPendientes() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    public void verificarFechasLimite() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }




}
