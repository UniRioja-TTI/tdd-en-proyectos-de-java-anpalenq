package com.tt1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBStubTest {

	private DBStub db;
    private ToDo todo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        db = new DBStub();
        todo = new ToDo("Tarea prueba", "Descripción", new Date(), false);
    }

    @AfterEach
    void tearDown() throws Exception {
        db = null;
        todo = null;
    }

    @Test
    void testCrearToDo() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.crearToDo(todo);
        });
    }

    @Test
    void testObtenerToDo() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.obtenerToDo(1);
        });
    }

    @Test
    void testActualizarToDo() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.actualizarToDo(todo);
        });
    }

    @Test
    void testEliminarToDo() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.eliminarToDo(1);
        });
    }

    @Test
    void testAgregarEmail() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.agregarEmail("test@email.com");
        });
    }

    @Test
    void testObtenerEmails() {
        assertThrows(UnsupportedOperationException.class, () -> {
            db.obtenerEmails();
        });
    }
}
