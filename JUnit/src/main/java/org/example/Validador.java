package org.example;

public class Validador {

    public void procesarTexto(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        System.out.println("Texto procesado: " + texto);
    }
}

