package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA DE CUENTA BANCARIA =====");
        CuentaBancaria cuenta = new CuentaBancaria(500);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(200);
        System.out.println("Después de depositar 200: " + cuenta.getSaldo());
        cuenta.retirar(150);
        System.out.println("Después de retirar 150: " + cuenta.getSaldo());

        try {
            cuenta.retirar(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }

        System.out.println("\n===== PRUEBA DE CONVERSOR DE TEMPERATURA =====");
        ConversorTemperatura conv = new ConversorTemperatura();
        double celsius = 25;
        double fahrenheit = conv.celsiusAFahrenheit(celsius);
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        double celsius2 = conv.fahrenheitACelsius(fahrenheit);
        System.out.println(fahrenheit + " °F = " + celsius2 + " °C");

        System.out.println("\n===== PRUEBA DE VALIDADOR =====");
        Validador val = new Validador();

        try {
            val.procesarTexto("Hola Mundo");
            val.procesarTexto("");
            //val.procesarTexto(null); // <----------esto lanza excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== FIN DE LAS PRUEBAS ===");
    }
}