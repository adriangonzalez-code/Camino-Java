# AGENTS.md - Guía para Agentes de IA en camino-java

## Arquitectura General
Este proyecto es un recurso educativo de documentación sobre fundamentos de Java. Consiste principalmente en un archivo `README.md` que cubre conceptos básicos de Java en español, con ejemplos de código y explicaciones detalladas.

## Patrones de Código y Convenciones
- **Nombrado**: Sigue convenciones Java estándar - `lowerCamelCase` para variables/métodos, `UpperCamelCase` para clases (ejemplo: `int[] numeros` en README.md línea 145).
- **Estructura de código**: Ejemplos usan bloques `{}` consistentes, con comentarios explicativos en español.
- **Salida**: Usa `System.out.println()` para ejemplos de consola (ejemplo: `System.out.println("Contador: " + contador);` línea 278).
- **Entrada**: Ejemplos incluyen `Scanner` para input de usuario (ejemplo: `numero = scanner.nextInt();` línea 289).
- **Arreglos**: Declaración con `tipo[] nombre = new tipo[tamaño];` o inicialización directa `tipo[] nombre = {valores};` (ejemplos líneas 145-158).
- **Bucles**: Prefiere `for` mejorado para arreglos (`for (int nota : notas)` línea 233), compara while vs do-while (líneas 346-354).
- **Condicionales**: Usa `if-else if-else` para categorías excluyentes, `if` múltiples independientes para validaciones paralelas (ejemplos líneas 447-547, 548-752).
- **Operadores**: Documenta precedencia en tabla (líneas 36-51), incluye tablas de verdad para lógicos (líneas 70-92).
- **Switch**: Incluye fall-through intencional para casos compartidos (ejemplo estaciones líneas 1112-1138).

## Flujos de Trabajo Críticos
- **Edición de contenido**: Modificar `README.md` para agregar conceptos o ejemplos. Usa previsualización markdown para verificar formato.
- **Validación**: Revisar ejemplos de código manualmente, ya que no hay compilación automática en el proyecto.

## Puntos de Integración
- **Documentación**: Todo contenido centralizado en `README.md`. No hay dependencias externas o APIs.
- **Idioma**: Explicaciones en español, código en inglés/Java estándar.

## Archivos Clave
- `README.md`: Archivo principal con toda la documentación y ejemplos de Java.</content>
<parameter name="filePath">C:\Workspace\camino-java\AGENTS.md
