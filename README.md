# Java Theory

## Convenciones, primitivos, expresiones, precedencia de operadores.

### Convenciones de nombres

Se refiere a la convención mas utilizada para declarar variables, clases. En Java, las clases empiezan con mayúsculas, las constantes son completamente en mayúsculas; las variables empiezan con minúsculas usando la notación lowerCamelCase

### Primitivos

Es el tipo de dato más basico de Java. Los tipos primitivos definidos en Java son:

* boolean
* byte
* char
* int
* short
* long
* float
* double

### Expresiones

Es un mecanismo para modificar el valor de una variable mediante operadores de asignación, aritméticos, lógicos.

### Precedencia de operadores

Se refiere a la prioridad que tienen los operadores al ejecutarse cuando se encuentran en una misma expresión. Por ejemplo, dada la expresión `i = 5 * 8 + 4 * 2` el resultado sería 48, porque la multiplicación tiene mayor precedencia que la suma.

Para modificar o alterar la precedencia podemos hacer uso de los paréntesis, como en una operación matemática o algebraica.

Todos los operadores binarios, con la excepción de los operadores de asignación, son evaluados de izquierda a derecha, los operadores de asignación son evaluados de derecha a izquierda. Los operadores de asignación son de menor precedencia.

#### Tabla de precedencia de operadores
º
| Precedencia | Operador | Descripción |
|-------------|----------|-------------|
| 1 (mayor) | `()` `[]` `.` | Paréntesis, corchetes, punto |
| 2 | `++` `--` `+` `-` `!` `~` | Operadores unarios, incremento/decremento |
| 3 | `*` `/` `%` | Multiplicación, división, módulo |
| 4 | `+` `-` | Suma, resta |
| 5 | `<<` `>>` `>>>` | Desplazamiento de bits |
| 6 | `<` `<=` `>` `>=` `instanceof` | Operadores relacionales |
| 7 | `==` `!=` | Igualdad |
| 8 | `&` | AND bit a bit |
| 9 | `^` | XOR bit a bit |
| 10 | `\|` | OR bit a bit |
| 11 | `&&` | AND lógico |
| 12 | `\|\|` | OR lógico |
| 13 | `? :` | Operador ternario |
| 14 (menor) | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` | Operadores de asignación |

### Operadores aritméticos

Son los operadores matemáticos.

### Operadores unitarios

Son aquellos que solamente tienen un operando.

### Operadores lógicos

Son operadores que trabajan con valores booleanos (true/false) y devuelven un resultado booleano. Los principales operadores lógicos en Java son:

* `&&` (AND lógico): Devuelve true solo si ambos operandos son true
* `||` (OR lógico): Devuelve true si al menos uno de los operandos es true
* `!` (NOT lógico): Invierte el valor booleano del operando

#### Tabla de verdad - AND lógico (&&)

| Operando A | Operando B | Resultado (A && B) |
|------------|------------|-------------------|
| true       | true       | true              |
| true       | false      | false             |
| false      | true       | false             |
| false      | false      | false             |

#### Tabla de verdad - OR lógico (||)

| Operando A | Operando B | Resultado (A \|\| B) |
|------------|------------|-------------------|
| true       | true       | true              |
| true       | false      | true              |
| false      | true       | true              |
| false      | false      | false             |

#### Tabla de verdad - NOT lógico (!)

| Operando A | Resultado (!A) |
|------------|----------------|
| true       | false          |
| false      | true           |

### Operadores lógicos binarios

Los operadores lógicos binarios (o bitwise operators) realizan operaciones bit a bit sobre tipos íntegros (`byte`, `short`, `int`, `long` y `char`). A diferencia de los operadores lógicos de cortocircuito (`&&`, `||`), estos evalúan ambos operandos y operan sobre cada bit correspondiente.

| Operador | Nombre | Descripción | Ejemplo (int a=5, b=3) | Resultado (Binario) |
|----------|--------|-------------|-------------------------|---------------------|
| `&` | AND bit a bit | Compara cada bit; devuelve 1 si ambos son 1. | `5 & 3` (0101 & 0011) | `1` (0001) |
| `\|` | OR bit a bit | Compara cada bit; devuelve 1 si al menos uno es 1. | `5 \| 3` (0101 \| 0011) | `7` (0111) |
| `^` | XOR bit a bit | Compara cada bit; devuelve 1 si son diferentes. | `5 ^ 3` (0101 ^ 0011) | `6` (0110) |
| `~` | NOT bit a bit | Invierte todos los bits del operando (unario). | `~5` (~0101) | `-6` (1010 en C2) |

#### Ejemplo de funcionamiento bit a bit:

Si tenemos `a = 5` (binario `0101`) y `b = 3` (binario `0011`):

| Operación | Bits | Resultado Binario | Resultado Decimal |
|-----------|------|-------------------|-------------------|
| **AND (&)** | `0101 & 0011` | `0001` | `1` |
| **OR (\|)** | `0101 \| 0011` | `0111` | `7` |
| **XOR (^)** | `0101 ^ 0011` | `0110` | `6` |

## Funciones

Una función es un conjunto de instrucciones representado con un nombre y puede ser ejecutado en varias ocasiones. Las funciones son útiles para organizar el código y reutilizar bloques de código. En Java, las funciones se definen utilizando la palabra clave `public` seguida del tipo de retorno (o `void` si no devuelve ningún valor) y el nombre de la función. Los parámetros se especifican entre paréntesis y se separan por comas. El cuerpo de la función se encierra entre llaves `{}`.

Ejemplo de función

```java
public int suma(int a, int b) {
    return a + b;
}
```

Aquí, `suma` es el nombre de la función, `int` es el tipo de retorno, `a` y `b` son los parámetros de la función y `return a + b` es el cuerpo de la función.

Para invocar una función, se utiliza su nombre seguido de paréntesis y los argumentos correspondientes. Por ejemplo, `suma(2, 3)` invocaría la función `suma` con los argumentos `2` y `3`, lo que devolvería `5`.

En programación, los parámetros formales son las variables declaradas en la definición de la función, a estos se les suele llamara parámetros, mientras que los parámetros reales son los valores pasados a la función cuando se invoca, a estos se les conoce como argumentos. Los parámetros reales se asignan a los parámetros formales durante la invocación de la función.

Los paréntesis son necesarios aún cuando la función no recibe ningún parámetro.

### Métodos

Técnicamente, un método es lo mismo que una función, pero con una diferencia, que el método es aplicado al paradigma orientado a objetos. En Java, los métodos son definidos dentro de una clase y pueden ser invocados en instancias de esa clase.

## Arreglos

Un arreglo es una secuencia de variables del mismo tipo, agrupadas bajo el mismo nombre. Para declarar un arreglo se utiliza la sintaxis `tipo[] nombreArreglo = new tipo[tamaño];`. Los elementos de un arreglo se acceden utilizando índices, que comienzan en `0` y terminan en `tamaño - 1`.

Ejemplo:
```java
int[] numeros = new int[5];
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
numeros[3] = 4;
numeros[4] = 5;
```

Aquí, `numeros` es un arreglo de enteros de tamaño `5`.

Otra forma de declarar un arreglo es utilizando la sintaxis `tipo[] nombreArreglo = {elemento1, elemento2, ..., elementoN};`. Por ejemplo:

```java
int[] numeros = {1, 2, 3, 4, 5};
```

Aquí, `numeros` es un arreglo de enteros de tamaño `5` con los elementos `1`, `2`, `3`, `4` y `5`.

Como dato curioso, en teoría, el último elemento de un arreglo no debería finalizar con una coma, pero, en el caso de Java, esto no es un error sintáctico y es aceptado por el compilador.

Para acceder a un elemento de un arreglo, se utiliza la sintaxis `nombreArreglo[indice]`.

Para obtener el tamaño de un arreglo, se utiliza la propiedad `length`, por ejemplo: `numeros.length` devuelve `5`.

Ejemplo para calcular el promedio, usando un arreglo:
```java
int[] notas = {10, 8, 9, 7, 10};
double suma = 0;
for (int i = 0; i < notas.length; i++) {
    suma += notas[i];
}
double promedio = suma / notas.length;
```
### Arreglos multidimensionales

Un arreglo multidimensional es un arreglo de arreglos. Para declarar un arreglo multidimensional se utiliza la sintaxis `tipo[][] nombreArreglo = new tipo[filas][columnas];`. Los elementos de un arreglo multidimensional se acceden utilizando índices, que comienzan en `0` y terminan en `filas - 1` y `columnas - 1`.

Ejemplo:
```java
// Declaración e inicialización tradicional
int[][] matriz = new int[2][2];
matriz[0][0] = 1;
matriz[0][1] = 2;
matriz[1][0] = 3;
matriz[1][1] = 4;

