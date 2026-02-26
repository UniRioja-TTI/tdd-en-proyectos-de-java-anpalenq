package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MailerStubTest {

	private MailerStub mailer;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        mailer = new MailerStub();
    }

    @AfterEach
    void tearDown() throws Exception {
        mailer = null;
    }

    @Test
    void testEnviarCorreo_ParametrosValidos() {
        // Preparar datos de prueba
        String email = "test@email.com";
        String mensaje = "Mensaje de prueba";

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea true, ya que los parámetros son válidos
        assertTrue(result, "El correo debería enviarse correctamente con parámetros válidos");
    }

    @Test
    void testEnviarCorreo_EmailVacio() {
        // Preparar datos de prueba con email vacío
        String email = "";
        String mensaje = "Mensaje de prueba";

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea false, ya que el email es vacío
        assertFalse(result, "El correo no debería enviarse con un email vacío");
    }

    @Test
    void testEnviarCorreo_MensajeVacio() {
        // Preparar datos de prueba con mensaje vacío
        String email = "test@email.com";
        String mensaje = "";

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea false, ya que el mensaje es vacío
        assertFalse(result, "El correo no debería enviarse con un mensaje vacío");
    }

    @Test
    void testEnviarCorreo_EmailYMensajeVacios() {
        // Preparar datos de prueba con email y mensaje vacíos
        String email = "";
        String mensaje = "";

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea false, ya que tanto el email como el mensaje están vacíos
        assertFalse(result, "El correo no debería enviarse con email y mensaje vacíos");
    }

    @Test
    void testEnviarCorreo_EmailNull() {
        // Preparar datos de prueba con email null
        String email = null;
        String mensaje = "Mensaje de prueba";

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea false, ya que el email es null
        assertFalse(result, "El correo no debería enviarse con un email null");
    }

    @Test
    void testEnviarCorreo_MensajeNull() {
        // Preparar datos de prueba con mensaje null
        String email = "test@email.com";
        String mensaje = null;

        // Llamar al método
        boolean result = mailer.enviarCorreo(email, mensaje);

        // Verificar que el resultado sea false, ya que el mensaje es null
        assertFalse(result, "El correo no debería enviarse con un mensaje null");
    }
}