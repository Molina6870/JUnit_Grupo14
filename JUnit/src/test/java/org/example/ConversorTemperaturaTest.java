
package org.example;
import org.example.ConversorTemperatura;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    void testCelsiusAFahrenheit() {
        ConversorTemperatura conv = new ConversorTemperatura();
        assertEquals(32.0, conv.celsiusAFahrenheit(0), 0.001);    }

    @Test
    void testCelsiusAFahrenheitPositivo() {
        ConversorTemperatura conv = new ConversorTemperatura();
        assertEquals(212, conv.celsiusAFahrenheit(100),0.01);
    }

    @Test
    void testFahrenheitACelsius() {
        ConversorTemperatura conv = new ConversorTemperatura();
        assertEquals(0, conv.fahrenheitACelsius(32),0.0019);
    }

    @Test
    void testFahrenheitACelsiusNegativo() {
        ConversorTemperatura conv = new ConversorTemperatura();
        assertEquals(-40, conv.fahrenheitACelsius(-40),0.009);
    }

    @Test
    void testConversionInversa() {
        ConversorTemperatura conv = new ConversorTemperatura();
        double c = 37;
        double f = conv.celsiusAFahrenheit(c);
        assertEquals(c, conv.fahrenheitACelsius(f), 0.0001);
    }
}


