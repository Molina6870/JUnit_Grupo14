package org.example;

import org.example.Validador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    void testTextoValido() {
        Validador val = new Validador();
        assertDoesNotThrow(() -> val.procesarTexto("Hola"));
    }

    @Test
    void testTextoNuloLanzaExcepcion() {
        Validador val = new Validador();
        assertThrows(IllegalArgumentException.class, () -> val.procesarTexto(null));
    }

    @Test
    void testMensajeDeExcepcionCorrecto() {
        Validador val = new Validador();
        Exception e = assertThrows(IllegalArgumentException.class, () -> val.procesarTexto(null));
        assertEquals("El texto no puede ser nulo", e.getMessage());
    }

    @Test
    void testTextoVacioNoLanzaExcepcion() {
        Validador val = new Validador();
        assertDoesNotThrow(() -> val.procesarTexto(""));
    }

    @Test
    void testTextoEspaciosNoLanzaExcepcion() {
        Validador val = new Validador();
        assertDoesNotThrow(() -> val.procesarTexto("   "));
    }
}