// Declaración e inicialización simplificada
int[][] tabla = {{1, 2}, {3, 4}};
```
Aquí, `matriz` y `tabla` son arreglos bidimensionales (matrices) de enteros de tamaño `2x2`.

Internamente, se vería como una tabla de la siguiente manera:
```
1 2
3 4
```
### Copiando arreglos

Java ofrece un mecanismo bastante eficiente para copiar un arreglo, utilizando el método `System.arraycopy(src, srcInitPos, dest, destInitPos, length)`.

## For y For mejorado

El ciclo `for` se utiliza para ejecutar un bloque de instrucciones un número determinado de veces.

```java
// Declaración e inicialización de un for tradicional
for (estado inicial; condicion; incremento) {
    instrucciones;
}
```

```java
// Ejemplo para calcular el promedio usando el for tradicional
double[] notas = {10, 8, 9, 7, 10};

double promedio(double[] notas) {
    double suma = 0;
    for (int i = 0; i < notas.length; i++) {
        suma += notas[i];
    }
    
    return suma / notas.length;
}
```

A partir de la versión 5 de Java, se implementó una forma mas compacta de usar un `for` para recorrer arreglos y otros tipos de datos.

```java
// Ejemplo paa calcular el promedio usando el for mejorado
for (int nota : notas) {
    suma += nota;
}
double promedio = suma / notas.length;
```

## Sobrecarga de métodos (method overloading)

La sobrecarga de métodos es una característica que permite definir varias funciones con el mismo nombre, pero con tipo de dato y/o número de parámetros.

```java
// Ejemplo de sobrecarga de métodos
public int suma(int a, int b) {
    return a + b;
}

public int suma(int a, int b, int c) {
    return a + b + c;
}

public double suma(double a, double b) {
    return a + b;
}

public double suma(double a, double b, double c) {
    return a + b + c;
}
```

## Ciclo while

El ciclo `while` se utiliza para ejecutar un bloque de instrucciones mientras una condición sea verdadera. La diferencia del ciclo `while` con el ciclo `for` es que el primero se utiliza generalmente cuando no se conoce de antemano el número de iteraciones.

```java
// Declaración e inicialización de un while tradicional
while (condicion) {
    instrucciones;
}
```

Ejemplo de ciclo while:
```java
// Ejemplo: Contar desde 1 hasta 5
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

Ejemplo: Leer valores hasta que el usuario ingrese -1:
```java
int numero = 0;
while (numero != -1) {
    System.out.println("Ingrese un número (-1 para salir):");
    numero = scanner.nextInt();
    if (numero != -1) {
        System.out.println("Número ingresado: " + numero);
    }
}
System.out.println("¡Salida!");
```

## Ciclo do-while

El ciclo `do-while` es una variante del ciclo `while`. La diferencia principal es que el bloque de instrucciones se ejecuta **al menos una vez**, ya que la condición se evalúa al final del ciclo.

```java
do {
    instrucciones;
} while (condicion);
```

Ejemplo de ciclo do-while:
```java
// Ejemplo: Mostrar un menú al menos una vez
int opcion = 0;
do {
    System.out.println("--- Menú ---");
    System.out.println("1. Opción 1");
    System.out.println("2. Opción 2");
    System.out.println("3. Salir");
    System.out.println("Seleccione una opción:");
    opcion = scanner.nextInt();
    
    if (opcion == 1) {
        System.out.println("Ejecutando opción 1...");
    } else if (opcion == 2) {
        System.out.println("Ejecutando opción 2...");
    } else if (opcion != 3) {
        System.out.println("Opción inválida, intente de nuevo.");
    }
} while (opcion != 3);

System.out.println("¡Hasta luego!");
```

Otro ejemplo: Validar entrada del usuario
```java
// Ejemplo: Validar que el usuario ingrese un número válido
int numero = 0;
do {
    System.out.println("Ingrese um número entre 1 y 10:");
    numero = scanner.nextInt();
    if (numero < 1 || numero > 10) {
        System.out.println("Número fuera de rango, intente de nuevo.");
    }
} while (numero < 1 || numero > 10);

System.out.println("Número válido: " + numero);
```

### Comparación entre while y do-while

| Característica | `while` | `do-while` |
|----------------|---------|------------|
| **Evaluación** | Evalúa la condición antes de entrar al bloque. | Evalúa la condición después de ejecutar el bloque. |
| **Ejecución mínima** | Puede no ejecutarse nunca si la condición es falsa desde el inicio. | Se ejecuta siempre al menos una vez. |
| **Uso común** | Cuando no se sabe si el bloque debe ejecutarse (ej. leer un archivo). | Cuando se requiere una acción previa a la validación (ej. mostrar un menú). |

Es importante notar que el `do-while` finaliza con un punto y coma (`;`) después del paréntesis de la condición.

## Bloques

Un bloque es un grupo de cero o más sentencias encerradas entre llaves `{}`. Los bloques pueden ser utilizados en cualquier lugar donde se permita una sentencia individual.

### Ámbito de las variables (Scope)

Las variables declaradas dentro de un bloque tienen un alcance limitado a ese bloque y a los bloques anidados dentro de él. Una vez que la ejecución sale del bloque, las variables declaradas en su interior dejan de existir.

```java
public void ejemploBloque() {
    int a = 10; // Visible en todo el método
    
    { // Inicio de un bloque anidado
        int b = 20; // Solo visible dentro de este bloque
        System.out.println(a + b); // 'a' es visible aquí
    } // Fin del bloque, 'b' es destruida
    
    // System.out.println(b); // Error de compilación: b no existe aquí
}
```

Los bloques son fundamentales para definir el cuerpo de clases, métodos y estructuras de control como `if`, `for` y `while`.

## Condiciones

Las condiciones en Java permiten ejecutar diferentes bloques de código dependiendo de si una expresión booleana es verdadera o falsa. La estructura básica es el `if`, que puede combinarse con `else if` y `else` para manejar múltiples casos.

### Sintaxis

```java
if (condición) {
    // Bloque de código si la condición es true
} else if (otraCondición) {
    // Bloque de código si otraCondición es true
} else {
    // Bloque de código si ninguna condición es true
}
```

### Ejemplos

#### Ejemplo 1: Verificar si un número es positivo, negativo o cero

```java
int numero = 5;
if (numero > 0) {
    System.out.println("El número es positivo");
} else if (numero < 0) {
    System.out.println("El número es negativo");
} else {
    System.out.println("El número es cero");
}
```

#### Ejemplo 2: Usando operadores lógicos en condiciones

```java
int edad = 20;
boolean tieneLicencia = true;
if (edad >= 18 && tieneLicencia) {
    System.out.println("Puede conducir");
} else {
    System.out.println("No puede conducir");
}
```

#### Ejemplo 3: Condición anidada

```java
int calificacion = 85;
if (calificacion >= 90) {
    System.out.println("Excelente");
} else if (calificacion >= 80) {
    System.out.println("Muy bien");
} else if (calificacion >= 70) {
    System.out.println("Bien");
} else {
    System.out.println("Necesita mejorar");
}
```

### If-else excluyente (if-else if-else)

El `if-else` excluyente se refiere a la estructura `if-else if-else`, donde solo **uno de los bloques se ejecuta**, ya que las condiciones son evaluadas en orden y, una vez que una condición se cumple, las demás no se evalúan. Esto es útil cuando las opciones son mutuamente excluyentes.

#### Diferencia con if múltiples independientes

| Tipo | Comportamiento | Uso |
|------|----------------|-----|
| **if-else if-else** | Solo uno de los bloques se ejecuta | Cuando las opciones son mutuamente excluyentes |
| **if múltiples independientes** | Múltiples bloques pueden ejecutarse | Cuando hay validaciones o acciones independientes |

#### Ejemplo 1: Clasificación por edad

```java
int edad = 25;

if (edad < 13) {
    System.out.println("Niño");
} else if (edad < 18) {
    System.out.println("Adolescente");
} else if (edad < 65) {
    System.out.println("Adulto");
} else {
    System.out.println("Adulto mayor");
}

// Output: Adulto (solo uno se ejecuta)
```

#### Ejemplo 2: Sistema de calificaciones

```java
int calificacion = 85;

if (calificacion >= 90) {
    System.out.println("A - Excelente");
} else if (calificacion >= 80) {
    System.out.println("B - Muy bien");
} else if (calificacion >= 70) {
    System.out.println("C - Bien");
} else if (calificacion >= 60) {
    System.out.println("D - Suficiente");
} else {
    System.out.println("F - Reprobado");
}

// Output: B - Muy bien
```

#### Ejemplo 3: Comparación con múltiples if independientes

```java
// OPCIÓN 1: if-else if-else (exclusivo - solo uno se ejecuta)
int puntos = 150;

if (puntos >= 200) {
    System.out.println("Oro");
} else if (puntos >= 100) {
    System.out.println("Plata");      // Se ejecuta esto
} else if (puntos >= 50) {
    System.out.println("Bronce");
} else {
    System.out.println("Sin medalla");
}

// Output: Plata (solo una salida)
```

```java
// OPCIÓN 2: Múltiples if independientes (pueden ejecutarse varios)
int puntos = 150;

if (puntos >= 200) {
    System.out.println("Oro");
}

if (puntos >= 100) {
    System.out.println("Plata");      // Se ejecuta
}

if (puntos >= 50) {
    System.out.println("Bronce");     // Se ejecuta
}

// Output: Plata y Bronce (dos salidas)
```

