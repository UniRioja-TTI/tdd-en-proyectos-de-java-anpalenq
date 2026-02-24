package com.tt1.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	    void testEnviarCorreo() {
	        assertThrows(UnsupportedOperationException.class, () -> {
	            mailer.enviarCorreo("test@email.com", "Mensaje de prueba");
	        });
	    } 
}