# Fundamentos del Lenguaje

## Convenciones, primitivos, expresiones, precedencia de operadores

### Convenciones utilizadas en Java

La convención más utilizada es siempre comenzar con mayúscula el nombre de una clase y con minúscula el nombre de un método o variable. Por ejemplo, `MiClase` para una clase y `miMetodo()` para un método. A esta convención se le conoce como **CamelCase**.

Ejemplo de una clase y un método siguiendo la convención CamelCase:

```java
// Ejemplo de una clase y un método siguiendo la convención CamelCase. MiClase es el nombre de la clase y miMetodo es el nombre del método.
public class MiClase {
    
    public void miMetodo() {
        String string; // nombre de variable en minúscula
        Integer i; // nombre de variable en minúscula
        
        Math.PI; // Contantes en mayúscula
        
        Color.blue;
        Color.BLUE; // Contantes en mayúscula
    }
}
```

#### Tipos de Datos Primitivos

Un tipo de dato primitivo un tipo de dato mas básico de Java, es un tipo de dato que no es un objeto y que representa un valor simple. En Java, los tipos de datos primitivos son:

| Tipo de Dato | Tamaño  | Valor por Defecto | Rango de Valores                                       |
|--------------|---------|-------------------|--------------------------------------------------------|
| byte         | 1 byte  | 0                 | -128 a 127                                             |
| short        | 2 bytes | 0                 | -32,768 a 32,767                                       |
| int          | 4 bytes | 0                 | -2,147,483,648 a 2,147,483,647                         |
| long         | 8 bytes | 0L                | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| float        | 4 bytes | 0.0f              | ±3.40282347E38F (aprox.)                               |
| double       | 8 bytes | 0.0d              | ±1.79769313486231570E308 (aprox.)                      |
| char         | 2 bytes | '\u0000'          | 0 a 65,535                                             |
| boolean      | 1 bit   | false             | true o false                                           |

Como puedes obervar, los tipos de datos primitivos están escritos en minúscula y representan valores simples como números, caracteres y valores booleanos. Estos tipos de datos son fundamentales para la programación en Java y se utilizan ampliamente en la creación de variables y estructuras de control.

#### Expresiones y Operadores

Las expresiones y operadores nos permiten modificar el contenido de una variable, realizar cálculos y tomar decisiones en nuestro código. En Java, los operadores se dividen en varias categorías, como operadores aritméticos, operadores de comparación, operadores lógicos y operadores de asignación.

Los operadores son símbolos que nos permiten realizar operaciones sobre uno o más operandos. Por ejemplo, el operador `+` nos permite sumar dos números, mientras que el operador `==` nos permite comparar si dos valores son iguales.

Uno o mas operadores forman lo que se conoce como una expresión. Una expresión es una combinación de operadores y operandos que produce un valor. Por ejemplo, la expresión `2 + 3` produce el valor `5`.

```java
int i = 0; // Declaración de una variable entera i y asignación de valor 0
int j = 2 + 3; // Declaración de una variable entera j y asignación de valor 5 (2 + 3)
```

#### Precedencia de Operadores

La precedencia de operadores determina el orden en que se evalúan los operadores en una expresión.

La siguiente tabla muestra los operadores más comunes en Java y su precedencia:

| Operador                                                        | Descripción                      | Precedencia |
|-----------------------------------------------------------------|----------------------------------|-------------|
| `()`                                                            | Paréntesis                       | 1           |
| `expr++` `expr--`                                               | Postfijo                         | 2           |
| `++expr` `--expr`                                               | Prefijo                          | 3           |
| `+expr` `-expr` `~` `!`                                         | Unario                           | 4           |
| `*` `/` `%`                                                     | Multiplicación, División, Módulo | 5           |
| `+` `-`                                                         | Suma, Resta                      | 6           |
| `<<` `>>` `>>>`                                                 | Desplazamiento de bits           | 7           |
| `<` `<=` `>` `>=` `instanceof`                                  | Comparación                      | 8           |
| `==` `!=`                                                       | Igualdad, Desigualdad            | 9           |
| `&`                                                             | AND bit a bit                    | 10          |
| `^`                                                             | XOR bit a bit                    | 11          |
| `\|`                                                            | OR bit a bit                     | 12          |
| `&&`                                                            | AND lógico                       | 13          |
| `\|\|`                                                          | OR lógico                        | 14          |
| `? :`                                                           | Operador ternario                | 15          |
| `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` | Asignación                       | 16          |
| `,`                                                             | Separador de expresiones         | 17          |