#### Ejemplo 4: Menú de opciones

```java
int opcion = 2;

if (opcion == 1) {
    System.out.println("Seleccionó opción 1: Ver perfil");
} else if (opcion == 2) {
    System.out.println("Seleccionó opción 2: Editar configuración");
} else if (opcion == 3) {
    System.out.println("Seleccionó opción 3: Salir");
} else {
    System.out.println("Opción inválida");
}

// Output: Seleccionó opción 2: Editar configuración
```

#### Resumen

- **if-else if-else**: Ideal para **categorías mutuamente excluyentes** donde solo una condición puede ser verdadera.
- Se detiene en la primera condición verdadera encontrada.
- Más eficiente que múltiples `if` cuando las condiciones son excluyentes, ya que evita evaluaciones innecesarias.

### If-else múltiples e independientes

Un if-else múltiple independiente se refiere a cuando se tienen varias condiciones `if` sin usar `else if`, permitiendo que **más de una condición se cumpla y ejecute** simultáneamente. Esto es diferente a la estructura `if-else if-else`, donde se ejecuta uno de los bloques.

#### Diferencia entre if-else if-else e if múltiples independientes

| Tipo | Comportamiento | Uso |
|------|----------------|-----|
| **if-else if-else** | Solo uno de los bloques se ejecuta | Cuando las condiciones son mutuamente excluyentes |
| **if múltiples independientes** | Múltiples bloques pueden ejecutarse | Cuando hay validaciones o acciones independientes |

#### Ejemplo 1: Validaciones independientes (múltiples condiciones se pueden cumplir)

```java
// Validar datos de un usuario
int edad = 25;
boolean tieneLicencia = true;
boolean tieveExperiencia = true;
double saldo = 5000;

// Múltiples validaciones independientes
if (edad >= 18) {
    System.out.println("✓ Es mayor de edad");
}

if (tieneLicencia) {
    System.out.println("✓ Tiene licencia de conducir");
}

if (tieveExperiencia) {
    System.out.println("✓ Tiene experiencia");
}

if (saldo >= 1000) {
    System.out.println("✓ Saldo suficiente para el viaje");
}

// Los cuatro bloques se ejecutan porque todas las condiciones son true
```

Output:
```
✓ Es mayor de edad
✓ Tiene licencia de conducir
✓ Tiene experiencia
✓ Saldo suficiente para el viaje
```

#### Ejemplo 2: Múltiples condiciones con acciones en paralelo

```java
// Sistema de permisos de acceso
int rol = 1; // 1=Admin, 2=Editor, 3=Lector
boolean activo = true;
boolean verificado = true;

if (rol == 1 || rol == 2) {
    System.out.println("Acceso a edición permitido");
}

if (activo) {
    System.out.println("Cuenta activa");
}

if (verificado) {
    System.out.println("Cuenta verificada");
}

if ((rol == 1 || rol == 2) && activo && verificado) {
    System.out.println("Acceso completo otorgado");
}
```

Output:
```
Acceso a edición permitido
Cuenta activa
Cuenta verificada
Acceso completo otorgado
```

#### Ejemplo 3: Comparación - if-else if-else e if múltiples independientes

```java
// OPCIÓN 1: if-else if-else (exclusivo - solo uno se ejecuta)
int puntos = 150;

if (puntos >= 200) {
    System.out.println("Oro");
} else if (puntos >= 100) {
    System.out.println("Plata");      // Se ejecuta esto
} else if (puntos >= 50) {
    System.out.println("Bronce");
} else {
    System.out.println("Sin medalla");
}

// Output: Plata (solo una salida)
```

```java
// OPCIÓN 2: Múltiples if independientes (pueden ejecutarse varios)
int puntos = 150;
boolean esActivo = true;
int experiencia = 5;

if (puntos >= 200) {
    System.out.println("Oro");
}

if (puntos >= 100) {
    System.out.println("Plata");      // Se ejecuta
}

if (puntos >= 50) {
    System.out.println("Bronce");     // Se ejecuta
}

if (esActivo) {
    System.out.println("Cuenta activa");  // Se ejecuta
}

if (experiencia >= 3) {
    System.out.println("Veterano");   // Se ejecuta
}

// Output: Múltiples líneas (varias condiciones se cumplen)
```

#### Ejemplo 4: Validación de formulario con múltiples condiciones

```java
String nombre = "Juan";
String email = "juan@example.com";
int edad = 25;
String contraseña = "MiContraseña123";

boolean errores = false;

// Cada validación es independiente
if (nombre == null || nombre.isEmpty()) {
    System.out.println("Error: El nombre es requerido");
    errores = true;
}

if (email == null || !email.contains("@")) {
    System.out.println("Error: Email inválido");
    errores = true;
}

if (edad < 18) {
    System.out.println("Error: Debe ser mayor de 18 años");
    errores = true;
}

if (contraseña.length() < 8) {
    System.out.println("Error: La contraseña debe tener al menos 8 caracteres");
    errores = true;
}

if (!errores) {
    System.out.println("✓ Formulario válido, registro completado");
} else {
    System.out.println("✗ Corrija los errores anteriores");
}
```

Output (en este caso todas las validaciones pasan):
```
✓ Formulario válido, registro completado
```

#### Ejemplo 5: Sistema de puntuación con múltiples logros

```java
// Un jugador puede obtener múltiples logros en una misma acción
int puntosObtenidos = 150;
int enemigosDerotados = 5;
boolean completoMision = true;

// Múltiples if para múltiples logros
if (puntosObtenidos >= 100) {
    System.out.println("🏅 Logro 1: Acumuló 100 puntos");
}

if (enemigosDerotados >= 3) {
    System.out.println("🏅 Logro 2: Derrotó 3 enemigos");
}

if (completoMision) {
    System.out.println("🏅 Logro 3: Misión completada");
}

if (puntosObtenidos >= 100 && enemigosDerotados >= 3 && completoMision) {
    System.out.println("🏆 Logro maestro: ¡Completiste todo!");
}
```

Output:
```
🏅 Logro 1: Acumuló 100 puntos
🏅 Logro 2: Derrotó 3 enemigos
🏅 Logro 3: Misión completada
🏆 Logro maestro: ¡Completiste todo!
```

## Operador ?

El operador ternario `?` es un operador condicional que permite asignar un valor basado en una condición booleana. Es una forma compacta de escribir una estructura `if-else` en una sola línea.

### Sintaxis

```java
condición ? valor_si_verdadero : valor_si_falso
```

- **condición**: Una expresión booleana que se evalúa.
- **valor_si_verdadero**: El valor que se asigna si la condición es `true`.
- **valor_si_falso**: El valor que se asigna si la condición es `false`.

### Ejemplo

```java
int edad = 20;
String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(mensaje); // Output: Mayor de edad
```

En este ejemplo, si `edad` es mayor o igual a 18, `mensaje` se asigna "Mayor de edad"; de lo contrario, "Menor de edad".

### Comparaciones

El operador ternario es útil para asignaciones simples, pero para lógica más compleja, es preferible usar `if-else` para mayor claridad.

#### Comparación con if-else

```java
// Usando if-else
int a = 5;
int b = 10;
int c = 15;
int max;
if (a > b && a > c) {
    max = a;
} else if (b > c) {
    max = b;
} else {
    max = c;
}

// Usando operador ternario
int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
```
## Sentencias break y continue

Las sentencias `break` y `continue` son utilizadas para controlar el flujo de ejecución en bucles y sentencias `switch`. Permiten alterar el comportamiento normal de las iteraciones o salidas de bloques.

### Sentencia break

La sentencia `break` se utiliza para salir inmediatamente de un bucle o de una sentencia `switch`. Cuando se ejecuta `break`, la ejecución del programa continúa con la siguiente instrucción después del bucle o `switch`.

#### Uso en bucles

En bucles (`for`, `while`, `do-while`), `break` termina el bucle por completo, independientemente de la condición del bucle.

**Ejemplo en un bucle for:**

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sale del bucle cuando i es 5
    }
    System.out.println("i: " + i);
}
// Output: i: 0, i: 1, i: 2, i: 3, i: 4
```

En este ejemplo, el bucle se detiene cuando `i` alcanza 5, sin imprimir los valores posteriores.

**Ejemplo en un bucle while:**

```java
int contador = 0;
while (contador < 10) {
    if (contador == 7) {
        break; // Sale del bucle cuando contador es 7
    }
    System.out.println("Contador: " + contador);
    contador++;
}
// Output: Contador: 0, 1, 2, 3, 4, 5, 6
```

#### Uso en switch

En una sentencia `switch`, `break` se utiliza para salir del bloque `switch` después de ejecutar el caso correspondiente, evitando que se ejecuten los casos siguientes (conocido como "fall-through").

**Ejemplo:**

```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    case 6:
        System.out.println("Sábado");
        break;
    case 7:
        System.out.println("Domingo");
        break;
    default:
        System.out.println("Día inválido");
        break;
}

