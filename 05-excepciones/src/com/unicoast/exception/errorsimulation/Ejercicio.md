### Consigna:

**Objetivo:** Crear un programa en Java que simule un error, lo capture y muestre detalles del mismo, utilizando manejo de excepciones.

**Instrucciones:**

1. Crea una clase llamada `ErrorSimulation`.
2. Crear el método `simulateError()`. 
3. Dentro del método `main`, debes llamar a un método llamado `simulateError()`. 
4. En el método `simulateError()`, debes llamar a otro método llamado `causeError()`, que simule un error en la aplicación. 
5. El método `causeError()` debe lanzar una excepción personalizada (por ejemplo, `RuntimeException`), con un mensaje como "Se ha producido un error crítico". 
6. En el bloque `catch` dentro del método `main`, captura la excepción lanzada y muestra:
    - Un mensaje que indique que se detectó un error.
    - El mensaje de la excepción.
    - El StackTrace completo de la excepción.

**Resultado esperado:**

El programa debe simular un error y mostrar en la consola algo similar a lo siguiente:

```
Error detectado: Se ha producido un error crítico
Detalles del error:
java.lang.RuntimeException: Se ha producido un error crítico
    at ErrorSimulation.causeError(ErrorSimulation.java:12)
    at ErrorSimulation.simulateError(ErrorSimulation.java:8)
    at ErrorSimulation.main(ErrorSimulation.java:5)
```

---

Esta consigna no solo les enseña a manejar excepciones, sino también a entender cómo trabajar con el StackTrace y cómo propagar errores de un método a otro.