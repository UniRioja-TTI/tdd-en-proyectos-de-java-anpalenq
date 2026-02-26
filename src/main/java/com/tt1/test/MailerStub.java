package com.tt1.test;


public class MailerStub {

    public boolean enviarCorreo(String email, String mensaje) {
        if (email == null || email.isEmpty() || mensaje == null || mensaje.isEmpty()) {
            return false; 
        }
        System.out.println("Enviando correo a: " + email);
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
        
}