// Output: Miércoles
```

Sin `break`, todos los casos después del coincidente se ejecutarían.

### Sentencia continue

La sentencia `continue` se utiliza en bucles para saltar la iteración actual y pasar a la siguiente iteración. No termina el bucle, solo omite el resto del código en la iteración actual.

#### Uso en bucles

**Ejemplo en un bucle for:**

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Salta los números pares
    }
    System.out.println("i impar: " + i);
}
// Output: i impar: 1, 3, 5, 7, 9
```

Aquí, cuando `i` es par, `continue` salta a la siguiente iteración, omitiendo la impresión.

**Ejemplo en un bucle while:**

```java
int numero = 0;
while (numero < 10) {
    numero++;
    if (numero % 3 == 0) {
        continue; // Salta múltiplos de 3
    }
    System.out.println("Número: " + numero);
}
// Output: Número: 1, 2, 4, 5, 7, 8, 10
```

Nota: En este caso, `numero++` se ejecuta antes de `continue`, por lo que 3,6,9 se saltan después del incremento.

### Comparaciones

#### Break vs Continue

| Característica | `break` | `continue` |
|----------------|---------|------------|
| **Función** | Sale completamente del bucle o switch | Salta a la siguiente iteración del bucle |
| **Uso en switch** | Sí, para evitar fall-through | No aplicable |
| **Termina el bucle** | Sí | No |
| **Ejemplo típico** | Buscar un elemento y detenerse al encontrarlo | Omitir ciertos elementos en el procesamiento |

**Ejemplo comparativo:**

```java
// Usando break: Detiene al encontrar el primer número negativo
int[] numeros = {1, 2, -3, 4, 5};
for (int num : numeros) {
    if (num < 0) {
        System.out.println("Encontrado negativo: " + num);
        break;
    }
    System.out.println("Procesando: " + num);
}
// Output: Procesando: 1, Procesando: 2, Encontrado negativo: -3
```

```java
// Usando continue: Omite números negativos pero continúa
for (int num : numeros) {
    if (num < 0) {
        continue;
    }
    System.out.println("Procesando: " + num);
}
// Output: Procesando: 1, Procesando: 2, Procesando: 4, Procesando: 5
```

#### Break en bucles anidados

En bucles anidados, `break` solo sale del bucle más interno. Para salir de bucles externos, se pueden usar etiquetas (labeled breaks).

**Ejemplo:**

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 2) {
            break; // Sale solo del bucle interno
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
// Output: i:0 j:0, i:0 j:1, i:1 j:0, i:1 j:1, i:2 j:0, i:2 j:1
```

**Con etiqueta:**

```java
etiqueta:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 2) {
            break etiqueta; // Sale del bucle externo
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
// Output: i:0 j:0, i:0 j:1
```

`continue` también puede usar etiquetas para saltar iteraciones en bucles externos.

Estas sentencias son útiles para optimizar el código y controlar el flujo de manera eficiente en situaciones específicas.

## Switch

La sentencia `switch` en Java permite ejecutar una de varias opciones basadas en el valor de una expresión. Es útil para reemplazar múltiples `if-else if` cuando se compara una variable con varios valores constantes.

### Sintaxis

```java
switch (expresión) {
    case valor1:
        // código a ejecutar si expresión == valor1
        break;
    case valor2:
        // código a ejecutar si expresión == valor2
        break;
    // más casos...
    default:
        // código a ejecutar si ninguno de los casos coincide
        break;
}
```

### Ejemplos

#### Ejemplo 1: Días de la semana

```java
int dia = 3;
String nombreDia;

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";
        break;
    case 4:
        nombreDia = "Jueves";
        break;
    case 5:
        nombreDia = "Viernes";
        break;
    case 6:
        nombreDia = "Sábado";
        break;
    case 7:
        nombreDia = "Domingo";
        break;
    default:
        nombreDia = "Día inválido";
        break;
}

System.out.println("El día es: " + nombreDia);
```

#### Ejemplo 2: Operaciones matemáticas

```java
char operador = '+';
int a = 10, b = 5;
int resultado = 0;

switch (operador) {
    case '+':
        resultado = a + b;
        break;
    case '-':
        resultado = a - b;
        break;
    case '*':
        resultado = a * b;
        break;
    case '/':
        if (b != 0) {
            resultado = a / b;
        } else {
            System.out.println("Error: División por cero");
        }
        break;
    default:
        System.out.println("Operador inválido");
        break;
}

System.out.println("Resultado: " + resultado);
```

#### Ejemplo 3: Switch con strings (Java 7+)

```java
String fruta = "manzana";
String color;

switch (fruta) {
    case "manzana":
        color = "rojo o verde";
        break;
    case "banana":
        color = "amarillo";
        break;
    case "uva":
        color = "morado";
        break;
    default:
        color = "desconocido";
        break;
}

System.out.println("La fruta " + fruta + " es de color " + color);
```

#### Ejemplo 4: Fall-through (sin break)

```java
int mes = 2;
String estacion;

switch (mes) {
    case 12:
    case 1:
    case 2:
        estacion = "Invierno";
        break;
    case 3:
    case 4:
    case 5:
        estacion = "Primavera";
        break;
    case 6:
    case 7:
    case 8:
        estacion = "Verano";
        break;
    case 9:
    case 10:
    case 11:
        estacion = "Otoño";
        break;
    default:
        estacion = "Mes inválido";
        break;
}

System.out.println("La estación es: " + estacion);
```

En este ejemplo, varios casos comparten el mismo bloque de código sin `break`, permitiendo que múltiples valores lleven a la misma asignación.

#### Ejemplo 5: Fall-through con acciones acumuladas

```java
char letra = 'b';
String mensaje = "";

switch (letra) {
    case 'a':
        mensaje += "Vocal ";
    case 'b':
        mensaje += "Consonante ";
    case 'c':
        mensaje += "Letra ";
        break;
    default:
        mensaje = "No es una letra válida";
        break;
}

System.out.println(mensaje); // Output: Consonante Letra
```

Aquí, cuando `letra` es 'b', se ejecutan los casos 'b' y 'c' debido a la ausencia de `break`, acumulando el mensaje.

### Clases y Objetos

Una **clase** es una plantilla o molde que define la estructura y el comportamiento de un tipo de dato. Se compone principalmente de:
*   **Atributos (Estado):** Variables que representan las características de la clase.
*   **Métodos (Comportamiento):** Funciones que definen las acciones que puede realizar la clase.

Un **objeto** es una instancia concreta de una clase. Mientras que la clase es el plano, el objeto es la casa construida.

```java
// Definición de una clase
public class CalculadoraPromedio {
    
    // Atributos (Estado)
    private double suma;
    private int contador;

    // Constructor: Método especial para inicializar objetos
    public CalculadoraPromedio() {
        this.suma = 0;
        this.contador = 0;
    }
    
    // Métodos (Comportamiento)
    public void agregarValor(double valor) {
        suma += valor;
        contador++;
    }
    
    public double obtenerPromedio() {
        if (contador == 0) return 0;
        return suma / contador;
    }
}

