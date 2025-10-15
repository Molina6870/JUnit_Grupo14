package org.example;

import org.example.CuentaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    void testDepositoValido() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.getSaldo());
    }

    @Test
    void testRetiroValido() {
        CuentaBancaria cuenta = new CuentaBancaria(200);
        cuenta.retirar(50);
        assertEquals(150, cuenta.getSaldo());
    }

    @Test
    void testNoPermitirRetiroMayorQueSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(200));
    }

    @Test
    void testDepositoNegativoLanzaExcepcion() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-10));
    }

    @Test
    void testSaldoInicialNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new CuentaBancaria(-50));
    }
}


