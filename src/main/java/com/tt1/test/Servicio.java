package com.tt1.test;

/**
 * Clase Servicio.
 * 
 * Representa el servicio principal de la aplicación de gestión de tareas.
 * Contiene métodos para agregar tareas, manejar emails, marcar tareas
 * como completadas, listar pendientes y verificar fechas límite.
 * 
 * <p>Depende de un Repositorio para almacenar las tareas y un MailerStub
 * para simular el envío de correos electrónicos.</p>
 * 
 * @author anpalenq
 * @version 1.0
 */
public class Servicio {

    /**
     * Repositorio de tareas utilizado por el servicio.
     */
    private Repositorio repositorio;

    /**
     * Mailer simulado para enviar correos electrónicos.
     */
    private MailerStub mailerStub;

    /**
     * Constructor de la clase Servicio.
     * 
     * @param repositorio Repositorio donde se almacenan las tareas.
     * @param mailerStub MailerStub simulado para envío de correos.
     */
    public Servicio(Repositorio repositorio, MailerStub mailerStub) {
        this.repositorio = repositorio;
        this.mailerStub = mailerStub;
    }

    /**
     * Agrega una nueva tarea al sistema.
     * 
     * @param r Objeto ToDo que representa la tarea a agregar.
     */
    public void agregarToDo(ToDo r) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * Agrega un email a la agenda de notificaciones.
     * 
     * @param email Dirección de correo a agregar.
     * @return true si el email fue agregado correctamente, false si ya existía.
     */
    public boolean agregarEmail(String email) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * Marca como completada la tarea indicada por su ID.
     * 
     * @param id Identificador de la tarea a marcar como completada.
     */
    public void marcarComoCompletado(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * Lista todas las tareas pendientes.
     */
    public void listarPendientes() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * Verifica las fechas límite de las tareas y realiza acciones necesarias
     * (por ejemplo, notificaciones) si alguna tarea está próxima a su fecha límite.
     */
    public void verificarFechasLimite() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }
}