// Creación de un objeto a partir de una clase
CalculadoraPromedio miCalculadora = new CalculadoraPromedio();
miCalculadora.agregarValor(10.0);
miCalculadora.agregarValor(20.0);
        miCalculadora.agregarValor(30.0);
        System.out.println("Promedio: " + miCalculadora.obtenerPromedio()); // Output: 20.0
    }
}
```

### Referencias y Memoria

En Java, las variables de tipo objeto son **referencias**. Cuando declaramos una variable de una clase, no estamos guardando el objeto directamente en la variable, sino una dirección de memoria que apunta a donde reside el objeto (en el *Heap*).

En Java, la memoria se divide principalmente en dos áreas: **Stack** (Pila) y **Heap** (Montículo).

| Característica | Stack (Pila) | Heap (Montículo) |
| :--- | :--- | :--- |
| **Contenido** | Variables locales y llamadas a métodos. | Objetos y variables de instancia. |
| **Acceso** | LIFO (Last-In-First-Out). Muy rápido. | Acceso aleatorio. Más lento que el Stack. |
| **Gestión** | Automática al entrar/salir de un bloque. | Gestionada por el Garbage Collector. |
| **Ciclo de vida** | Vive mientras el método esté en ejecución. | Vive mientras tenga una referencia activa. |

**Ejemplo visual:**
```java
int edad = 25; // Stack: guarda el valor 25
CalculadoraPromedio calc1 = new CalculadoraPromedio(); // Stack: guarda la dirección (ref). Heap: guarda el objeto.
CalculadoraPromedio calc2 = calc1; // Stack: guarda la misma dirección que calc1.
```

Si ejecutamos `calc1.agregarValor(50);`, el objeto en el **Heap** cambia, y como `calc2` apunta a esa misma dirección, `calc2.obtenerPromedio()` también reflejará el cambio.


### La palabra reservada `null`

Cuando una variable de un objeto es nueva, no hace referencia a ningún objeto en particular su valor es igual a `null`. La palabra reservada `null` representa un objeto, pero en realidad significa que la variable no hace referencia a nada.

### El operador `this`

La palabra clave `this` hace referencia a la instancia actual de la clase. Se utiliza principalmente para:
1.  Diferenciar atributos de parámetros cuando tienen el mismo nombre.
2.  Invocar constructores desde otros constructores de la misma clase.

### Constructores

Un constructor es un método especial que sirve para inicializar un objeto, que se llama automáticamente al crear una instancia con `new`. Las características de un constructor son:

*   Tiene el mismo nombre que la clase.
*   No tiene tipo de retorno (ni siquiera `void`).
*   Si no defines uno, Java crea un **constructor por defecto** sin parámetros.

### Modificadores de Acceso (Encapsulamiento)

Permiten controlar la visibilidad de los miembros de una clase:

*   `public`: Accesible desde cualquier clase.
*   `private`: Accesible solo dentro de la misma clase (fundamental para proteger el estado del objeto).
*   `protected`: Accesible en la misma clase, subclases y mismo paquete.
*   *(Default/Package-private)*: Si no se especifica, es accesible solo dentro del mismo paquete.

### ¿Cómo se libera la memoria usada por los objetos?

En Java, no existe una forma manual o directa de liberar la memoria (como el `free` en C o `delete` en C++). Esto se debe a que Java utiliza un mecanismo automático llamado **Garbage Collector (Recolector de Basura)**.

#### El Garbage Collector (GC)

El GC es un proceso de baja prioridad que se encarga de identificar y eliminar los objetos que ya no son alcanzables por el programa (objetos sin ninguna referencia activa en el *Stack*).

*   **Funcionamiento:** Periódicamente, el GC rastrea el *Heap* buscando objetos que no tienen referencias. Una vez identificados, libera el espacio que ocupaban para que pueda ser reutilizado.
*   **Elegibilidad:** Un objeto es elegible para la recolección cuando:
    1.  Su referencia se establece explícitamente a `null`.
    2.  La variable de referencia sale de su ámbito (*scope*).
    3.  El objeto queda aislado en una "isla de aislamiento" (referencias circulares entre objetos que no son alcanzables desde el hilo principal).

#### ¿Se puede forzar el GC?

Aunque existe el método `System.gc()`, este es solo una **sugerencia** al sistema operativo. Java no garantiza que la recolección ocurra inmediatamente después de llamar a este método. La gestión eficiente de la memoria es una de las mayores ventajas de la Máquina Virtual de Java (JVM), ya que reduce drásticamente los errores de fugas de memoria (*memory leaks*) y punteros colgantes.

#### El método `finalize()`
Históricamente, los objetos podían usar el método `finalize()` para ejecutar código de limpieza antes de ser recolectados, pero desde Java 9 este método está **depreciado** debido a problemas de rendimiento y fiabilidad. Actualmente se recomienda el uso de bloques `try-with-resources` o la interfaz `AutoCloseable` para gestionar recursos externos (como archivos o conexiones a bases de datos).

### Variables mutables e inmutables

En Java, es importante entender el concepto de **mutabilidad**, que se refiere a si una variable puede cambiar su valor después de ser asignada.

#### Variables Mutables

Las variables mutables son aquellas cuyo valor **puede cambiar** después de la inicialización. La mayoría de variables en Java son mutables por defecto.

**Ejemplos de variables mutables:**

```java
// Variables primitivas mutables
int contador = 5;
contador = 10;  // Se puede cambiar el valor
System.out.println(contador); // Output: 10

double temperatura = 25.5;
temperatura = 30.0; // Se puede cambiar
System.out.println(temperatura); // Output: 30.0

// Objetos mutables (como StringBuilder)
StringBuilder texto = new StringBuilder("Hola");
texto.append(" Mundo"); // Se modifica el contenido
System.out.println(texto); // Output: Hola Mundo

// Arrays (siempre son mutables)
int[] numeros = {1, 2, 3};
numeros[0] = 10; // Se puede cambiar un elemento
System.out.println(numeros[0]); // Output: 10
```

**Características de variables mutables:**
- El valor puede modificarse después de la asignación
- Ocupan espacio en memoria que puede ser actualizado
- Permiten cambios dinámicos durante la ejecución del programa
- Ejemplo: `int x = 5; x = 10;` ✓ Permitido

#### Variables Inmutables

Las variables inmutables son aquellas cuyo valor **no puede cambiar** una vez asignadas. En Java, se crean principalmente usando la palabra clave `final`.

**Ejemplos de variables inmutables:**

```java
// Variables primitivas inmutables
final int MAXIMA_EDAD = 100;
// MAXIMA_EDAD = 150; // ❌ Error de compilación

final String nombre = "Juan";
// nombre = "Carlos"; // ❌ Error de compilación

// Constantes (por convención, se escriben en mayúsculas)
final double PI = 3.14159;
final int DIAS_POR_SEMANA = 7;

// Objetos inmutables (como String)
String mensaje = "Programación en Java";
// No se puede cambiar el contenido original
String nuevoMensaje = mensaje + " es divertida"; // Crea una cadena nueva
System.out.println(mensaje); // Output: Programación en Java (sin cambios)
System.out.println(nuevoMensaje); // Output: Programación en Java es divertida
```

**Características de variables inmutables:**
- El valor se asigna una única vez
- No puede modificarse después de la inicialización
- Proporciona mayor seguridad y predecibilidad
- Las cadenas (String) en Java son inmutables
- Se declaran con la palabra clave `final`

#### Comparación: Mutable vs Inmutable

```java
// MUTABLE - Puede cambiar
int edad = 25;
edad = 26; // ✓ Permitido
System.out.println("Edad mutable: " + edad); // Output: 26

// INMUTABLE - No puede cambiar
final int PESO_MAXIMO = 100;
// PESO_MAXIMO = 101; // ✗ Error: cannot assign a value to final variable

// Con objetos
StringBuilder sb1 = new StringBuilder("Texto"); // Mutable
sb1.append(" añadido"); // Se modifica in-place
System.out.println(sb1); // Output: Texto añadido

String s1 = "Texto"; // Inmutable
String s2 = s1 + " añadido"; // Crea una cadena nueva
System.out.println(s1); // Output: Texto (Sin cambios)
System.out.println(s2); // Output: Texto añadido
```

#### Objetos Mutables e Inmutables en Java

**Objetos Inmutables del sistema:**
- `String` - Cadenas de texto
- `Integer`, `Double`, `Boolean` - Números y booleanos envueltos
- `BigDecimal` - Números decimales de precisión alta
- `LocalDate`, `LocalTime` - Fechas y horas

**Objetos Mutables del sistema:**
- `StringBuilder` - Cadenas modificables (alternativa a String)
- `ArrayList` - Listas dinámicas
- `HashMap` - Mapas de pares clave-valor
- `StringBuffer` - Versión sincronizada de StringBuilder

#### Ventajas de usar Variables Inmutables

```java
// 1. Seguridad: No hay sorpresas de cambio de valor
final String nombrePerfil = "Usuario123";
procesarPerfil(nombrePerfil); // Se garantiza que no cambiará

// 2. Claridad de intención: final indica que no debe cambiar
final int INTENTOS_MAXIMOS = 3;
for (int i = 0; i < INTENTOS_MAXIMOS; i++) {
    // El lector sabe que INTENTOS_MAXIMOS es una constante
}

// 3. Eficiencia en threads: No hay riesgo de condiciones de carrera
final Object canastaDatos = new Object();
// Múltiples threads pueden acceder de forma segura