```java
// Ejemplo de precedencia de operadores en Java
public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int resultado = a + b * c;
        System.out.println("El resultado es: " + resultado); // El resultado es: 20
        // En este caso, la multiplicación se realiza primero debido a la precedencia de operadores, por lo que el resultado es 10 + (5 * 2) = 20.
    }
}
```

Podemos observar que la multiplicación tiene una mayor precedencia que la suma, por lo que se realiza primero. Si quisiéramos cambiar el orden de evaluación, podríamos utilizar paréntesis para forzar la evaluación de la suma primero:

```java
// Ejemplo de precedencia de operadores en Java con paréntesis
public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int resultado = (a + b) * c;
        System.out.println("El resultado es: " + resultado); // El resultado es: 30
        // En este caso, la suma se realiza primero debido a los paréntesis, por lo que el resultado es (10 + 5) * 2 = 30.
    }
}
```

Los operadores de asignación se evalúan de derecha a izquierda, lo que significa que el valor de la expresión de la derecha se asigna a la variable de la izquierda. Por ejemplo, en la expresión `a = b = c`, primero se evalúa `b = c`, y luego el resultado se asigna a `a`.

```java
// Ejemplo de operadores de asignación en Java
public class AsignacionOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        a = b = c; // Primero se evalúa b = c, luego el resultado se asigna a a
        System.out.println("El valor de a es: " + a); // El valor de a es: 2
        System.out.println("El valor de b es: " + b); // El valor de b es: 2
        System.out.println("El valor de c es: " + c); // El valor de c es: 2
    }
}
```

#### Operadores de asignación compuesta

Los operadores de asignación son una forma abreviada de asignar valores a las variables. En lugar de escribir `a = a + b`, podemos escribir `a += b`. Esto es útil para simplificar el código y hacerlo más legible.

```java
// Ejemplo de operadores de asignación compuesta en Java
public class AsignacionCompuesta {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a += b; // Equivalente a a = a + b
        System.out.println("El valor de a es: " + a); // El valor de a es: 15
        a -= b; // Equivalente a a = a - b
        System.out.println("El valor de a es: " + a); // El valor de a es: 10
        a *= b; // Equivalente a a = a * b
        System.out.println("El valor de a es: " + a); // El valor de a es: 50
        a /= b; // Equivalente a a = a / b
        System.out.println("El valor de a es: " + a); // El valor de a es: 10
        a %= b; // Equivalente a a = a % b
        System.out.println("El valor de a es: " + a); // El valor de a es: 0
    }
}
```

#### Operadores aritméticos

Los operadores aritméticos nos permiten realizar operaciones matemáticas básicas como suma, resta, multiplicación, división y módulo. Los operadores aritméticos en Java son:

| Operador | Descripción |
|----------|-------------|
| `+`      | Suma        |
| `-`      | Resta       |
| `*`      | Multiplicación |
| `/`      | División    |
| `%`      | Módulo      |

```java
// Ejemplo de operadores aritméticos en Java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b)); // Suma: 15
        System.out.println("Resta: " + (a - b)); // Resta: 5
        System.out.println("Multiplicación: " + (a * b)); // Multiplicación: 50
        System.out.println("División: " + (a / b)); // División: 2
        System.out.println("Módulo: " + (a % b)); // Módulo: 0
    }
}
```

#### Operadores unitarios

Los operadores unitarios son aquellos que operan sobre un solo operando. En Java, los operadores unitarios incluyen el operador de negación lógica (`!`), el operador de negación aritmética (`-`), y los operadores de incremento y decremento (`++` y `--`).

```java
// Ejemplo de operadores unitarios en Java
public class OperadoresUnitarios {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Valor original de a: " + a); // Valor original de a: 10
        System.out.println("Negación aritmética de a: " + (-a)); // Negación aritmética de a: -10
        System.out.println("Negación lógica de true: " + (!true)); // Negación lógica de true: false
        a++; // Incremento de a en 1
        System.out.println("Valor de a después del incremento: " + a); // Valor de a después del incremento: 11
        a--; // Decremento de a en 1
        System.out.println("Valor de a después del decremento: " + a); // Valor de a después del decremento: 10
    }
}
```

### Operadores lógicos, binarios, complemento a 2, corrimiento de bits y sentencias

#### Operadores lógicos

Los operadores lógicos nos permiten combinar expresiones booleanas y tomar decisiones en nuestro código. En Java, los operadores lógicos incluyen el operador AND lógico (`&&`), el operador OR lógico (`||`), y el operador NOT lógico (`!`).

##### Operador lógico AND (`&&`)

Este operador devuelve `true` si ambos operandos son `true`, y `false` en cualquier otro caso.

| A     | B     | A && B |
|-------|-------|--------|
| true  | true  | true   |
| true  | false | false  |
| false | true  | false  |
| false | false | false  |

