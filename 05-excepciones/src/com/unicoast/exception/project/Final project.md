# Práctica: Mejores Prácticas en el Manejo de Excepciones en Java

## Objetivo
Desarrollar un sistema simple de registro de tenistas que implemente las mejores prácticas de manejo de excepciones vistas en clase.

## Descripción
Deberás crear un programa en Java que permita gestionar un registro de tenistas, implementando validaciones tempranas, excepciones personalizadas y un manejo adecuado de los posibles errores.

## Requisitos

### Funcionalidades Básicas
1. Registrar nuevo tenista (id, nombre, edadD)
2. Eliminar tenistas existentes
3. Mostrar todos los tenistas registrados
4. Salir del programa

### Validaciones Obligatorias
- El nombre no puede estar vacío
- La edad debe estar entre 17 y 100 años
- El ID debe seguir el formato: una letra mayúscula seguida de 5 dígitos (ejemplo: A12345)
- No se pueden registrar dos tenistas con el mismo ID

### Excepciones a Implementar
1. Crear al menos dos excepciones personalizadas:
    - `DuplicatePlayerException`: para cuando se intenta registrar un tenista con un ID ya existente
    - `PlayertNotFoundException`: para cuando se intenta eliminar un tenista que no existe

2. Utilizar `IllegalArgumentException` para las validaciones de los parámetros

### Requisitos de Implementación
1. Aplicar el principio "Fail Fast": validar los parámetros al inicio de los métodos
2. Usar excepciones específicas, no genéricas
3. Proporcionar mensajes de error claros y útiles
4. Documentar las excepciones que puede lanzar cada método usando Javadoc
5. Implementar un manejo adecuado de las excepciones en la interfaz de usuario
6. Los mensajes que se muestran por consola deben estar en español
7. Clases, métodos y variables deben estar en inglés

## Estructura del Proyecto
Tu solución debe incluir al menos las siguientes clases:
- `PlayerRegistrationSystem`: clase principal que gestiona el registro
- `Player`: clase que representa a un tenista
- `PlayerDuplicateException`: excepción personalizada
- `PlayerNotFoundException`: excepción personalizada

## Ejemplo de Ejecución
```
Bienvenido al Sistema de Registro de Tenistas

1. Registrar tenista
2. Eliminar tenista
3. Mostrar todos los tenistas
4. Salir
Seleccione una opción: 1
Nombre: Novak
Edad: 38
ID (formato: A12345): A12345
Tenista registrado correctamente.

1. Registrar tenista
2. Eliminar tenista
3. Mostrar todos los tenistas
4. Salir
Seleccione una opción: 1
Nombre: Roger Federer
Edad: 17
Error de validación: La edad debe estar entre 18 y 100 años.

1. Registrar tenistas
2. Eliminar tenistas
3. Mostrar todos los tenistas
4. Salir
Seleccione una opción: 2
ID del tenista a eliminar: B12345
Error de búsqueda: No se encontró ningún tenista con ID: B12345.
```