// 4. Caché e Optimización: El compilador puede optimizar mejor
final int constant = 100;
int resultado = constant * 5; // Puede calcularse en compilación
```

#### Cuándo usar cada una

**Usa variables MUTABLES cuando:**
- El valor necesita cambiar durante la ejecución (contadores, acumuladores)
- Trabajas con colecciones que se modifican
- Necesitas actualizar estados

**Usa variables INMUTABLES (final) cuando:**
- Es una constante o valor fijo
- Quieres evitar cambios accidentales
- Trabajas en programación concurrente
- Mejora la lectura y comprensión del código

```java
// Buen ejemplo: Mezcla apropiada
final int DESCUENTO_PORCENTAJE = 10; // Constante
double precioOriginal = 100.0; // Mutable (puede variar)
double precioFinal = precioOriginal - (precioOriginal * DESCUENTO_PORCENTAJE / 100);
precioOriginal = 150.0; // Se puede cambiar
precioFinal = precioOriginal - (precioOriginal * DESCUENTO_PORCENTAJE / 100);
```
## Introducción a las Excepciones

Las excepciones son mecanismos fundamentales en Java para manejar errores y situaciones excepcionales que pueden ocurrir durante la ejecución de un programa. En lugar de permitir que el programa se detenga abruptamente, las excepciones permiten que el código maneje estos casos de manera controlada, proporcionando una forma ordenada de recuperarse de errores y garantizar la estabilidad del sistema.

El mecanismo de una excepción funciona de la siguiente manera: cuando se produce una excepción, el programa genera un objeto especial de clase Exception que representa la excepción y se propaga hacia arriba en la pila de llamadas hasta que se encuentra un bloque de código que la maneja adecuadamente. Si no se encuentra ningún bloque de manejo adecuado, el programa finaliza con un mensaje de error.

### Tipos de Excepciones

Java divide las excepciones en dos categorías principales:

1. **Excepciones comprobadas (Checked Exceptions)**: Estas excepciones deben ser declaradas en el método que las lanza o capturadas en el bloque de código que las maneja. Son comunes en situaciones como lectura de archivos, acceso a bases de datos, etc.

2. **Excepciones no comprobadas, o de ejecución (Unchecked Exceptions)**: Estas excepciones no necesitan ser declaradas ni capturadas explícitamente.

### Manejar excepciones

Para manejar excepciones, se utilizan bloques try-catch. El bloque try contiene el código que podría generar una excepción, mientras que el bloque catch captura y maneja la excepción. Aquí hay un ejemplo básico:

```java
try {
    // Código que podría generar una excepción
} catch (ExceptionType exceptionName) {
    // Código para manejar la excepción
}
```

El bloque catch puede manejar múltiples tipos de excepciones utilizando múltiples bloques catch, o utilizando una sola excepción que capture todas las excepciones comunes. También se puede utilizar un bloque finally para ejecutar código después de que se maneje la excepción, independientemente de si se capturó o no.

```java
try {
    // Código que podría generar una excepción
} catch (ExceptionType exceptionName) {
    // Código para manejar la excepción
} catch (AnotherExceptionType anotherExceptionName) {
    // Código para manejar otra excepción
} finally {
    // Código que se ejecuta siempre, independientemente de si se capturó la excepción
}
```

Es importante manejar adecuadamente las excepciones para evitar errores y garantizar la estabilidad del programa. También es importante mencionar que el orden importa, ya que las excepciones se manejan de arriba hacia abajo en el bloque `catch`.

### Propagación de excepciones

La propagación de excepciones se refiere a la capacidad de una función o método para pasar una excepción a la función o método que la llamó. Esto permite que el código superior maneje la excepción en lugar de tener que manejarla en cada nivel individualmente. La propagación de excepciones se logra simplemente permitiendo que la excepción se propague hacia arriba en la pila de llamadas sin capturarla explícitamente.

```java
public void metodoA() {
    try {
        metodoB(); // Si metodoB lanza una excepción, se propagará a metodoA
    } catch (ExceptionType exceptionName) {
        // Código para manejar la excepción en metodoA
    }
}

public void metodoB() {
    metodoC(); // Si metodoC lanza una excepción, se propagará a metodoB
}

public void metodoC() {
    // Código que podría generar una excepción
}
```

### Uso de throw y throws

El uso de `throw` se utiliza dentro de un método para generar una excepción explícitamente. Por otro lado, `throws` se utiliza en la declaración de un método para indicar que el método puede lanzar una excepción. Esto permite que el código que llama al método maneje la excepción de manera adecuada.

## Métodos y campos estáticos, variables finales

Los métodos estáticos son más parecidos a las funciones en otros lenguajes como C. Estos métodos pertenecen a la clase en sí misma y no requieren una instancia de la clase para ser llamados. Se utilizan comúnmente para operaciones que no dependen de un estado específico de la instancia, como operaciones matemáticas o utilidades generales.

Los campos son variables que pertenecen a una clase en lugar de una instancia específica de la clase. Se utilizan para almacenar datos compartidos entre todas las instancias de la clase. Se declaran con la palabra clave `static`. Las variables finales son campos que no pueden ser modificados después de su inicialización.

## Constantes, Control de Acceso, Enums

### Constantes

Las constantes son valores que no cambian durante la ejecución del programa. En Java, se declaran utilizando la palabra clave `final`. Las constantes pueden ser de cualquier tipo, incluyendo primitivos, cadenas y referencias a objetos. Por convención, los nombres de las constantes se escriben en mayúsculas y se separan con guiones bajos.

```java
final int MAX_VALUE = 100;
final String PI = "3.14159";
final List<String> DAYS_OF_WEEK = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
```

Un aspecto curioso de las constantes es que, al ser evaluadas mediante una condicional `if-else`, el compilador lo que hace es que quita o elimina el código que no se ejecutará, lo que puede mejorar el rendimiento del programa.

### Control de Acceso

El control de acceso en Java se realiza mediante modificadores de acceso que determinan la visibilidad y el alcance de las clases, métodos y campos. Los modificadores de acceso disponibles son `public`, `private`, `protected` y `default` (sin modificador).

- `public`: El elemento es accesible desde cualquier clase.
- `private`: El elemento es accesible solo desde la misma clase.
- `protected`: El elemento es accesible desde la misma clase y desde clases que heredan de ella.
- `default` (sin modificador): El elemento es accesible solo desde clases del mismo paquete.

El uso adecuado del control de acceso ayuda a mantener la encapsulación y la seguridad de los datos en la aplicación.

### Enum

Los enums son una forma de definir un conjunto de constantes con nombres significativos y tipos específicos. Se utilizan para representar valores discretos y limitados, como días de la semana, estados de un sistema o opciones de configuración.

```java
public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

Los enums proporcionan una forma segura y legible de trabajar con valores constantes en Java. Además, los enums pueden tener métodos y campos, lo que los hace más versátiles que las constantes tradicionales. Por ejemplo:

```java
public enum DayOfWeek {
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miércoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sábado"),
    SUNDAY("Domingo");

    private final String dayName;

    DayOfWeek(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}
```

## Comentarios

Los comentarios en Java son una forma de documentar el código y explicar su funcionamiento. Hay dos tipos principales de comentarios: los comentarios de una línea y los comentarios de varias líneas.

- Los comentarios de una línea comienzan con `//` y se extienden hasta el final de la línea. Son útiles para explicar brevemente una línea de código o para deshabilitar temporalmente una línea de código sin eliminarla.

- Los comentarios de varias líneas comienzan con `/*` y terminan con `*/`. Son útiles para explicar bloques de código más extensos o para deshabilitar bloques de código sin eliminarlos.

Es importante utilizar comentarios de manera adecuada para facilitar la lectura y comprensión del código por otros desarrolladores.

### Javadoc

Los comentarios Javadoc son una forma especial de comentarios que se utilizan para documentar clases, métodos y campos en Java. Se escriben utilizando la sintaxis de Javadoc y se generan automáticamente documentación HTML utilizando herramientas como Javadoc.

Los comentarios Javadoc comienzan con `/**` y terminan con `*/`. Se pueden utilizar etiquetas como `@param`, `@return`, `@throws` y `@see` para proporcionar información adicional sobre los parámetros, el valor de retorno, las excepciones y las referencias a otros elementos del código.

Es importante utilizar comentarios Javadoc de manera consistente y completa para facilitar la comprensión y mantenimiento del código por otros desarrolladores.

## Máquina Virtual

El compilador de Java, no produce un archivo ejecutable directamente. En su lugar, genera archivos `.class` que contienen bytecode que puede ser ejecutado por la máquina virtual Java (JVM). La JVM es responsable de interpretar y ejecutar el bytecode en tiempo de ejecución, lo que permite la portabilidad del código Java entre diferentes plataformas.

## Compilación y Ejecución

Para compilar un programa Java, se utiliza el comando `javac` seguido del nombre del archivo fuente. Por ejemplo, si el archivo fuente se llama `MiPrograma.java`, se ejecuta `javac MiPrograma.java`. Esto generará un archivo `MiPrograma.class` que contiene el bytecode del programa.

Para ejecutar el programa, se utiliza el comando `java` seguido del nombre de la clase principal. Por ejemplo, si la clase principal se llama `MiPrograma`, se ejecuta `java MiPrograma`. La JVM cargará el bytecode del archivo `.class` y lo ejecutará.

Es importante compilar y ejecutar los programas Java en un entorno controlado y seguro para evitar problemas de seguridad y estabilidad.

## El classpath

Es un indicador que le dice a la JVM dónde buscar las clases y paquetes necesarios para ejecutar un programa Java. El classpath puede incluir directorios, archivos JAR y otros recursos que contienen las clases necesarias para la ejecución del programa.

El classpath es una lista separada por puntos y comas que especifica los directorios, archivos JAR y otros recursos que contienen las clases necesarias para la ejecución del programa. Se puede establecer utilizando la variable de entorno `CLASSPATH` o pasando el argumento `-classpath` o `-cp` al comando `java`.

Cuando trabajamos Java desde la terminal, el classpath, por defecto, se compone de la ruta actual. Esto significa que la JVM buscará clases y recursos en el directorio actual y en cualquier subdirectorio que se encuentre en la ruta actual. Si las clases o recursos necesarios para ejecutar el programa no se encuentran en la ruta actual, se puede agregar el directorio o archivo JAR que los contiene al classpath utilizando el argumento `-classpath` o `-cp` al ejecutar el programa.