##### Operador lógico OR (`||`)

Este operador devuelve `true` si al menos uno de los operandos es `true`, y `false` si ambos son `false`.

| A     | B     | A \|\| B |
|-------|-------|----------|
| true  | true  | true     |
| true  | false | true     |
| false | true  | true     |
| false | false | false    |

##### Operador lógico NOT (`!`)

Este operador devuelve `true` si el operando es `false`, y `false` si el operando es `true`.

| A     | !A    |
|-------|-------|
| true  | false |
| false | true  |

```java
// Ejemplo de operadores lógicos en Java
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("AND lógico: " + (a && b)); // AND lógico: false
        System.out.println("OR lógico: " + (a || b)); // OR lógico: true
        System.out.println("NOT lógico de a: " + (!a)); // NOT lógico de a: false
    }
}
```

#### Operadores lógicos binarios

Los operadores lógicos binarios son aquellos que operan sobre dos operandos y devuelven un resultado booleano. En Java, los operadores lógicos binarios incluyen el operador AND bit a bit (`&`), el operador OR bit a bit (`|`), y el operador XOR bit a bit (`^`).

```java
// Ejemplo de operadores lógicos binarios en Java
public class OperadoresLogicosBinarios {
    public static void main(String[] args) {
        int a = 5; // 0101 en binario
        int b = 3; // 0011 en binario
        System.out.println("AND bit a bit: " + (a & b)); // AND bit a bit: 1 (0001 en binario)
        System.out.println("OR bit a bit: " + (a | b)); // OR bit a bit: 7 (0111 en binario)
        System.out.println("XOR bit a bit: " + (a ^ b)); // XOR bit a bit: 6 (0110 en binario)
    }
}
```

#### Complemento a 2

El complemento a 2 es una representación de números enteros en binario que permite realizar operaciones aritméticas de manera más sencilla, especialmente la resta. En esta representación, el bit más significativo (MSB) indica el signo del número: 0 para números positivos y 1 para números negativos.

```java
// Ejemplo de complemento a 2 en Java
public class ComplementoA2 {
    public static void main(String[] args) {
        int numero = -5;
        int complementoA2 = ~numero + 1; // Calcula el complemento a 2 de -5
        System.out.println("Número original: " + numero); // Número original: -5
        System.out.println("Complemento a 2: " + complementoA2); // Complemento a 2: 5
    }
}
```

#### Corrimiento de bits

El corrimiento de bits es una operación que desplaza los bits de un número binario hacia la izquierda o hacia la derecha. En Java, existen tres operadores de corrimiento de bits:

| Operador | Descripción                        |
|----------|------------------------------------|
| `<<`     | Corrimiento a la izquierda         |
| `>>`     | Corrimiento a la derecha con signo |
| `>>>`    | Corrimiento a la derecha sin signo |

```java
// Ejemplo de corrimiento de bits en Java
public class CorrimientoBits {
    public static void main(String[] args) {
        int n = 0x0f0f0f0f; // 00001111000011110000111100001111 en binario
        System.out.println("Número original: " + Integer.toBinaryString(n)); // Número original: 1111000011110000111100001111
        System.out.println("Corrimiento a la izquierda: " + Integer.toBinaryString(n << 1)); // Corrimiento a la izquierda: 1110000111100001111000011110
        System.out.println("Corrimiento a la derecha con signo: " + Integer.toBinaryString(n >> 1)); // Corrimiento a la derecha con signo: 111100001111000011110000111
        System.out.println("Corrimiento a la derecha sin signo: " + Integer.toBinaryString(n >>> 1)); // Corrimiento a la derecha sin signo: 111100001111000011110000111
    }
}
```

#### Sentencias

Una sentencia es una instrucción que realiza una acción en el programa. En Java, las sentencias se dividen en varias categorías, como sentencias de control de flujo, sentencias de declaración y sentencias de expresión. Existen difentes formas de escribir sentencias en Java, pero todas ellas deben terminar con un punto y coma (`;`). A continuación, se presentan algunos ejemplos de sentencias en Java:

```java
// Ejemplo de sentencias en Java
public class Sentencias {
    public static void main(String[] args) {
        // Sentencia de declaración
        int a = 10; // Declaración de una variable entera a y asignación de valor 10
        // Sentencia de expresión
        a += 5; // Incremento de a en 5
        // Sentencia de control de flujo
        if (a > 10) { // Si a es mayor que 10
            System.out.println("a es mayor que 10"); // Imprime "a es mayor que 10"
        } else { // Si a no es mayor que 10
            System.out.println("a es menor o igual que 10"); // Imprime "a es menor o igual que 10"
        }
    }
}
```