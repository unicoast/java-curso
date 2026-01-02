package com.unicoast.exception.personalized.unchecked;

/**
 * Excepción unchecked para saldos negativos en operaciones financieras.
 * Se lanza cuando un balance resulta negativo (ej: sobregiro no permitido).
 * No obliga manejo explícito (try-catch) en tiempo de compilación
 * Ideal para errores de lógica de negocio detectados en runtime.
 */
public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