## Package

Los paquetes en Java son una forma de organizar y estructurar el código en un proyecto Java. Un paquete es un contenedor que agrupa clases relacionadas entre sí, facilitando la organización y la reutilización del código. Los paquetes también ayudan a evitar conflictos de nombres al permitir que diferentes clases tengan el mismo nombre si están en paquetes diferentes.

### Relación entre el classpath y package

## El API de Java

El API de Java es una colección de clases y interfaces que proporcionan funcionalidades comunes y estándar para desarrollar aplicaciones Java. El API de Java incluye clases para manipulación de archivos, manejo de excepciones, manejo de cadenas, manejo de fechas y horas, manejo de colecciones, manejo de hilos, manejo de sockets, manejo de bases de datos, entre otras funcionalidades.

El API de Java es una parte fundamental del desarrollo de aplicaciones Java, ya que proporciona una amplia gama de herramientas y utilidades que pueden ser utilizadas para resolver problemas comunes y simplificar el desarrollo de aplicaciones Java.

El API de Java se encuentra en el directorio `src/main/java` del proyecto y se compila junto con el código fuente de la aplicación. El API de Java se puede utilizar directamente en el código fuente de la aplicación, ya que se encuentra en el classpath de la aplicación.

## Clases para los tipos primitivos

Como ya lo hemos mencionado, todo es un objeto en Java, pero existen clases que representan los tipos primitivos como `Integer`, `Boolean`, `Character`, `Byte`, `Short`, `Long`, `Float` y `Double`. Estas clases proporcionan métodos útiles para trabajar con los tipos primitivos y facilitan la conversión entre tipos primitivos y objetos.

### Autoboxing

El autoboxing es una característica de Java que permite convertir automáticamente un tipo primitivo en su correspondiente clase wrapper y viceversa. Por ejemplo, cuando se asigna un valor primitivo a una variable de tipo `Integer`, Java automáticamente crea un objeto `Integer` con el valor asignado. De la misma manera, cuando se asigna un objeto `Integer` a una variable de tipo primitivo, Java automáticamente extrae el valor primitivo del objeto y lo asigna a la variable.


```java
Integer numero = 100;
numero = numero + 1; // boxing
int i = numero; // unboxing
```

### Unboxing

El unboxing es la operación inversa al autoboxing, que consiste en convertir un objeto wrapper en su correspondiente tipo primitivo. Por ejemplo, cuando se asigna un objeto `Integer` a una variable de tipo primitivo, Java automáticamente extrae el valor primitivo del objeto y lo asigna a la variable.

```java
Integer numero = 100;
int i = numero; // unboxing
```
## Strings

El tipo de datos String se llama alfanumérico, porque almacena números y letras. En un programa Java, los String se declaran utilizando comillas dobles (`"`) y pueden contener cualquier combinación de letras, números y caracteres especiales.

Una variable de tipo String es considerada una variable inmutable, es decir, su valor no puede ser modificado una vez que se ha asignado. Cada vez que se realiza una operación que modifica el contenido de una variable String, Java crea una nueva instancia de String con el nuevo valor y asigna la referencia a la variable original. Esto significa que, aunque parezca que estamos modificando el valor de la variable String, en realidad estamos creando una nueva instancia de String cada vez que realizamos una operación de modificación.

```java
String saludo = "Hola";
saludo = saludo + " Mundo"; // Se crea una nueva instancia de String con el valor "Hola Mundo"
System.out.println(saludo); // Output: Hola Mundo
```

La gran ventaja de las variables String inmutables es que garantizan la seguridad y la consistencia del estado de las variables, ya que no se pueden modificar accidentalmente. Además, al crear nuevas instancias de String cada vez que se realiza una operación de modificación, Java puede optimizar el uso de memoria y mejorar el rendimiento del programa.

Las desventajas de las variables String inmutables son que pueden consumir más memoria y tiempo de procesamiento debido a la creación de nuevas instancias cada vez que se realiza una operación de modificación. Sin embargo, estas desventajas son compensadas por las ventajas de seguridad y consistencia que proporcionan.

El manejo de cadenas de texto con String en Java no es lo más eficiente, nótese el siguiente código:

```java
String total = "10";
String nombre = "Pedro";
String s = "El total es: " + total + ", a nombre de: " + nombre;
System.out.println(s);
```
El uso de operadores de concatenación (+) para construir cadenas de texto puede ser ineficiente, ya que crea nuevas instancias de String cada vez que se realiza una operación de concatenación. En este caso, se crea una nueva instancia de String para cada operación de concatenación, lo que puede consumir más memoria y tiempo de procesamiento.

```java
char ch = '0';
int num =  ch - '0';
```

### La clase StringBuilder

La clase StringBuilder existe para hacer más eficientes las operaciones con alfanuméricos; está hecha para construir objetos de tipo String. A diferencia de la clase String, StringBuilder es mutable, lo que significa que puede modificar su contenido sin crear nuevas instancias de String. Esto hace que las operaciones con StringBuilder sean más eficientes en términos de memoria y tiempo de procesamiento.

```java
// Concatenación usando la clase String
String total = "10";
String nombre = "Pedro";
String s = "El total es: " + total + ", a nombre de: " + nombre;

// Concatenación usando la clase StringBuilder
String total = "10";
String nombre = "Pedro";
StringBuilder sb = new StringBuilder();
sb.append("El total es: ").append(total).append(", a nombre de: ").append(nombre);
```

### La clase StringTokenizer

Esta clase se utiliza para dividir cadenas de texto en tokens basados en un delimitador específico. Es útil cuando se necesita procesar cadenas de texto que contienen múltiples elementos separados por un caracter o conjunto de caracteres.

Supongamos que tienes una cadena de texto con múltiples elementos separados por comas, como "manzana,pera,naranja". Puedes utilizar StringTokenizer para dividir esta cadena en tokens individuales y procesarlos de manera más eficiente.

```java
String str = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20";
StringTokenizer st = new StringTokenizer(str, ",");

while (st.hasMoreTokens()) {
    String token = st.nextToken();
    System.out.println(token);
}
```

### String.format y System.out.printf()

El método `String.format` permite crear cadenas con formato utilizando especificadores. Dos características potentes son el uso de índices de argumentos y el relleno con ceros.

#### Índices de argumentos (`1$`, `2$`, etc.)
Permiten referenciar un argumento específico por su posición, lo que es útil para reutilizar el mismo valor varias veces o cambiar el orden en que aparecen en la cadena sin cambiar el orden de los argumentos pasados al método.

```java
String nombre = "Juan";
String saludo = String.format("Hola %1$s, ¿cómo estás %1$s?", nombre);
// Output: Hola Juan, ¿cómo estás Juan?
```

#### Prefijo de relleno con ceros (`%02d`)
El especificador `%d` se usa para enteros. Al añadir `02` (o cualquier número), indicamos el ancho mínimo de la cadena. Si el número tiene menos dígitos, se rellena con ceros a la izquierda.

```java
int hora = 8;
int minuto = 5;
String tiempo = String.format("La hora es %02d:%02d", hora, minuto);
// Output: La hora es 08:05
```

#### Ejemplo combinado
Podemos combinar ambas técnicas para formatear fechas de manera precisa:

```java
int dia = 9;
String resultado = String.format("Hoy es el día %1$02d del mes %1$02d (repetido)", dia);
// Output: Hoy es el día 09 del mes 09 (repetido)
```

## Conversión de Datos

### Convertir un String a un primitivo

Se puede convertir un número a String de manera automática, pero no es lo mismo al revés. Java ofrece algunos métodos para convertir un String a número:

* Integer.parseInt(): Convierte un String a un entero.
* Double.parseDouble(): Convierte un String a un número de punto flotante.
* Long.parseLong(): Convierte un String a un número largo.
* Float.parseFloat(): Convierte un String a un número de punto flotante de precisión simple.
* Boolean.parseBoolean(): Convierte un String a un valor booleano.

```java
String numeroStr = "123";
int numero = Integer.parseInt(numeroStr);
System.out.println(numero); // Output: 123
```
Al convertir un String a nùmero, es altamente recomendable realizar una validación previa para asegurarse de que el String contiene un valor numérico válido. Esto evita excepciones como `NumberFormatException`; o en su caso manejar excepciones usando el bloque `try`-`catch`, especificando el tipo de excepción `NumberFormatException`.

```java
String numeroStr = "123";
if (numeroStr.matches("\\d+")) {
    int numero = Integer.parseInt(numeroStr);
    System.out.println(numero); // Output: 123
} else {
    System.out.println("El String no contiene un número válido.");
}
``` 

```java
String numeroStr = "123";
try {
    int numero = Integer.parseInt(numeroStr);
    System.out.println(numero); // Output: 123
} catch (NumberFormatException e) {
    System.out.println("El String no contiene un número válido.");
}   
```

### Convertir fechas

