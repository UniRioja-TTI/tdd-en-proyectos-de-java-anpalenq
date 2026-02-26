package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBStubTest {

	 private DBStub dbStub;
	    private ToDo todo1;
	    private ToDo todo2;

	    @BeforeEach
	    void setUp() throws Exception {
	        // Inicializamos el objeto DBStub y los ToDos para cada test
	        dbStub = new DBStub();
	        todo1 = new ToDo("Tarea 1", "Descripción 1", new Date(), false);
	        todo2 = new ToDo("Tarea 2", "Descripción 2", new Date(System.currentTimeMillis() + 10000000), false);
	    }

	    @Test
	    void testAddTask() {
	        // Act: Agregar tareas al DBStub
	        dbStub.crearToDo(todo1);
	        dbStub.crearToDo(todo2);

	        // Assert: Verificar que las tareas se han añadido a la lista
	        assertEquals(2, dbStub.getToDoList().size(), "El número de tareas no coincide.");
	        assertTrue(dbStub.getToDoList().contains(todo1), "La tarea 1 no fue añadida.");
	        assertTrue(dbStub.getToDoList().contains(todo2), "La tarea 2 no fue añadida.");
	    }

	    @Test
	    void testFindTaskById() {
	        // Act: Añadir la tarea y buscarla por ID (suponiendo que la ID es su posición en la lista)
	        dbStub.crearToDo(todo1);
	        dbStub.crearToDo(todo2);
	       
	        // Aquí implementamos el test asumiendo que ID está basado en el índice
	        ToDo foundTask = dbStub.obtenerToDo(0);

	        // Assert: Verificar que la tarea encontrada sea la correcta
	        assertEquals(todo1, foundTask, "La tarea encontrada no es la correcta.");
	    }

	   

	    @Test
	    void testAddEmail() {
	        // Act: Añadir un correo electrónico a la agenda
	        String email = "test@example.com";
	        boolean result = dbStub.agregarEmail(email);
	       
	        // Assert: Verificar que el correo fue agregado correctamente
	        assertTrue(result, "El correo electrónico no fue agregado correctamente.");
	        assertTrue(dbStub.obtenerEmails().contains(email), "La agenda no contiene el correo electrónico.");
	    }

	    @Test
	    void testGetEmailAgenda() {
	        // Act: Añadir algunos correos a la agenda
	        dbStub.agregarEmail("test1@example.com");
	        dbStub.agregarEmail("test2@example.com");
	       
	        // Assert: Verificar que la agenda contiene los correos añadidos
	        Set<String> agenda = dbStub.obtenerEmails();
	        assertTrue(agenda.contains("test1@example.com"), "El correo test1@example.com no está en la agenda.");
	        assertTrue(agenda.contains("test2@example.com"), "El correo test2@example.com no está en la agenda.");
	    }
}
