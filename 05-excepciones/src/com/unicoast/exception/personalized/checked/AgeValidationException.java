package com.unicoast.exception.personalized.checked;

/**
 * Excepción checked para validaciones de edad inválida.
 * Se lanza cuando la edad no cumple reglas de negocio (ej: menor de 18 años).
 * Obliga manejo (control) explícito para garantizar validación antes de procesar.
 */
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