No existe un formato universal para representar una fecha. En Java, se pueden utilizar diferentes formatos y clases para representar fechas, como `java.util.Date`, `java.util.Calendar`, `java.time.LocalDate`, `java.time.LocalDateTime`, `java.time.ZonedDateTime`, entre otros. Es importante elegir el formato y la clase adecuadas según las necesidades del proyecto y las especificaciones de la aplicación.

Ejemplo: 01/02/03 puede ser interpretado de muchas maneras, por ejemplo como una fecha en formato `dd/MM/yy` o `MM/dd/yy`, entre otros. Es importante tener en cuenta el formato de la fecha y utilizar la clase adecuada para su representación.

```java
String strDate = "20/01/2019";
int date, month, year;

String tmp = strDate.substring(0, 2);
date = Integer.parseInt(tmp);
tmp = strDate.substring(3, 5);
month = Integer.parseInt(tmp);
tmp = strDate.substring(6, 10);
year = Integer.parseInt(tmp);


// Para manejar fechas, se utiliza java.util.Date, pero no se recomienda hacerlo directamente con esa clase, en su caso, es recomendable usar java.util.Calendar que representa un objeto de fecha y hora
Calendar cal = Calendar.getInstance();
cal.set(Calendar.YEAR, year);
cal.set(Calendar.MONTH, month - 1);
cal.set(Calendar.DATE, date);
cal.set(Calendar.HOUR, 0);
cal.set(Calendar.MINUTE, 0);
cal.set(Calendar.SECOND, 0);
cal.set(Calendar.MILLISECOND, 0);

Date result = cal.getTime();
```

La clase `java.util.Calendar` también nos sirve para realizar operaciones con fechas, como sumar o restar días, meses o años, obtener el día de la semana, el mes, el año, etc. Además, también nos permite formatear fechas de acuerdo a un patrón específico, utilizando la clase `java.text.SimpleDateFormat`.

### Nuevas clases para manejar fechas

A partir de Java 8, se introdujeron nuevas clases para manejar fechas y horas, como `java.time.LocalDate`, `java.time.LocalTime`, `java.time.LocalDateTime`, `java.time.ZonedDateTime`, `java.time.Period`, `java.time.Duration`, `java.time.format.DateTimeFormatter`, entre otras. Estas clases proporcionan una API más moderna y fácil de usar para trabajar con fechas y horas, y también son más eficientes y seguras que las clases anteriores.

## Programación Orientada a Objetos (POO)

La programación orientada a objetos es un método de programación que imita la manera en que todos nosotros hacemos las cosas. Es una evolución natural de las innovaciones anteriores al diseño de lenguajes de programación: Es más estructurado que intentos anteriores de programación estructurada y más modular y abstracto que intentos anteriores de abstracción de datos y ocultamiento de los detalles. Hay tres propiedades principales que caracterizan a la programación orientada a objetos:

* Encapsulamiento: Es la combinación de un registro con procedimientos y funciones para manipular sus datos, con lo que se forma un nuevo tipo de datos: El objeto.
* Herencia: Se refiere a definir un objeto y entonces usarlo para construir una jerarquía de objetos descendientes, donde cada descendiente hereda el acceso al código y datos de su antecesor.
* Polimorfismo: Es darle un nombre a una acción que se comparte de arriba a abajo en la jerarquía de objetos, donde cada objeto en la jerarquía implementa la acción en una forma única para sí mismo.

El reto de la programación orientada a objetos es que requiere que hagas a un lado tus hábitos en la forma en que piensas sobre cómo programar que ha sido un estándar por muchos años. Sin embargo, una vez que haces eso, OOP es una herramienta simple, directa y superior para resolver muchos de los problemas de los que están plagados los programas tradicionales.

Una nota para los que ha han programado OOP en otros lenguajes: Hagan a un lado sus impresiones previas de OOP y aprendan las características de este lenguaje en sus propios términos. OOP no es la única forma de programar; es un continuo de ideas.

Nota para los que no tienen idea de lo que se trata OOP: Demasiado desarrollo, demasiada confusión, y mucha gente hablando acerca de algo que no entienden ha enturbiado las aguas en años recientes. Esfuérzate por olvidar lo que la gente te ha dicho acerca de OOP. La mejor manera (de hecho la única manera) de aprender algo útil sobre OOP es hacer lo que estás a punto de hacer: sentarte e intentarlo por ti mismo.

### Campos

En las clases se pueden definir las variables que determinan el estado del objeto y a esas variables se les llama campos o fields.

### Encapsulamiento

Uno de los tres principios de OOP es esconder la información interna de un objeto. Existen tres tipos de acceso a los campos: público (public), privado (private) y protegido (protected).

* Público (public): El campo es accesible desde cualquier parte del programa.
* Privado (private): El campo es accesible solo desde dentro de la clase en la que se define.
* Protegido (protected): El campo es accesible desde dentro de la clase en la que se define y desde las clases que heredan de esa clase (subclases).

#### Niveles de acceso

| Nivel de acceso | Clase | Package | Subclase | Mundo |
|-----------------|-------|---------|----------|-------|
| public          | Si    | Si      | Si       | Si    | 
| protected       | Si    | Si      | Si       | No    |
| private         | Si    | No      | No       | No    |
| ninguno         | Si    | Si      | No       | No    |

### Herencia

Es posible crear una clase derivada de otra, con lo que la nueva clase automáticamente active todas las características de su antecesor, más las características o particularidades que se definan en la nueva clase.

Todas las clases extienden de la clase Object, que es la clase base de todas las clases en Java.

### Polimorfismo

El polimorfismo es la capacidad de un objeto de tomar diferentes formas dependiendo del contexto en el que se utilice. En Java, el polimorfismo se logra a través de la herencia y la sobrescritura de métodos.

## Type casting

El type casting es el proceso de convertir un tipo de dato en otro. En Java, existen dos tipos de type casting: implícito y explícito.

* Implícito: También conocido como widening, ocurre cuando se convierte un tipo de dato de menor rango a un tipo de dato de mayor rango automáticamente.
* Explícito: También conocido como narrowing, ocurre cuando se convierte un tipo de dato de mayor rango a un tipo de dato de menor rango, y debe hacerse de manera explícita utilizando paréntesis.

```java
int i = 10;
double d = i; // Widening (implícito)

double x = 10.5;
int y = (int) x; // Narrowing (explícito)

double d = 10.5;
int i = d; // ❌ Error: incompatible types: possible lossy conversion from double to int
int i = (int) d; // ✅ Correcto: se realiza un type casting explícito
```

## Identificador super

El identificador `super` se utiliza para referirse a la clase base inmediata de un objeto. Se puede usar para acceder a métodos y constructores de la clase base desde una subclase.

```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        super.hacerSonido();
        System.out.println("El perro ladra");
    }
}
```

## Constructor

Un constructor es un método especial que se utiliza para inicializar objetos de una clase. Tiene el mismo nombre que la clase y no tiene un tipo de retorno, ni siquiera `void`. Los constructores pueden ser sobrecargados, lo que significa que una clase puede tener múltiples constructores con diferentes parámetros.

```java
class Persona {
    String nombre;
    int edad;

    // Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga del constructor
    Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }
}
```

Los constructores no se heredan, pero una subclase puede llamar al constructor de su clase base utilizando `super()`. Si no se llama explícitamente a un constructor de la clase base, el compilador insertará automáticamente una llamada al constructor sin argumentos de la clase base.

```java
class Empleado extends Persona {
    double salario;

    // Constructor
    Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    // Sobrecarga del constructor
    Empleado() {
        super();
        this.salario = 0.0;
    }
}
```

## Destructores

El destructor es la contraparte del constructor y se utiliza para liberar recursos que un objeto pueda estar utilizando antes de que sea destruido. En Java, no existen destructores como en otros lenguajes como C++ o Python. En su lugar, Java utiliza un recolector de basura (garbage collector) que se encarga de liberar automáticamente la memoria ocupada por los objetos que ya no son referenciados.

Sin embargo, en Java todos los objetos tienen un método llamado `finalize()`, que se puede sobrescribir para realizar tareas de limpieza antes de que el objeto sea recolectado por el garbage collector. Es importante tener en cuenta que el método `finalize()` no garantiza cuándo se ejecutará, y su uso no es recomendado en la práctica moderna de Java.

## Interfaces

Una interfaz en Java es una colección de métodos abstractos (sin implementación) que una clase puede implementar. Las interfaces se utilizan para definir un contrato que las clases deben cumplir, lo que permite la programación orientada a interfaces en lugar de la programación orientada a clases.

```java
interface Animal {
    void hacerSonido();
}
```

### Métodos default

A partir de Java 8, las interfaces pueden contener métodos con implementación utilizando la palabra clave `default`. Esto permite agregar nuevos métodos a las interfaces sin romper las clases que ya las implementan.

```java
interface Animal {
    void hacerSonido();

    default void dormir() {
        System.out.println("El animal está durmiendo");
    }
}
```

## Clases anidadas

Es una clase declarada dentro de otra clase. Las clases anidadas pueden ser estáticas o no estáticas (también conocidas como clases internas). Las clases anidadas permiten organizar mejor el código y encapsular la funcionalidad relacionada.