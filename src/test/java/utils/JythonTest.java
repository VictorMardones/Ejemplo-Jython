package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas unitarias de Jython")
class JythonTest {

    Jython jython;

    @BeforeEach
    void setUp() {
        jython = new Jython();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba de hola mundo")
    void holaMundoTest() {
        String salida = jython.interpretarPython("src/main/python/holamundo.py");
        assertEquals("Hola mundo", salida);
    }

    @Test
    @DisplayName("Prueba de suma")
    void sumarTest() {
        String salida = jython.interpretarPython("src/main/python/sumar.py");
        assertEquals("15\n-30\n1247.4", salida);
    }
}