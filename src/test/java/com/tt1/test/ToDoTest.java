package com.tt1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoTest {

	private ToDo todo;

    // Este método se ejecutará una vez antes de todas las pruebas
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    // Este método se ejecutará una vez después de todas las pruebas
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    // Este método se ejecutará antes de cada prueba
    @BeforeEach
    void setUp() throws Exception {
        // Aquí inicializamos el objeto ToDo antes de cada prueba
        todo = new ToDo("Tarea 1", "Descripción de la tarea", new Date(), false);
    }

    // Este método se ejecutará después de cada prueba
    @AfterEach
    void tearDown() throws Exception {
        // Aquí podemos limpiar lo que necesitemos después de cada prueba
        todo = null;
    }

    @Test
    void testGettersAndSetters() {
        // Arrange: Ya se creó el objeto en setUp()

        // Act: Llamamos a los métodos getters
        String nombre = todo.getNombre();
        String descripcion = todo.getDescripcion();
        Date fechaLimite = todo.getFechaLimite();
        boolean completado = todo.isCompletado();

        // Assert: Verificamos que los valores sean los esperados
        assertEquals("Tarea 1", nombre);
        assertEquals("Descripción de la tarea", descripcion);
        assertNotNull(fechaLimite); // La fecha no debe ser nula
        assertFalse(completado); // La tarea no debe estar completada
    }

    @Test
    void testSetters() {
        // Arrange: Ya se creó el objeto en setUp()
        
        // Act: Usamos los setters para cambiar los valores
        todo.setNombre("Tarea 2");
        todo.setDescripcion("Nueva descripción");
        todo.setFechaLimite(new Date());
        todo.setCompletado(true);

        // Assert: Verificamos que los setters hayan funcionado correctamente
        assertEquals("Tarea 2", todo.getNombre());
        assertEquals("Nueva descripción", todo.getDescripcion());
        assertNotNull(todo.getFechaLimite()); // La fecha debe haber sido actualizada
        assertTrue(todo.isCompletado()); // La tarea debe estar marcada como completada
    }
}