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

### Funciones

Una función es un conjunto de instrucciones que realiza una tarea específica y puede devolver un valor, y puede ser ejecutado varias veces y en otras partes de un programa. En Java, las funciones se definen dentro de una clase y se conocen como métodos. Un método puede tener parámetros de entrada y un valor de retorno.

```java
// Ejemplo de una función en Java
public class Funciones {
    // Método que suma dos números enteros y devuelve el resultado
    public static int sumar(int a, int b) { // Declaración del método sumar que recibe dos parámetros enteros a y b, y devuelve un valor entero. Está delimitado por llaves {}.
        return a + b; // Devuelve la suma de a y b
    } // Fin del método o función sumar
    
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int resultado = sumar(5, 10); // Llamada al método sumar con los argumentos 5 y 10, y asignación del resultado a la variable resultado
        System.out.println("El resultado de la suma es: " + resultado); // Imprime el resultado de la suma
    } // Fin del método principal
}
```

En la definición del lenguaje Java, se habla de parámetros formales y parámetros actuales. Los parámetros formales son los que se definen en la declaración del método, mientras que los parámetros actuales son los que se pasan al llamar al método. En el ejemplo anterior, `int a` y `int b` son parámetros formales, mientras que `5` y `10` son parámetros actuales.

A los parámetros formales se les puede llamar también **parámetros**, mientras que a los parámetros actuales se les puede llamar **argumentos**.

El nombre de parámetro definido en un método, no tiene nada que ver con el nombre de una variable que pudieras haber definido en otra parte del programa. Por ejemplo, en el siguiente código, el parámetro `a` del método `sumar` no tiene nada que ver con la variable `a` definida en el método `main`.

La palabra return se utiliza para devolver un valor desde un método. Cuando se ejecuta una sentencia return, el control del programa vuelve al punto donde se llamó al método, y el valor devuelto puede ser utilizado en ese punto.

```java
// Ejemplo de la palabra return en Java
public class ReturnEjemplo {
    // Método que devuelve el valor absoluto de un número entero
    public static int valorAbsoluto(int numero) { // Declaración del método valorAbsoluto que recibe un parámetro entero numero y devuelve un valor entero. Está delimitado por llaves {}.
        if (numero < 0) { // Si el número es negativo
            return -numero; // Devuelve el valor positivo del número
        } else { // Si el número es positivo o cero
            return numero; // Devuelve el número tal cual
        }
    } // Fin del método o función valorAbsoluto
}
```

```java
// Ejemplo de función que devuelve el promedio de 4 números en Java
public class Promedio {
    // Método que calcula el promedio de 4 números enteros y devuelve el resultado como un número decimal (double)
    public static double calcularPromedio(int a, int b, int c, int d) { // Declaración del método calcularPromedio que recibe cuatro parámetros enteros a, b, c y d, y devuelve un valor decimal (double). Está delimitado por llaves {}.
        return (a + b + c + d) / 4.0; // Devuelve el promedio de los cuatro números
    } // Fin del método o función calcularPromedio
    
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double promedio = calcularPromedio(10, 20, 30, 40); // Llamada al método calcularPromedio con los argumentos 10, 20, 30 y 40, y asignación del resultado a la variable promedio
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal
}
```

### Arreglos

Un arreglo es una secuencia de variables del mismo tipo que se almacenan en memoria de manera contigua y se acceden mediante un índice. En Java, los arreglos son objetos que pueden contener elementos de cualquier tipo de dato, incluyendo tipos primitivos y objetos.

```java
// Ejemplo de un arreglo en Java
public class Arreglos {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración de un arreglo de enteros llamado numeros y asignación de valores
        System.out.println("El primer número es: " + numeros[0]); // Imprime el primer número del arreglo (índice 0)
        System.out.println("El segundo número es: " + numeros[1]); // Imprime el segundo número del arreglo (índice 1)
        System.out.println("El tercer número es: " + numeros[2]); // Imprime el tercer número del arreglo (índice 2)
        System.out.println("El cuarto número es: " + numeros[3]); // Imprime el cuarto número del arreglo (índice 3)
        System.out.println("El quinto número es: " + numeros[4]); // Imprime el quinto número del arreglo (índice 4)
    } // Fin del método principal
}
```

No es posible usar un indice mas allá del tamaño del arreglo, ya que esto generará un error de ejecución llamado `ArrayIndexOutOfBoundsException`. Por ejemplo, si intentamos acceder al índice 5 del arreglo `numeros` declarado anteriormente, obtendremos un error, ya que el arreglo tiene un tamaño de 5 y los índices válidos son del 0 al 4.

```java
// Ejemplo de error de índice fuera de límites en Java
public class ErrorIndice {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración de un arreglo de enteros llamado numeros y asignación de valores
        System.out.println("El sexto número es: " + numeros[5]); // Intento de acceder al índice 5 del arreglo, lo que generará un error de ejecución
    } // Fin del método principal
}
```

Como puedes observar, el indice inicia en 0 y termina en n-1, donde n es el tamaño del arreglo. Por lo tanto, si un arreglo tiene 5 elementos, los índices válidos son 0, 1, 2, 3 y 4. Intentar acceder a un índice fuera de este rango generará un error de ejecución.

```java
// Calcular el promedio de un arreglo de números en Java
public class PromedioArreglo {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[] numeros = {10, 20, 30, 40, 50}; // Declaración de un arreglo de enteros llamado numeros y asignación de valores
        double promedio = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]) / numeros.length; // Cálculo del promedio de los números del arreglo
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal
}
```

Con el método `length` podemos obtener el tamaño del arreglo, lo que nos permite calcular el promedio de manera más flexible, sin necesidad de conocer el tamaño del arreglo de antemano. Esto es especialmente útil cuando trabajamos con arreglos de tamaño variable.

#### Arreglos multidimensionales

Un arreglo multidimensional es un arreglo que contiene otros arreglos como elementos. En Java, los arreglos multidimensionales se pueden declarar utilizando múltiples corchetes `[]`. Por ejemplo, un arreglo bidimensional se puede declarar como `int[][] matriz`.

```java
// Ejemplo de un arreglo bidimensional en Java
public class ArregloBidimensional {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[][] matriz = { // Declaración de un arreglo bidimensional llamado matriz y asignación de valores
            {1, 2, 3}, // Primera fila
            {4, 5, 6}, // Segunda fila
            {7, 8, 9}  // Tercera fila
        };
        System.out.println("Elemento en la primera fila y primera columna: " + matriz[0][0]); // Imprime el elemento en la primera fila y primera columna (índice 0,0)
        System.out.println("Elemento en la segunda fila y tercera columna: " + matriz[1][2]); // Imprime el elemento en la segunda fila y tercera columna (índice 1,2)
        System.out.println("Elemento en la tercera fila y segunda columna: " + matriz[2][1]); // Imprime el elemento en la tercera fila y segunda columna (índice 2,1)
    } // Fin del método principal
}
```

Como Java trata a los arreglos multidimensionales como arreglos de arreglos, es posible tener filas de diferentes tamaños. Esto significa que no todas las filas de un arreglo bidimensional tienen que tener el mismo número de columnas. Por ejemplo, podemos declarar un arreglo bidimensional con filas de diferentes longitudes:

```java
// Ejemplo de un arreglo bidimensional con filas de diferentes longitudes en Java
public class ArregloBidimensionalIrregular {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[][] matrizIrregular = { // Declaración de un arreglo bidimensional irregular llamado matrizIrregular y asignación de valores
            {1, 2, 3}, // Primera fila con 3 elementos
            {4, 5},    // Segunda fila con 2 elementos
            {6, 7, 8, 9} // Tercera fila con 4 elementos
        };
        System.out.println("Elemento en la primera fila y primera columna: " + matrizIrregular[0][0]); // Imprime el elemento en la primera fila y primera columna (índice 0,0)
        System.out.println("Elemento en la segunda fila y segunda columna: " + matrizIrregular[1][1]); // Imprime el elemento en la segunda fila y segunda columna (índice 1,1)
        System.out.println("Elemento en la tercera fila y cuarta columna: " + matrizIrregular[2][3]); // Imprime el elemento en la tercera fila y cuarta columna (índice 2,3)
    } // Fin del método principal
}
```

#### Copiando arreglos

Java cuenta con una clase llamada System, dentro de esta clase se encuentran muchos métodos y variables útiles. Uno de estos métodos es `arraycopy()`, que nos permite copiar elementos de un arreglo a otro de manera eficiente. La sintaxis del método es la siguiente:

```java
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length); // Copia elementos de un arreglo a otro, los argumentos son: src (arreglo de origen), srcPos (posición inicial en el arreglo de origen), dest (arreglo de destino), destPos (posición inicial en el arreglo de destino) y length (número de elementos a copiar).
```

### Ciclo For, for mejorado

#### Ciclo For

El ciclo `for` es una estructura de control que nos permite repetir un bloque de código un número determinado de veces. La sintaxis básica del ciclo `for` es la siguiente:

```java
for (inicialización; condición; actualización) {
    // Bloque de código a repetir
}
```

Ejemplo de un ciclo `for` que imprime los números del 1 al 5:

```java
// Ejemplo de un ciclo for en Java
public class CicloFor {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        for (int i = 1; i <= 5; i++) { // Inicialización de la variable i, condición de repetición y actualización de i
            System.out.println("Número: " + i); // Imprime el valor de i en cada iteración
        }
    } // Fin del método principal
}
```

Ejemplo de un ciclo `for` que calcula el promedio de un arreglo de números:

```java
// Ejemplo de cálculo del promedio de un arreglo utilizando un ciclo for en Java
public class PromedioArregloFor {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double[] numeros = {10, 20, 30, 40, 50}; // Declaración de un arreglo de números decimales llamado numeros y asignación de valores
        double promedio = promedio(numeros); // Llamada al método promedio con el arreglo numeros como argumento y asignación del resultado a la variable promedio
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal
    
    public static double promedio(double[] arreglo) { // Método que calcula el promedio de un arreglo de números decimales y devuelve el resultado como un número decimal (double)
        double suma = 0; // Variable para almacenar la suma de los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) { // Ciclo for que recorre el arreglo desde el índice 0 hasta el tamaño del arreglo
            suma += arreglo[i]; // Suma el elemento actual del arreglo a la variable suma
        }
        return suma / arreglo.length; // Devuelve el promedio dividiendo la suma entre el tamaño del arreglo
    } // Fin del método promedio
}
```

#### Ciclo For mejorado

A partir de Java 5, se introdujo el ciclo `for` mejorado, también conocido como "for-each". Este ciclo nos permite recorrer los elementos de un arreglo o una colección de manera más sencilla y legible. La sintaxis básica del ciclo `for` mejorado es la siguiente:

```java
for (tipo variable : arreglo) {
    // Bloque de código a repetir
}
```

Ejemplo de un ciclo `for` mejorado que imprime los elementos de un arreglo:

```java
// Ejemplo de un ciclo for mejorado en Java
public class CicloForMejorado {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración de un arreglo de enteros llamado numeros y asignación de valores
        for (int numero : numeros) { // Ciclo for mejorado que recorre el arreglo numeros
            System.out.println("Número: " + numero); // Imprime el valor de cada elemento del arreglo
        }
    } // Fin del método principal
}
```

Ejemplo de un ciclo `for` mejorado que calcula el promedio de un arreglo de números:

```java
// Ejemplo de cálculo del promedio de un arreglo utilizando un ciclo for mejorado en Java
public class PromedioArregloForMejorado {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double[] numeros = {10, 20, 30, 40, 50}; // Declaración de un arreglo de números decimales llamado numeros y asignación de valores
        double promedio = promedio(numeros); // Llamada al método promedio con el arreglo numeros como argumento y asignación del resultado a la variable promedio
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal

    public static double promedio(double[] arreglo) { // Método que calcula el promedio de un arreglo de números decimales y devuelve el resultado como un número decimal (double)
        double suma = 0; // Variable para almacenar la suma de los elementos del arreglo
        for (double numero : arreglo) { // Ciclo for mejorado que recorre el arreglo desde el primer elemento hasta el último
            suma += numero; // Suma el elemento actual del arreglo a la variable suma
        }
        return suma / arreglo.length; // Devuelve el promedio dividiendo la suma entre el tamaño del arreglo
    } // Fin del método promedio
}
```

#### La flexibilidad del ciclo for

La sintaxis del ciclo `for` es muy flexible y nos permite omitir cualquiera de sus tres partes: inicialización, condición y actualización. Sin embargo, debemos tener cuidado al omitir la condición, ya que esto puede llevar a un bucle infinito si no se maneja correctamente.

```java
// Ejemplo de un ciclo for con inicialización y actualización omitida en Java
public class CicloForCondicionOmitida {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int i = 0; // Inicialización de la variable i
        for (; i < 5; ) { // Ciclo for con condición omitida, pero con una condición de salida que depende de la variable i
            System.out.println("Número: " + i); // Imprime el valor de i en cada iteración
            i++; // Incremento de i en 1
        }
    } // Fin del método principal
}
```

### Sobrecarga de métodos, ciclos while y do-while, bloques

#### Sobrecarga de métodos

La sobrecarga de métodos (method overloading) es una característica de Java que nos permite definir múltiples métodos con el mismo nombre siempre y cuando el tipo de datos de sus parámetros o el número de parámetros sean diferentes. Esto nos permite crear métodos que realizan la misma operación pero con diferentes tipos o cantidades de datos.

```java
// Ejemplo de sobrecarga de métodos en Java
public class SobrecargaMetodos {
    // Método que suma dos números enteros
    public static int sumar(int a, int b) { // Declaración del método sumar que recibe dos parámetros enteros a y b, y devuelve un valor entero. Está delimitado por llaves {}.
        return a + b; // Devuelve la suma de a y b
    } // Fin del método o función sumar

    // Método que suma tres números enteros
    public static int sumar(int a, int b, int c) { // Declaración del método sumar que recibe tres parámetros enteros a, b y c, y devuelve un valor entero. Está delimitado por llaves {}.
        return a + b + c; // Devuelve la suma de a, b y c
    } // Fin del método o función sumar

    // Método que suma dos números decimales
    public static double sumar(double a, double b) { // Declaración del método sumar que recibe dos parámetros decimales a y b, y devuelve un valor decimal (double). Está delimitado por llaves {}.
        return a + b; // Devuelve la suma de a y b
    } // Fin del método o función sumar

    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        System.out.println("Suma de dos enteros: " + sumar(5, 10)); // Llamada al método sumar con dos enteros como argumentos
        System.out.println("Suma de tres enteros: " + sumar(5, 10, 15)); // Llamada al método sumar con tres enteros como argumentos
        System.out.println("Suma de dos decimales: " + sumar(5.5, 10.5)); // Llamada al método sumar con dos decimales como argumentos
    } // Fin del método principal
}
```

Técnicamente hablando, se podría decir que el identificador de una función es el nombre de la función junto con el tipo y número de sus parámetros. Esto significa que dos funciones pueden tener el mismo nombre siempre y cuando tengan diferentes tipos o cantidades de parámetros, lo que permite la sobrecarga de métodos en Java.

Java cuenta con una clase que contiene métodos sobrecargados, es la clase System, que contiene métodos como `println()`, que puede recibir diferentes tipos de datos como argumentos, incluyendo enteros, decimales, cadenas de texto y objetos. Esto nos permite imprimir diferentes tipos de datos en la consola utilizando el mismo método `println()`.

```java
// Ejemplo de sobrecarga de métodos en la clase System en Java
public class SobrecargaSystem {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        System.out.println("Hola, mundo!"); // Llamada al método println con una cadena de texto como argumento
        System.out.println(42); // Llamada al método println con un número entero como argumento
        System.out.println(3.14); // Llamada al método println con un número decimal como argumento
        System.out.println(true); // Llamada al método println con un valor booleano como argumento
    } // Fin del método principal
}
```


#### Ciclo while

El ciclo `while` es una estructura de control que nos permite repetir un bloque de código mientras se cumpla una condición determinada. La sintaxis básica del ciclo `while` es la siguiente:

```java
while (condición) {
    // Bloque de código a repetir
}
```

Ejemplo de un ciclo `while` de cálculo del promedio de un arreglo de números:

```java
// Ejemplo de cálculo del promedio de un arreglo utilizando un ciclo while en Java
public class PromedioArregloWhile {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double[] numeros = {10, 20, 30, 40, 50}; // Declaración de un arreglo de números decimales llamado numeros y asignación de valores
        double promedio = promedio(numeros); // Llamada al método promedio con el arreglo numeros como argumento y asignación del resultado a la variable promedio
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal

    public static double promedio(double[] arreglo) { // Método que calcula el promedio de un arreglo de números decimales y devuelve el resultado como un número decimal (double)
        double suma = 0; // Variable para almacenar la suma de los elementos del arreglo
        int i = 0; // Inicialización de la variable i para controlar el índice del arreglo
        while (i < arreglo.length) { // Ciclo while que se ejecuta mientras i sea menor que el tamaño del arreglo
            suma += arreglo[i]; // Suma el elemento actual del arreglo a la variable suma
            i++; // Incremento de i en 1
        }
        return suma / arreglo.length; // Devuelve el promedio dividiendo la suma entre el tamaño del arreglo
    } // Fin del método promedio
}
```

#### Ciclo do-while

El ciclo `do-while` es similar al ciclo `while`, pero la diferencia principal es que el bloque de código se ejecuta al menos una vez antes de evaluar la condición. La sintaxis básica del ciclo `do-while` es la siguiente:

```java
do {
    // Bloque de código a repetir
} while (condición);
```

Ejemplo de un ciclo `do-while` que imprime los números del 1 al 5:

```java
// Ejemplo de un ciclo do-while en Java
public class CicloDoWhile {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int i = 1; // Inicialización de la variable i
        do { // Inicio del ciclo do-while
            System.out.println("Número: " + i); // Imprime el valor de i en cada iteración
            i++; // Incremento de i en 1
        } while (i <= 5); // Condición de repetición del ciclo do-while
    } // Fin del método principal
}
```

#### Bloques

Los bloques son secciones de código delimitadas por llaves `{}` que agrupan varias sentencias. Los bloques se utilizan para definir el alcance de las variables y para organizar el código en estructuras de control como ciclos y condicionales. Un bloque puede contener declaraciones de variables, sentencias y otros bloques anidados.

En Java, los bloques se utilizan en diferentes contextos, como en métodos, ciclos, condicionales y clases. Por ejemplo, un bloque dentro de un método puede contener varias sentencias que se ejecutan secuencialmente. De hecho, las condiciones y ciclos pueden no usar llaves si solo contienen una sentencia, pero es recomendable usarlas para mejorar la legibilidad del código y evitar errores al agregar más sentencias en el futuro.

```java
// Ejemplo de bloques en Java
public class Bloques {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int a = 10; // Declaración de una variable entera a y asignación de valor 10
        if (a > 5) { // Condicional que verifica si a es mayor que 5
            System.out.println("a es mayor que 5"); // Imprime "a es mayor que 5" si la condición es verdadera
            { // Inicio de un bloque anidado
                int b = 20; // Declaración de una variable entera b y asignación de valor 20
                System.out.println("b es: " + b); // Imprime el valor de b
            } // Fin del bloque anidado
            // System.out.println("b es: " + b); // Esto generaría un error de compilación, ya que b no está definido en este alcance
        } // Fin del condicional
    } // Fin del método principal
}
```

### Condiciones

Las condiciones son una parte del lenguaje de programación que nos permiten tomar decisiones en nuestro código. En Java, las condiciones se expresan mediante expresiones booleanas que pueden ser verdaderas (`true`) o falsas (`false`). Las condiciones se utilizan en estructuras de control como `if`, `else if`, `else` y `switch`.

#### Condicional if

El condicional `if` nos permite ejecutar un bloque de código si se cumple una condición determinada. La sintaxis básica del condicional `if` es la siguiente:

```java
if (condición) {
    // Bloque de código a ejecutar si la condición es verdadera
}
```

Ejemplo de una condición `if` que verifica si un número es positivo:

```java
// Ejemplo de un condicional if en Java
public class CondicionalIf {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int numero = 10; // Declaración de una variable entera numero y asignación de valor 10
        if (numero > 0) { // Condicional que verifica si numero es mayor que 0
            System.out.println("El número es positivo"); // Imprime "El número es positivo" si la condición es verdadera
        }
    } // Fin del método principal
}
```

#### Condicional if-else

El condicional `if-else` nos permite ejecutar un bloque de código si se cumple una condición y otro bloque de código si no se cumple. La sintaxis básica del condicional `if-else` es la siguiente:

```java
if (condición) {
    // Bloque de código a ejecutar si la condición es verdadera
} else {
    // Bloque de código a ejecutar si la condición es falsa
}
```

Ejemplo de una condición `if-else` que verifica si un mes tiene 28, 30 o 31 días:

```java
// Ejemplo de un condicional if-else en Java
public class CondicionalIfElse {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int mes = 2; // Declaración de una variable entera mes y asignación de valor 2 (febrero)
        if (mes == 2) { // Condicional que verifica si mes es igual a 2 (febrero)
            System.out.println("El mes tiene 28 o 29 días"); // Imprime "El mes tiene 28 o 29 días" si la condición es verdadera
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { // Condicional que verifica si mes es igual a 1, 3, 5, 7, 8, 10 o 12 (meses con 31 días)
            System.out.println("El mes tiene 31 días"); // Imprime "El mes tiene 31 días" si la condición es verdadera
        } else { // Si ninguna de las condiciones anteriores se cumple
            System.out.println("El mes tiene 30 días"); // Imprime "El mes tiene 30 días"
        }
    } // Fin del método principal
}
```

#### Conidicional if-else-if

El condicional `if-else-if` nos permite evaluar múltiples condiciones de manera secuencial. Si la primera condición es falsa, se evalúa la siguiente, y así sucesivamente, hasta que se encuentre una condición verdadera o se llegue al bloque `else`. La sintaxis básica del condicional `if-else-if` es la siguiente:

```java
if (condición1) {
    // Bloque de código a ejecutar si la condición1 es verdadera
} else if (condición2) {
    // Bloque de código a ejecutar si la condición2 es verdadera
} else {
    // Bloque de código a ejecutar si ninguna de las condiciones anteriores es verdadera
}
```

Ejemplo de una condición `if-else-if` que verifica la calificación de un estudiante:

```java
// Ejemplo de un condicional if-else-if en Java
public class CondicionalIfElseIf {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int calificacion = 85; // Declaración de una variable entera calificacion y asignación de valor 85
        if (calificacion >= 90) { // Condicional que verifica si calificacion es mayor o igual a 90
            System.out.println("Excelente"); // Imprime "Excelente" si la condición es verdadera
        } else if (calificacion >= 80) { // Condicional que verifica si calificacion es mayor o igual a 80
            System.out.println("Bueno"); // Imprime "Bueno" si la condición es verdadera
        } else if (calificacion >= 70) { // Condicional que verifica si calificacion es mayor o igual a 70
            System.out.println("Regular"); // Imprime "Regular" si la condición es verdadera
        } else { // Si ninguna de las condiciones anteriores se cumple
            System.out.println("Insuficiente"); // Imprime "Insuficiente"
        }
    } // Fin del método principal
}
```

En el ejemplo anterior, podemos observar que se cumplen varias condiciones, pero Java ejecuta únicamente el bloque de código correspondiente a la primera condición verdadera que encuentra. En este caso, como la calificación es 85, se imprime "Bueno" y no se evalúan las condiciones siguientes. Esto demuestra cómo funciona la estructura `if-else-if` para tomar decisiones basadas en múltiples criterios.

#### El operador condicional `? :`

El operador condicional `? :`, también conocido como operador ternario, es una forma concisa de escribir una expresión condicional en Java. Este operador evalúa una condición y devuelve un valor si la condición es verdadera y otro valor si la condición es falsa. La sintaxis básica del operador condicional es la siguiente:

```java
// Ejemplo del operador en su forma if-else
if (condición) {
    valor1; // Valor si la condición es verdadera
} else {
    valor2; // Valor si la condición es falsa
}

// Equivalente con operador condicional ? :
condición ? valor1 : valor2; // Devuelve valor1 si la condición es verdadera
// Devuelve valor2 si la condición es falsa
```

Ejemplo de uso del operador condicional `? :` para determinar si un número es par o impar:

```java
// Ejemplo de uso del operador condicional ? : en Java
public class OperadorCondicional {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int numero = 7; // Declaración de una variable entera numero y asignación de valor 7
        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar"; // Evaluación de la condición
        System.out.println(resultado); // Imprime el resultado de la evaluación
    } // Fin del método principal
}
```

Ejemplo de una función que devuelve el número mayor entre 3 números utilizando el tradicional `if-else` y el operador condicional `? :`:

```java
// Ejemplo de una función que devuelve el número mayor entre 3 números utilizando if-else
public class MayorIfElse {
    public static int mayor(int a, int b, int c) { // Declaración del método mayor que recibe tres parámetros enteros a, b y c, y devuelve un valor entero.
        if (a >= b && a >= c) { // Condicional que verifica si a es mayor o igual a b y c
            return a; // Devuelve a si la condición es verdadera
        } else if (b >= a && b >= c) { // Condicional que verifica si b es mayor o igual a a y c
            return b; // Devuelve b si la condición es verdadera
        } else { // Si ninguna de las condiciones anteriores se cumple
            return c; // Devuelve c
        }
    } // Fin del método mayor
} // Fin de la clase MayorIfElse

// Ejemplo de una función que devuelve el número mayor entre 3 números utilizando el operador condicional ? :
public class MayorOperadorCondicional {
    public static int mayor(int a, int b, int c) { // Declaración del método mayor que recibe tres parámetros enteros a, b y c, y devuelve un valor entero.
        return (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c; // Evaluación de la condición utilizando el operador condicional
    } // Fin del método mayor
} // Fin de la clase MayorOperadorCondicional
```

### Break y continue, switch

#### Sentencias break y continue

Ninguno de los ciclos o bucles que ya conocemos (for, while, do-while) necesita ejecutarse de principio a fin, porque hay situaciones en las que necesitamos interrumpir la ejecución de un ciclo antes de que termine, o saltar a la siguiente iteración del ciclo sin ejecutar el resto del bloque de código. Para esto, Java nos proporciona las sentencias `break` y `continue`.

La sentencia `break` se utiliza para salir de un ciclo o bucle antes de que se cumpla la condición de finalización. Cuando se ejecuta una sentencia `break`, el control del programa salta inmediatamente fuera del ciclo, y la ejecución continúa con la siguiente instrucción después del ciclo. La sentencia `continue`, por otro lado, se utiliza para saltar a la siguiente iteración del ciclo sin ejecutar el resto del bloque de código dentro del ciclo. Cuando se ejecuta una sentencia `continue`, el control del programa salta inmediatamente a la siguiente iteración del ciclo, evaluando nuevamente la condición de repetición.

Ejemplo de uso de la sentencia `continue` para calcular el promedio de un arreglo de números, ignorando los números negativos:

```java
// Ejemplo de cálculo del promedio de un arreglo utilizando un ciclo for y la sentencia continue en Java
public class PromedioArregloContinue {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double[] numeros = {10, -20, 30, -40, 50}; // Declaración de un arreglo de números decimales llamado numeros y asignación de valores, incluyendo números negativos
        double promedio = promedio(numeros); // Llamada al método promedio con el arreglo numeros como argumento y asignación del resultado a la variable promedio
        System.out.println("El promedio es: " + promedio); // Imprime el promedio calculado
    } // Fin del método principal

    public static double promedio(double[] arreglo) { // Método que calcula el promedio de un arreglo de números decimales y devuelve el resultado como un número decimal (double)
        double suma = 0; // Variable para almacenar la suma de los elementos del arreglo
        int contador = 0; // Variable para contar la cantidad de elementos válidos (no negativos)
        int i = 0; // Inicialización del índice para el ciclo while
        while (i < arreglo.length) { // Ciclo while que recorre el arreglo desde el primer elemento hasta el último
            double numero = arreglo[i]; // Obtiene el elemento actual del arreglo
            if (numero < 0) { // Condicional que verifica si el número es negativo
                i++; // Incrementa el índice antes de continuar
                continue; // Salta a la siguiente iteración del ciclo, ignorando el resto del bloque de código
            }
            suma += numero; // Suma el elemento actual del arreglo a la variable suma
            contador++; // Incrementa el contador de elementos válidos
            i++; // Incrementa el índice después de procesar el elemento actual
        }
        return (contador > 0) ? (suma / contador) : 0; // Devuelve el promedio dividiendo la suma entre la cantidad de elementos válidos, o 0 si no hay elementos válidos
    } // Fin del método promedio
}
```

#### Uso de etiquetas con break y continue

Java permite el uso de etiquetas (labels) con las sentencias `break` y `continue`, lo que nos permite salir de o continuar con un ciclo específico en caso de tener ciclos anidados. Una etiqueta es un identificador seguido de dos puntos (`:`) que se coloca antes de un ciclo o bloque de código. Cuando se utiliza una sentencia `break` o `continue` con una etiqueta, el control del programa salta al ciclo o bloque de código etiquetado. Esto es útil cuando tenemos ciclos anidados y queremos salir de un ciclo externo o continuar con un ciclo externo desde un ciclo interno.

Ejemplo de uso de etiquetas con la sentencia `break` para salir de un ciclo externo desde un ciclo interno:

```java
// Ejemplo de uso de etiquetas con la sentencia break en Java
public class BreakConEtiqueta {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[][] matriz = { // Declaración de un arreglo bidimensional llamado matriz y asignación de valores
            {1, 2, 3}, // Primera fila
            {4, 5, 6}, // Segunda fila
            {7, 8, 9}  // Tercera fila
        };
        boolean encontrado = false; // Variable para indicar si se encontró el número 5
        buscar: // Etiqueta para el ciclo externo
        for (int i = 0; i < matriz.length; i++) { // Ciclo for que recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Ciclo for que recorre las columnas de la matriz
                if (matriz[i][j] == 5) { // Condicional que verifica si el elemento actual es igual a 5
                    encontrado = true; // Se encontró el número 5
                    break buscar; // Salta fuera del ciclo externo utilizando la etiqueta buscar
                }
            } // Fin del ciclo interno
        } // Fin del ciclo externo
        if (encontrado) { // Condicional que verifica si se encontró el número 5
            System.out.println("Se encontró el número 5 en la matriz."); // Imprime un mensaje indicando que se encontró el número 5
        } else { // Si no se encontró el número 5
            System.out.println("No se encontró el número 5 en la matriz."); // Imprime un mensaje indicando que no se encontró el número 5
        }
    } // Fin del método principal
}
```
Para el caso del uso de etiquetas con la sentencia `continue`, podemos utilizar un ejemplo similar al anterior, pero en lugar de salir del ciclo externo, continuaremos con la siguiente iteración del ciclo externo desde el ciclo interno.

```java
// Ejemplo de uso de etiquetas con la sentencia continue en Java
public class ContinueConEtiqueta {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[][] matriz = { // Declaración de un arreglo bidimensional llamado matriz y asignación de valores
            {1, 2, 3}, // Primera fila
            {4, 5, 6}, // Segunda fila
            {7, 8, 9}  // Tercera fila
        };
        buscar: // Etiqueta para el ciclo externo
        for (int i = 0; i < matriz.length; i++) { // Ciclo for que recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Ciclo for que recorre las columnas de la matriz
                if (matriz[i][j] == 5) { // Condicional que verifica si el elemento actual es igual a 5
                    System.out.println("Se encontró el número 5 en la fila " + i + " y columna " + j); // Imprime un mensaje indicando la posición del número 5
                    continue buscar; // Salta a la siguiente iteración del ciclo externo utilizando la etiqueta buscar
                }
                System.out.println("Elemento en la fila " + i + " y columna " + j + ": " + matriz[i][j]); // Imprime el elemento actual de la matriz
            } // Fin del ciclo interno
        } // Fin del ciclo externo
    } // Fin del método principal
}
```

#### Sentencia switch

La sentencia `switch` es una estructura de control que nos permite ejecutar diferentes bloques de código según el valor de una expresión. La sintaxis básica de la sentencia `switch` es la siguiente:

```java
switch (expresión) {
    case valor1:
        // Bloque de código a ejecutar si la expresión es igual a valor1
        break; // Salta fuera del switch
    case valor2:
        // Bloque de código a ejecutar si la expresión es igual a valor2
        break; // Salta fuera del switch
    // ...
    default:
        // Bloque de código a ejecutar si la expresión no coincide con ningún valor
}
```

Ejemplo de uso de la sentencia `switch` para determinar el nombre del día de la semana según un número:

```java
// Ejemplo de uso de la sentencia switch en Java
public class SwitchDiasSemana {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int dia = 3; // Declaración de una variable entera dia y asignación de valor 3 (miércoles)
        switch (dia) { // Inicio de la sentencia switch que evalúa el valor de la variable dia
            case 1: // Caso para el valor 1 (lunes)
                System.out.println("Lunes"); // Imprime "Lunes"
                break; // Salta fuera del switch
            case 2: // Caso para el valor 2 (martes)
                System.out.println("Martes"); // Imprime "Martes"
                break; // Salta fuera del switch
            case 3: // Caso para el valor 3 (miércoles)
                System.out.println("Miércoles"); // Imprime "Miércoles"
                break; // Salta fuera del switch
            case 4: // Caso para el valor 4 (jueves)
                System.out.println("Jueves"); // Imprime "Jueves"
                break; // Salta fuera del switch
            case 5: // Caso para el valor 5 (viernes)
                System.out.println("Viernes"); // Imprime "Viernes"
                break; // Salta fuera del switch
            case 6: // Caso para el valor 6 (sábado)
                System.out.println("Sábado"); // Imprime "Sábado"
                break; // Salta fuera del switch
            case 7: // Caso para el valor 7 (domingo)
                System.out.println("Domingo"); // Imprime "Domingo"
                break; // Salta fuera del switch
            default: // Caso por defecto si el valor de dia no coincide con ningún caso anterior
                System.out.println("Día inválido"); // Imprime "Día inválido"
        } // Fin de la sentencia switch
    } // Fin del método principal
}
```

La sentencia `break` es opcional en cada caso del `switch`, pero es recomendable utilizarla para evitar que la ejecución continúe en los casos siguientes, lo que se conoce como "fall-through". Si no se incluye la sentencia `break`, el programa continuará ejecutando los bloques de código de los casos siguientes hasta encontrar un `break` o llegar al final del `switch`.

Ejemplo de uso de la sentencia `switch` sin la sentencia `break`, lo que provoca un "fall-through":

```java
import java.time.LocalDate;

// Ejemplo de uso de la sentencia switch omitiendo la sentencia break en varios casos en Java
public class SwitchFallThrough {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int mes = 2; // Declaración de una variable entera mes y asignación de valor 2 (febrero)
        switch (mes) { // Inicio de la sentencia switch que evalúa el valor de la variable mes
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: // Casos para los meses con 31 días
                System.out.println("El mes tiene 31 días"); // Imprime "El mes tiene 31 días"
                break; // Salta fuera del switch
            case 4:
            case 6:
            case 9:
            case 11: // Casos para los meses con 30 días
                System.out.println("El mes tiene 30 días"); // Imprime "El mes tiene 30 días"
                break; // Salta fuera del switch
            case 2: // Caso para el mes de febrero
                int year = LocalDate.now().getYear(); // Obtiene el año actual utilizando la clase LocalDate
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // Verifica si el año es bisiesto
                    System.out.println("El mes tiene 29 días"); // Imprime "El mes tiene 29 días" si el año es bisiesto
                } else {
                    System.out.println("El mes tiene 28 días"); // Imprime "El mes tiene 28 días" si el año no es bisiesto
                }
                break; // Salta fuera del switch
            default: // Caso por defecto si el valor de mes no coincide con ningún caso anterior
                System.out.println("Mes inválido"); // Imprime "Mes inválido"
        } // Fin de la sentencia switch
    } // Fin del método principal
}
```

### Clases, objetos y palabra reservada `null`

#### Clases y objetos

Una clase es una combinación de variables y métodos que representan un concepto o entidad en el mundo real. En Java, una clase es una plantilla o un modelo que define las propiedades (atributos) y comportamientos (métodos) de un objeto. Un objeto es una instancia de una clase, que representa una entidad concreta con sus propios valores para los atributos definidos en la clase. La creación de objetos a partir de clases nos permite organizar y estructurar nuestro código de manera más eficiente, facilitando la reutilización y el mantenimiento del mismo.

La sintaxis básica para definir una clase en Java es la siguiente:

```java
public class NombreDeLaClase { // Declaración de la clase con el modificador de acceso
    // Atributos (variables) de la clase
    // Métodos (funciones) de la clase
}
```

Ejemplo de una clase que nos permitirá calcular el promedio.

```java
// Ejemplo de una clase en Java que calcula el promedio
public class Average { // Declaración de la clase Average con el modificador de acceso public
    double sum; // Atributo para almacenar la suma de los números
    int count; // Atributo para almacenar la cantidad de números
    
    public void addNumber(double number) { // Método para agregar un número al promedio
        sum += number; // Suma el número al atributo sum
        count++; // Incrementa el contador de números
    } // Fin del método addNumber
    
    public double getAverage() { // Método para obtener el promedio
        return (count == 0) ? 0 : sum / count; // Devuelve el promedio o 0 si no hay números
    } // Fin del método getAverage
} // Fin de la clase Average

// Ejemplo de uso de la clase Average para calcular el promedio de varios números
public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
    Average average = new Average(); // Creación de un objeto de la clase Average
    average.addNumber(10); // Agrega el número 10 al promedio
    average.addNumber(20); // Agrega el número 20 al promedio
    average.addNumber(30); // Agrega el número 30 al promedio
    System.out.println("El promedio es: " + average.getAverage()); // Imprime el promedio calculado
} // Fin del método principalº
```

#### Las variables de objetos son referencias

En Java, las variables de objetos no almacenan directamente los datos del objeto, sino que almacenan una referencia (o dirección de memoria) al objeto en el heap. Esto significa que cuando creamos un objeto y lo asignamos a una variable, la variable contiene una referencia al objeto, y no el objeto en sí. Por lo tanto, si asignamos una variable de objeto a otra variable, ambas variables apuntarán al mismo objeto en memoria.

Cuando declaramos una variable de tipo primitiva sin inicializarla, Java asigna un valor predeterminado a esa variable. Por ejemplo, para los tipos primitivos numéricos (como `int`, `double`, etc.), el valor predeterminado es `0`. Para los tipos booleanos, el valor predeterminado es `false`. Sin embargo, para las variables de tipo objeto, el valor predeterminado es `null`, lo que indica que la variable no apunta a ningún objeto en memoria.

Un claro ejemplo es crear un objeto de la clase `Average` y asignarlo a una variable, posteriormente crear un objeto de la clase `Average` y asignarle la referencia del primer objeto. Si modificamos el primer objeto, los cambios se reflejarán en el segundo objeto, ya que ambos apuntan al mismo objeto en memoria.

```java
// Ejemplo de referencia de objetos en Java
public class ReferenciaObjetos {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Average average1 = new Average(); // Creación de un objeto de la clase Average y asignación a la variable average1
        average1.addNumber(10); // Agrega el número 10 al promedio del objeto average1
        average1.addNumber(20); // Agrega el número 20 al promedio del objeto average1
        System.out.println("El promedio de average1 es: " + average1.getAverage()); // Imprime el promedio calculado del objeto average1
        Average average2 = average1; // Asigna la referencia del objeto average1 a la variable average2
        average2.addNumber(30); // Agrega el número 30 al promedio del objeto average2 (que es el mismo que average1)
        System.out.println("El promedio de average1 es: " + average1.getAverage()); // Imprime el promedio calculado del objeto average1, que ahora incluye el número 30
        System.out.println("El promedio de average2 es: " + average2.getAverage()); // Imprime el promedio calculado del objeto average2, que es el mismo que average1
    } // Fin del método principal
}
```

#### La palabra reservada `null`

La palabra reservada `null` en Java se utiliza para indicar que una variable de tipo objeto no apunta a ningún objeto en memoria. Cuando una variable de tipo objeto se inicializa con `null`, significa que no tiene una referencia válida a un objeto, y cualquier intento de acceder a sus métodos o atributos resultará en un error de tiempo de ejecución conocido como `NullPointerException`.

### Cómo borrar objetos en memoria, variables mutables e inmutables, this.

#### ¿Cómo se libera la memoria usada por los objetos?

En Java, la memoria utilizada por los objetos se libera automáticamente mediante un proceso llamado recolección de basura (garbage collection). El recolector de basura es un mecanismo que se encarga de identificar y eliminar los objetos que ya no son accesibles o referenciados por ninguna variable en el programa. Cuando un objeto ya no tiene referencias válidas, el recolector de basura lo marca para su eliminación y libera la memoria asociada a ese objeto.

Java es lo suficientemente inteligente para determinar cuándo un objeto ya no es necesario y puede ser eliminado, lo que ayuda a prevenir fugas de memoria y optimizar el uso de recursos. Sin embargo, es importante tener en cuenta que la recolección de basura no garantiza una liberación inmediata de la memoria, ya que el recolector de basura se ejecuta en segundo plano y su comportamiento puede variar según la implementación de la máquina virtual de Java (JVM).

#### Variables mutables e inmutables

En Java, las variables mutables son aquellas cuyo valor puede cambiar después de haber sido inicializadas. Por ejemplo, los tipos primitivos como `int`, `double` y `boolean` son mutables, ya que podemos asignarles nuevos valores en cualquier momento. Además, los objetos de clases como `ArrayList` y `HashMap` también son mutables, ya que podemos modificar su contenido agregando, eliminando o cambiando elementos.

Por otro lado, las variables inmutables son aquellas cuyo valor no puede cambiar después de haber sido inicializadas. Un ejemplo común de variables inmutables en Java son los objetos de la clase `String`. Una vez que se crea un objeto `String`, su valor no puede modificarse. Si intentamos cambiar el contenido de un `String`, en realidad estamos creando un nuevo objeto `String` con el nuevo valor, mientras que el objeto original permanece sin cambios.

La inmutabilidad de una variable sirve para garantizar que su valor no se modifique accidentalmente, lo que puede ser útil en situaciones donde se requiere consistencia y seguridad en el manejo de datos. Además, las variables inmutables pueden mejorar el rendimiento y la eficiencia del programa, ya que permiten compartir referencias a objetos sin preocuparse por cambios inesperados en su estado.

En situaciones concurrentes o donde se utilicen múltiples hilos de ejecución, las variables inmutables son especialmente valiosas, ya que no requieren sincronización adicional para garantizar la consistencia de los datos. Esto se debe a que, al ser inmutables, no pueden ser modificadas por otros hilos, lo que reduce el riesgo de condiciones de carrera y errores relacionados con la concurrencia.

#### El identificador `this`

El identificador `this` en Java es una referencia al objeto actual dentro de una clase. Se utiliza para acceder a los atributos y métodos del objeto en el que se encuentra el código. El uso de `this` es especialmente útil cuando hay ambigüedad entre los nombres de los parámetros de un método y los nombres de los atributos de la clase.

```java
// Ejemplo de uso del identificador this en Java
public class Persona { // Declaración de la clase Persona con el modificador de acceso public
    private String nombre; // Atributo privado para almacenar el nombre de la persona
    private int edad; // Atributo privado para almacenar la edad de la persona
    public Persona(String nombre, int edad) { // Constructor de la clase Persona que recibe dos parámetros: nombre y edad
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre del objeto actual utilizando this
        this.edad = edad; // Asigna el valor del parámetro edad al atributo edad del objeto actual utilizando this
    } // Fin del constructor
    public void mostrarInformacion() { // Método para mostrar la información de la persona
        System.out.println("Nombre: " + this.nombre); // Imprime el nombre de la persona utilizando this
        System.out.println("Edad: " + this.edad); // Imprime la edad de la persona utilizando this
    } // Fin del método mostrarInformacion
    
    
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Persona persona = new Persona("Juan", 25); // Creación de un objeto de la clase Persona con el nombre "Juan" y la edad 25
        persona.mostrarInformacion(); // Llamada al método mostrarInformacion del objeto persona para mostrar su información
    } // Fin del método principal
} // Fin de la clase Persona
```

### Introducción a las excepciones

#### Introducción a las excepciones

Las excepciones son un mecanismo en Java creado para poder manejar errores y situaciones inesperadas que pueden ocurrir durante la ejecución de un programa. Una excepción es un evento que interrumpe el flujo normal de ejecución del programa y puede ser causada por diversos factores, como errores de programación, problemas de entrada/salida, errores de red, entre otros. Cuando ocurre una excepción, el programa genera un objeto de excepción que contiene información sobre el error, como el tipo de excepción, un mensaje descriptivo y, en algunos casos, la pila de llamadas (stack trace) que muestra el camino que llevó al error.

El mecanismo de una excepción funciona de la siguiente manera: cuando un método detecta un error al momento de realizar alguna acción, genera un objeto especial de clase Exception y lo reporta a Java, el cual a su ves intentará encontrar un código que pueda manejar la excepción. Si no se encuentra un código adecuado para manejar la excepción, el programa se detendrá y mostrará un mensaje de error en la consola.

Para que un programa pueda manejar excepciones, se utilizan bloques de código especiales llamados `try` y `catch`. El bloque `try` contiene el código que puede generar una excepción, mientras que el bloque `catch` contiene el código que maneja la excepción si ocurre. Finalmente, el programa puede incluir un bloque llamado `finally`, que contiene código que está garantizado que se ejecute, haya o no haya existido un error. La sintaxis básica para manejar excepciones en Java es la siguiente:

```java
try {
    // Código que puede generar una excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar la excepción
} finally {
    // Código que se ejecuta siempre, haya o no habido una excepción
}
```

Todas las execpiones que un programa puede arrojar son objetos derivados de la clase `Throwable`, que es la clase base para todas las excepciones y errores en Java. La clase `Throwable` tiene dos subclases principales: `Exception` y `Error`. La clase `Exception` representa condiciones que un programa puede manejar, mientras que la clase `Error` representa problemas graves que generalmente no pueden ser manejados por el programa.

Las excepciones se pueden clasificar en dos categorías principales: excepciones verificadas (checked exceptions) y excepciones no verificadas (unchecked exceptions). Las excepciones verificadas son aquellas que derivan de `Exeption` y que el compilador obliga a manejar, ya sea mediante un bloque `try-catch` o declarando la excepción en la firma del método con la palabra clave `throws`. Por otro lado, las excepciones no verificadas son aquellas que no requieren ser manejadas explícitamente, como las excepciones de tiempo de ejecución (RuntimeException) y sus subclases.

```java
void method1() {
    method2();
}

void method2() {
    method3();
}

void method3() {
    int a = 0;
    int b = 5 / a; // Esto generará una ArithmeticException (división por cero)
}

void main() {
    try {
        method1(); // Llamada al método que puede generar una excepción
    } catch (ArithmeticException e) { // Captura de la excepción ArithmeticException
        System.out.println("Se produjo un error: " + e.getMessage()); // Manejo de la excepción y mensaje de error
    } finally {
        System.out.println("Este bloque se ejecuta siempre, haya o no habido una excepción."); // Código que se ejecuta siempre
    }
}

```

Para explicar mejor la funcionalidad del bloque `finally`, podemos utilizar un ejemplo práctico que simule la apertura y cierre de un archivo. Suponiendo que existen 3 métodos, uno para abrir un archivo, otro para leerlo y otro para cerrarlo, podemos estructurar el código de la siguiente manera:

```java
try {
    abrirArchivo(); // Intento de abrir el archivo
    leerArchivo(); // Intento de leer el archivo
    cerrarArchivo(); // Cierre del archivo, garantizado que se ejecute siempre
} catch (IOException e) { // Captura de la excepción IOException
    System.out.println("Se produjo un error al abrir o leer el archivo: " + e.getMessage()); // Manejo de la excepción y mensaje de error
}
```

Si se llegara a presentar alguna excepción durante la apertura o lectura del archivo, el bloque `catch` se ejecutará para manejar la excepción y mostrar un mensaje de error. Pero el método `cerrarArchivo()` no se ejecutará, ya que el flujo del programa se interrumpirá al entrar al bloque `catch`. Para garantizar que el archivo se cierre correctamente, podemos utilizar un bloque `finally` de la siguiente manera:

```java
try {
    abrirArchivo(); // Intento de abrir el archivo
    leerArchivo(); // Intento de leer el archivo
} catch (IOException e) { // Captura de la excepción IOException
    System.out.println("Se produjo un error al abrir o leer el archivo: " + e.getMessage()); // Manejo de la excepción y mensaje de error
} finally {
    cerrarArchivo(); // Cierre del archivo, garantizado que se ejecute siempre, no importa si hubo una excepción o no
}
```

#### Uso de `throw` y `throws`

La palabra clave `throw` en Java se utiliza para lanzar una excepción de manera explícita dentro de un método o bloque de código. Cuando se utiliza `throw`, se crea un objeto de excepción y se lanza, lo que interrumpe el flujo normal del programa y transfiere el control a un bloque `catch` correspondiente, si existe. La sintaxis básica para utilizar `throw` es la siguiente:

```java
throw new TipoDeExcepcion("Mensaje de error"); // Lanza una nueva excepción del tipo especificado con un mensaje de error
```

Por otro lado, la palabra clave `throws` se utiliza en la declaración de un método para indicar que el método puede lanzar una o más excepciones durante su ejecución. Esto permite que el método informe a los llamadores que deben manejar esas excepciones, ya sea mediante un bloque `try-catch` o propagando la excepción hacia arriba en la cadena de llamadas. La sintaxis básica para utilizar `throws` es la siguiente:

```java
public void nombreDelMetodo() throws TipoDeExcepcion1, TipoDeExcepcion2 {
    // Código del método que puede lanzar excepciones
}
```

Ejemplo de uso de `throw` y `throws` en Java:

```java
// Ejemplo de uso de throw y throws en Java
public class EjemploThrowThrows { // Declaración de la clase EjemploThrowThrows con el modificador de acceso public
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        try { // Bloque try para manejar posibles excepciones
            dividir(10, 0); // Llamada al método dividir con un divisor de cero, lo que generará una ArithmeticException
        } catch (ArithmeticException e) { // Bloque catch para capturar la excepción ArithmeticException
            System.out.println("Se produjo un error: " + e.getMessage()); // Manejo de la excepción y mensaje de error
        }
    } // Fin del método principal
    
    public static int dividir(int a, int b) throws ArithmeticException { // Declaración del método dividir que puede lanzar una ArithmeticException
        if (b == 0) { // Condicional que verifica si el divisor es cero
            throw new ArithmeticException("División por cero no permitida"); // Lanza una nueva excepción ArithmeticException con un mensaje de error
        }
        return a / b; // Retorna el resultado de la división si el divisor no es cero
    } // Fin del método dividir
} // Fin de la clase EjemploThrowThrows
```

#### Múltiples bloques `catch` y la jerarquía de excepciones

Un bloque `try` puede manejar múltiples tipos de excepciones utilizando varios bloques `catch`. Cada bloque `catch` se encarga de capturar un tipo específico de excepción, lo que permite manejar diferentes errores de manera individualizada. Las excepciones más generales deben ser capturadas después de las excepciones más específicas, ya que si se colocan primero, las excepciones más específicas nunca serán alcanzadas. Esto se debe a que la jerarquía de excepciones en Java permite que una excepción más general capture también las excepciones más específicas que heredan de ella.

La sintaxis básica para utilizar múltiples bloques `catch` es la siguiente:

```java
try {
    // Código que puede generar una excepción
} catch (IOException e) {
    // Código para manejar la excepción TipoDeExcepcion1
} catch (NullPointerException e) {
    // Código para manejar la excepción TipoDeExcepcion2
} catch (Exception e) {
    // Código para manejar la excepción TipoDeExcepcion3
}
```

### Métodos y campos estáticos, variables finales

#### Métodos y campos estáticos

En Java, los métodos y campos estáticos pertenecen a la clase en sí misma, en lugar de a una instancia específica de la clase. Esto significa que se pueden acceder a ellos sin necesidad de crear un objeto de la clase. Los métodos y campos estáticos se declaran utilizando la palabra clave `static`.

Un ejemplo de campos y métodos estáticos es la clase `Math` de Java, que proporciona métodos para realizar operaciones matemáticas comunes, como el cálculo de raíces cuadradas, potencias y funciones trigonométricas. Los métodos de la clase `Math` son estáticos, lo que permite llamarlos directamente desde la clase sin necesidad de crear un objeto.

```java
// Ejemplo de uso de métodos y campos estáticos en Java
public class EjemploStatic { // Declaración de la clase EjemploStatic con el modificador de acceso public
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        double numero = 16; // Declaración de una variable double para almacenar el número 16
        double raizCuadrada = Math.sqrt(numero); // Llamada al método estático sqrt de la clase Math para calcular la raíz cuadrada del número
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada); // Imprime el resultado de la raíz cuadrada
        double potencia = Math.pow(2, 3); // Llamada al método estático pow de la clase Math para calcular 2 elevado a la potencia de 3
        System.out.println("2 elevado a la potencia de 3 es: " + potencia); // Imprime el resultado de la potencia
    } // Fin del método principal
} // Fin de la clase EjemploStatic
```

Ejemplo de un campo estático que mantiene un contador de instancias creadas de una clase:

```java
// Ejemplo de un campo estático que mantiene un contador de instancias creadas de una clase en Java
public class ContadorInstancias { // Declaración de la clase ContadorInstancias con el modificador de acceso public
    private static int contador = 0; // Campo estático para contar el número de instancias creadas de la clase, inicializado en 0
    public ContadorInstancias() { // Constructor de la clase ContadorInstancias
        contador++; // Incrementa el contador cada vez que se crea una nueva instancia de la clase
    } // Fin del constructor
    public static int obtenerContador() { // Método estático para obtener el valor del contador
        return contador; // Retorna el valor actual del contador
    } // Fin del método obtenerContador
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        ContadorInstancias obj1 = new ContadorInstancias(); // Creación de la primera instancia de la clase ContadorInstancias
        ContadorInstancias obj2 = new ContadorInstancias(); // Creación de la segunda instancia de la clase ContadorInstancias
        ContadorInstancias obj3 = new ContadorInstancias(); // Creación de la tercera instancia de la clase ContadorInstancias
        System.out.println("Número de instancias creadas: " + ContadorInstancias.obtenerContador()); // Imprime el número total de instancias creadas utilizando el método estático obtenerContador
    } // Fin del método principal
} // Fin de la clase ContadorInstancias
```

#### Variables finales

Las variables finales son aquellas cuyo valor inicial nunca cambia después de haber sido asignado. En Java, se utiliza la palabra clave `final` para declarar una variable como final. Una vez que se le asigna un valor a una variable final, no se puede modificar ni reasignar. Esto es útil para definir constantes o valores que deben permanecer inalterables a lo largo del programa.

```java
// Ejemplo de uso de variables finales en Java
public class EjemploFinal { // Declaración de la clase EjemploFinal con el modificador de acceso public
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        final double PI = 3.14159; // Declaración de una variable final PI con un valor constante de 3.14159
        System.out.println("El valor de PI es: " + PI); // Imprime el valor de la constante PI
        // PI = 3.14; // Esto generará un error de compilación, ya que no se puede reasignar un valor a una variable final
    } // Fin del método principal
} // Fin de la clase EjemploFinal
```

### Constantes, control de acceso, tipos Enum

#### Constantes

Todos los programas necesitan valores que no cambian durante la ejecución del programa, como el valor de PI, la velocidad de la luz o el número de días en una semana. En Java, podemos definir constantes utilizando la palabra clave `final`, lo que indica que el valor de la variable no puede cambiar después de haber sido asignado. Además, es común utilizar la convención de nombrar las constantes en mayúsculas para diferenciarlas de las variables normales.

En Java no existe una palabra clave específica para declarar constantes, pero podemos combinar `final` con `static` para crear constantes de clase que sean compartidas por todas las instancias de la clase. Esto es útil cuando queremos definir valores que son universales y no dependen de un objeto específico.

```java
// Ejemplo de uso de constantes en Java
public class Constantes { // Declaración de la clase Constantes con el modificador de acceso public
    public static final double PI = 3.14159; // Declaración de una constante PI con un valor de 3.14159 utilizando final y static
    public static final int DIAS_EN_SEMANA = 7; // Declaración de una constante DIAS_EN_SEMANA con un valor de 7 utilizando final y static
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        System.out.println("El valor de PI es: " + PI); // Imprime el valor de la constante PI
        System.out.println("El número de días en una semana es: " + DIAS_EN_SEMANA); // Imprime el valor de la constante DIAS_EN_SEMANA
        // PI = 3.14; // Esto generará un error de compilación, ya que no se puede reasignar un valor a una constante final
    } // Fin del método principal
} // Fin de la clase Constantes
```

Un ejemplo de las ventajas de usar constantes es cuando evaluamos el valor de una constante en una condicional `if-else`. Por ejemplo:

```java
// Ejemplo de uso de constantes en una condicional if-else en Java
public class ConstantesIfElse { // Declaración de la clase ConstantesIfElse con el modificador de acceso public
    public static final int EDAD_MINIMA = 18; // Declaración de una constante EDAD_MINIMA con un valor de 18 utilizando final y static
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int edad = 20; // Declaración de una variable edad con un valor de 20
        if (edad >= EDAD_MINIMA) { // Condicional que verifica si la edad es mayor o igual a la constante EDAD_MINIMA
            System.out.println("Eres mayor de edad."); // Imprime un mensaje indicando que la persona es mayor de edad
        } else { // Bloque else que se ejecuta si la condición anterior no se cumple
            System.out.println("Eres menor de edad."); // Imprime un mensaje indicando que la persona es menor de edad
        } // Fin del bloque if-else
    } // Fin del método principal
} // Fin de la clase ConstantesIfElse
```

Aunque incialmente nuestro código se ve de esa manera, el compilador de Java elimina el bloque donde se cumpla la condición y el código se ve de la siguiente manera:

```java
public static final int EDAD_MINIMA = 18;
System.out.println("Eres mayor de edad."); // Imprime un mensaje indicando que la persona es mayor de edad
```

#### Control de acceso a los miembros de una clase

En Java, el control de acceso a los miembros de una clase se refiere a la capacidad de restringir o permitir el acceso a los atributos y métodos de una clase desde otras clases o paquetes. Esto se logra mediante el uso de modificadores de acceso, que determinan la visibilidad y accesibilidad de los miembros de la clase. Los modificadores de acceso más comunes en Java son:

- `public`: Los miembros declarados como `public` son accesibles desde cualquier clase o paquete. No hay restricciones de acceso, lo que significa que cualquier código puede acceder a ellos.
- `private`: Los miembros declarados como `private` son accesibles únicamente dentro de la misma clase. No pueden ser accedidos desde otras clases, incluso si están en el mismo paquete. Esto proporciona encapsulamiento y protege los datos internos de la clase.
- `protected`: Los miembros declarados como `protected` son accesibles dentro de la misma clase, en subclases (clases que heredan de la clase) y en clases del mismo paquete. Esto permite un nivel de acceso intermedio entre `public` y `private`.
- `default` (sin modificador): Si no se especifica ningún modificador de acceso, los miembros tienen un acceso por defecto, lo que significa que son accesibles únicamente dentro del mismo paquete.

#### Constructores

Los constructores son métodos especiales en Java que se utilizan para inicializar objetos de una clase. Se llaman automáticamente cuando se crea un objeto y tienen el mismo nombre que la clase. Los constructores no tienen un tipo de retorno, ni siquiera `void`, y pueden aceptar parámetros para permitir la inicialización de los atributos del objeto con valores específicos.

```java
// Ejemplo de uso de constructores en Java
public class Persona { // Declaración de la clase Persona con el modificador de acceso public
    private String nombre; // Atributo privado para almacenar el nombre de la persona
    private int edad; // Atributo privado para almacenar la edad de la persona
    
    public Persona(String nombre, int edad) { // Constructor de la clase Persona que recibe dos parámetros: nombre y edad
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre del objeto actual utilizando this
        this.edad = edad; // Asigna el valor del parámetro edad al atributo edad del objeto actual utilizando this
    } // Fin del constructor
    
    public void mostrarInformacion() { // Método para mostrar la información de la persona
        System.out.println("Nombre: " + this.nombre); // Imprime el nombre de la persona utilizando this
        System.out.println("Edad: " + this.edad); // Imprime la edad de la persona utilizando this
    } // Fin del método mostrarInformacion
    
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Persona persona = new Persona("Juan", 25); // Creación de un objeto de la clase Persona con el nombre "Juan" y la edad 25
        persona.mostrarInformacion(); // Llamada al método mostrarInformacion del objeto persona para mostrar su información
    } // Fin del método principal
} // Fin de la clase Persona
```

#### Tipos Enum

Los tipos Enum (enumeraciones) en Java son un tipo de dato especial que permite definir un conjunto de constantes con nombre. Cada constante en un Enum es una instancia de la clase Enum y puede tener propiedades y métodos asociados. Los Enums se utilizan para representar un conjunto fijo de valores posibles, lo que mejora la legibilidad del código y reduce la posibilidad de errores al utilizar valores literales.

```java
// Ejemplo de uso de tipos Enum en Java
public class EjemploEnum { // Declaración de la clase EjemploEnum con el modificador de acceso public
    enum DiaDeLaSemana { // Declaración del Enum DiaDeLaSemana
        LUNES, // Constante que representa el día lunes
        MARTES, // Constante que representa el día martes
        MIERCOLES, // Constante que representa el día miércoles
        JUEVES, // Constante que representa el día jueves
        VIERNES, // Constante que representa el día viernes
        SABADO, // Constante que representa el día sábado
        DOMINGO // Constante que representa el día domingo
    } // Fin del Enum DiaDeLaSemana
    
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        DiaDeLaSemana dia = DiaDeLaSemana.LUNES; // Asignación de la constante LUNES del Enum DiaDeLaSemana a la variable dia
        switch (dia) { // Estructura switch para evaluar el valor de la variable dia
            case LUNES: // Caso para el día lunes
                System.out.println("Hoy es lunes."); // Imprime un mensaje indicando que hoy es lunes
                break; // Salta fuera del switch
            case MARTES: // Caso para el día martes
                System.out.println("Hoy es martes."); // Imprime un mensaje indicando que hoy es martes
                break; // Salta fuera del switch
            case MIERCOLES: // Caso para el día miércoles
                System.out.println("Hoy es miércoles."); // Imprime un mensaje indicando que hoy es miércoles
                break; // Salta fuera del switch
            case JUEVES: // Caso para el día jueves
                System.out.println("Hoy es jueves."); // Imprime un mensaje indicando que hoy es jueves
                break; // Salta fuera del switch
            case VIERNES: // Caso para el día viernes
                System.out.println("Hoy es viernes."); // Imprime un mensaje indicando que hoy es viernes
                break; // Salta fuera del switch
            case SABADO: // Caso para el día sábado
                System.out.println("Hoy es sábado."); // Imprime un mensaje indicando que hoy es sábado
                break; // Salta fuera del switch
            case DOMINGO: // Caso para el día domingo
                System.out.println("Hoy es domingo."); // Imprime un mensaje indicando que hoy es domingo
                break; // Salta fuera del switch
        } // Fin de la estructura switch
    } // Fin del método principal
} // Fin de la clase EjemploEnum
```

## Archivos Java

Los programas de Java son en realidad un conjunto de clases que interactúan entre sí para producir el resultado deseado. El código fuente de una clase es un archivo de texto con extensión `.java`, que contiene la definición de la clase y sus miembros (atributos y métodos). Este código fuente es compilado por el compilador de Java (`javac`) para generar un archivo de bytecode con extensión `.class`, que puede ser ejecutado por la máquina virtual de Java (JVM).

Uitlizando Notepad++ o cualquier editor de texto, podemos crear un archivo con extensión `.java` y escribir el código fuente de nuestra clase. Por ejemplo, podemos crear un archivo llamado `MiClase.java` con el siguiente contenido:

```java
public class MiClase { // Declaración de la clase MiClase con el modificador de acceso public usando la convención de nombrar las clases con la primera letra en mayúscula, y si son compuestas, la primera letra de cada palabra en mayúscula
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa, este método es estático y público, lo que significa que puede ser llamado sin crear una instancia de la clase y es accesible desde cualquier lugar. Este método es buscado por la JVM como punto de entrada del programa.
        System.out.println("Hola, mundo!"); // Imprime el mensaje "Hola, mundo!" en la consola
    } // Fin del método principal
} // Fin de la clase MiClase
```

**Nota:** Es importante que el nombre del archivo coincida exactamente con el nombre de la clase pública que contiene, incluyendo mayúsculas y minúsculas. En este caso, el archivo debe llamarse `MiClase.java` porque la clase pública se llama `MiClase`. De igual manera, si el editor te lo permite, asegúrate de guardar el archivo con codificación UTF-8 para evitar problemas con caracteres especiales.

Guarda el archivo con extensión `.java` y luego compílalo utilizando el compilador de Java (`javac`) desde la línea de comandos. Aseguráte de encontrarte en el directorio donde guardaste el archivo `MiClase.java` en la terminal y ejecuta el siguiente comando:

```batch
C:\myPath>javac MiClase.java
```

```mac
$ javac MiClase.java
```

Si la compilación es exitosa, se generará un archivo llamado `MiClase.class` en el mismo directorio. Este archivo contiene el bytecode que puede ser ejecutado por la JVM.

Para ejecutar el programa, utiliza el comando `java` seguido del nombre de la clase (sin la extensión `.class`):

```batch
C:\myPath>java MiClase
```

```mac
$ java MiClase
```

**Nota:** Asegúrate de encontrarte en el directorio donde se encuentran los archivos `.java` y `.class` desde tu terminal, ya que de lo contrario, la JVM no podrá encontrar la clase y se producirá un error de ejecución, para ello debes utilizar el comando `cd` para cambiar al directorio correcto antes de ejecutar el programa.

### Ejercicio de dibujo de árbol de Navidad

El siguiente ejercicio consiste en dibujar un árbol de Navidad utilizando caracteres en la consola. El árbol tendrá una altura determinada estará compuesto por asteriscos (`*`) para representar las ramas y un tronco representado por el carácter `| |`. La salida del programa será un árbol de Navidad simétrico y centrado en la consola.

```console
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
        | |
        | |
```

#### Algoritmo para dibujar el árbol de Navidad

1. Para cada nivel del árbol (desde 1 hasta la altura deseada):
   - Calcular el número de espacios en blanco necesarios para centrar los asteriscos.
   - Calcular el número de asteriscos que se deben imprimir en ese nivel.
   - Imprimir los espacios en blanco seguidos de los asteriscos.
2. Después de dibujar todas las ramas del árbol, imprimir el tronco del árbol centrado en la consola.
3. Repetir el proceso para el número de niveles deseado para crear un árbol de Navidad completo.
4. Asegurarse de que el tronco del árbol esté alineado con el centro del árbol para mantener la simetría.

### Comentarios, el concepto de máquina virtual de Java

#### Comentarios

Un comentario es cualquier texto que se escribe en el programa y funciona como ayuda para que otros programadores (o uno mismo en el futuro) puedan entender mejor el código. Los comentarios no son ejecutados por la máquina virtual de Java (JVM) y no afectan el funcionamiento del programa. En Java, existen tres tipos principales de comentarios:

1. **Comentarios de una sola línea**: Se utilizan para agregar comentarios breves en una sola línea. Se escriben utilizando dos barras diagonales (`//`). Todo el texto después de `//` en esa línea se considera un comentario y no se ejecutará.

   ```java
   // Este es un comentario de una sola línea
   int x = 5; // Esto también es un comentario
   ```
   
2. **Comentarios de varias líneas**: Se utilizan para agregar comentarios que abarcan varias líneas. Se escriben utilizando `/*` al inicio del comentario y `*/` al final. Todo el texto entre estos delimitadores se considera un comentario y no se ejecutará.

   ```java
   /* Este es un comentario de varias líneas
      que puede abarcar varias líneas de texto.
      Es útil para explicar secciones más grandes de código. */
   int y = 10; /* Esto también es un comentario de varias líneas */
   ```

3. **Comentarios de documentación (Javadoc)**: Se utilizan para generar documentación automática del código fuente. Se escriben utilizando `/**` al inicio del comentario y `*/` al final. Los comentarios de Javadoc se colocan generalmente antes de la declaración de clases, métodos o atributos, y pueden incluir etiquetas especiales para describir parámetros, valores de retorno y excepciones.

   ```java
   /**
    * Esta es una clase de ejemplo que representa una persona.
    * Contiene atributos como nombre y edad, y métodos para mostrar información.
    */
   public class Persona {
       private String nombre; // Atributo para almacenar el nombre de la persona
       private int edad; // Atributo para almacenar la edad de la persona
   }
   ```
   
#### El concepto de máquina virtual de Java (JVM)

La máquina virtual de Java (JVM) es un componente fundamental del entorno de ejecución de Java que permite ejecutar programas escritos en el lenguaje de programación Java. La JVM actúa como una capa de abstracción entre el código Java y el sistema operativo subyacente, lo que permite que los programas Java sean portátiles y puedan ejecutarse en diferentes plataformas sin necesidad de modificaciones.

Java funciona bajo el concepto de compatilidad universal, también conocido como "write once, run anywhere" (WORA), lo que significa que el mismo código Java puede ejecutarse en diferentes sistemas operativos y arquitecturas de hardware sin cambios. Esto se logra mediante la compilación del código fuente Java en un formato intermedio llamado bytecode, que es independiente de la plataforma. El bytecode es interpretado y ejecutado por la JVM, que traduce las instrucciones del bytecode en instrucciones específicas del sistema operativo y hardware en tiempo de ejecución.

Podríamos pensar que un programa en Java, al ser compilado y posteriormente interpretado por la JVM, sería más lento que un programa escrito en un lenguaje compilado directamente a código máquina, como C o C++. Sin embargo, la JVM utiliza técnicas de optimización y compilación just-in-time (JIT) para mejorar el rendimiento de los programas Java. La compilación JIT traduce partes del bytecode en código máquina nativo en tiempo de ejecución, lo que permite que el programa se ejecute más rápido después de la primera ejecución. De hecho, en muchos casos, los programas Java pueden alcanzar un rendimiento comparable o mejor al de los programas escritos en lenguajes compilados directamente a código máquina como C o C++.

### El classpath y package

El classpath es un indicador que le dije a Java dónde buscar las clases y paquetes necesarios para ejecutar un programa. Es una lista de directorios y archivos JAR que contienen las clases y recursos que el programa necesita para funcionar correctamente. El classpath puede configurarse mediante la variable de entorno `CLASSPATH` o mediante la opción `-cp` o `-classpath` al ejecutar el comando `java` o `javac`.

Todos los programas se rigen bajo las reglas del classpath, y si no se encuentra una clase o paquete necesario para ejecutar el programa, se producirá un error de ejecución. Por ejemplo, si intentamos ejecutar un programa que utiliza una clase que no está en el classpath, obtendremos un error como "ClassNotFoundException" o "NoClassDefFoundError".

Hoy en día, existen editores de Java muy poderosos que nos permiten crear proyectos de Java y manejar el classpath de manera automática, como Eclipse, NetBeans o IntelliJ IDEA, pero entre todo ese poder ocultan los detalles de cómo funciona el classpath y los paquetes, por lo que es importante entender estos conceptos para poder trabajar con Java de manera efectiva.

Es importante tener en cuenta que el classpath no solo afecta la ejecución de los programas, sino también la compilación de los mismos. Si una clase o paquete necesario para compilar un programa no está en el classpath, obtendremos un error de compilación. Por lo tanto, es importante asegurarse de que el classpath esté configurado correctamente tanto para la compilación como para la ejecución de los programas.

Ejemplo, supongamos que tenemos un proyecto de Java con la siguiente estructura de directorios:

```
MiProyecto/
├── src/
│   ├── com/
│   │   └── ejemplo/
│   │       └── MiClase.java
├── lib/
│   └── miBiblioteca.jar
```

En este ejemplo, el proyecto tiene un directorio `src` que contiene el código fuente de la clase `MiClase` dentro del paquete `com.ejemplo`, y un directorio `lib` que contiene un archivo JAR llamado `miBiblioteca.jar` que contiene clases adicionales necesarias para el proyecto.

Para compilar y ejecutar el programa, debemos asegurarnos de que el classpath incluya tanto el directorio `src` como el archivo JAR `miBiblioteca.jar`. Podemos hacerlo utilizando la opción `-cp` o `-classpath` al ejecutar los comandos `javac` y `java`. Por ejemplo, para compilar la clase `MiClase`, podemos utilizar el siguiente comando:

```bash
javac -cp src:lib/miBiblioteca.jar src/com/ejemplo/MiClase.java
```

Las clases se pueden encontrar en dos lugares, en directorios y en archivos JAR. Los directorios contienen archivos `.class` que representan las clases compiladas, mientras que los archivos JAR son archivos comprimidos que contienen múltiples clases y recursos. Al configurar el classpath, podemos incluir tanto directorios como archivos JAR para que Java pueda encontrar todas las clases necesarias para ejecutar el programa.

#### Paquetes (Packages)

Los paquetes en Java son una forma de organizar y agrupar clases relacionadas en un espacio de nombres común. Un paquete es un contenedor que permite evitar conflictos de nombres entre clases y facilita la gestión del código fuente. Los paquetes también proporcionan un nivel adicional de control de acceso, ya que las clases dentro de un paquete pueden acceder a otras clases del mismo paquete sin necesidad de ser públicas.

Ejemplo, supongamos que tenemos un proyecto de Java con la siguiente estructura de directorios:

```
MiProyecto/
├── src/
│   ├── com/
│   │   └── ejemplo/
│   │       └── MiClase.java
```

En este ejemplo, la clase `MiClase` está ubicada dentro del paquete `com.ejemplo`. Para declarar que la clase pertenece a este paquete, debemos incluir la declaración del paquete al inicio del archivo `MiClase.java`:

```java
package com.ejemplo; // Declaración del paquete al que pertenece la clase MiClase
public class MiClase { // Declaración de la clase MiClase con el modificador de acceso public
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        System.out.println("Hola desde el paquete com.ejemplo!"); // Imprime un mensaje indicando que el programa se ejecuta desde el paquete com.ejemplo
    } // Fin del método principal
} // Fin de la clase MiClase
```

Podríamos pensar que el nombre correcto de la clase es `MiClase`, pero en realidad, el nombre completo de la clase es `com.ejemplo.MiClase`, ya que pertenece al paquete `com.ejemplo`. Esto significa que para ejecutar la clase desde la línea de comandos, debemos utilizar el nombre completo del paquete y la clase:

```bash
java -cp src com.ejemplo.MiClase
```

**Nota:** Es importante asegurarse de que en la terminal nos encontremos en el directorio raíz del proyecto (`MiProyecto`) antes de ejecutar el comando, ya que de lo contrario, la JVM no podrá encontrar la clase y se producirá un error de ejecución.

¿El archivo `MiClase.java` debe estar ubicado en el directorio correspondiente al paquete, es decir, en `src/com/ejemplo/MiClase.java`? Si no lo hacemos, la compilación se realizará correctamente, pero al momento de ejecutar el programa, la JVM no podrá encontrar la clase y se producirá un error de ejecución. Por lo tanto, es importante seguir la convención de ubicar los archivos de clase en directorios que reflejen la estructura del paquete al que pertenecen.

### Relación entre el classpath y packages

El classpath y los paquetes están estrechamente relacionados en Java, ya que el classpath determina dónde la JVM busca las clases y paquetes necesarios para ejecutar un programa. Cuando se utiliza un paquete, la estructura de directorios debe reflejar la jerarquía del paquete, y el classpath debe incluir el directorio raíz que contiene esa estructura. Por ejemplo, si tenemos un paquete `com.ejemplo` y la clase `MiClase` dentro de ese paquete, la estructura de directorios debe ser `src/com/ejemplo/MiClase.java`, y el classpath debe incluir el directorio `src` para que la JVM pueda encontrar la clase correctamente.

## El API de Java (Parte 1)

### Documentación oficial de Java

#### El API de Java

El API de Java (Application Programming Interface) es un conjunto de clases, interfaces y paquetes que proporcionan funcionalidades predefinidas para facilitar el desarrollo de aplicaciones en Java. El API de Java está organizado en diferentes paquetes, cada uno con un propósito específico, y abarca una amplia gama de áreas, como estructuras de datos, entrada/salida, redes, concurrencia, seguridad y más.

#### Documentación oficial de Java

La documentación oficial de Java es una fuente fundamental para aprender y utilizar el API de Java. Proporciona información detallada sobre las clases, interfaces y métodos disponibles, así como ejemplos de uso y guías de referencia. La documentación oficial de Java se encuentra en la página web de Oracle, en la sección de Java SE Documentation. La documentación está disponible en línea y se puede acceder a ella de forma gratuita. Además, la documentación oficial de Java se actualiza regularmente para reflejar las nuevas características y mejoras del lenguaje.

### La clase `java.lang.Sytem`

La clase `java.lang.System` es una clase final que forma parte del paquete `java.lang`, el cual se importa automáticamente en todos los programas de Java. Esta clase proporciona métodos y campos estáticos que permiten interactuar con el entorno de ejecución de Java, como la entrada/salida estándar, la gestión de propiedades del sistema, la obtención de información sobre el entorno y la finalización del programa.

La clase `System` tiene 3 variables de clase (estáticas) que son muy útiles para la entrada y salida de datos:

1. `System.out`: Es un objeto de la clase `PrintStream` que representa la salida estándar del programa, generalmente la consola. Se utiliza para imprimir mensajes y resultados en la consola utilizando métodos como `print()`, `println()` y `printf()`.
2. `System.in`: Es un objeto de la clase `InputStream` que representa la entrada estándar del programa, generalmente el teclado. Se utiliza para leer datos de entrada desde la consola utilizando clases como `Scanner` o `BufferedReader`.
3. `System.err`: Es un objeto de la clase `PrintStream` que representa la salida de error estándar del programa, generalmente la consola.

Ejemplo de uso de `System.in` para leer datos desde la entrada estándar (teclado):

```java
package com.driagon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Crea un BufferedReader para leer la entrada estándar (teclado)
            System.out.print("Ingrese su nombre: "); // Solicita al usuario que ingrese su nombre
            String nombre = reader.readLine(); // Lee la línea ingresada por el usuario y la almacena en la variable nombre
            System.out.println("Hola, " + nombre + "!"); // Imprime un saludo personalizado utilizando el nombre ingresado
        } catch (Exception e) { // Captura cualquier excepción que pueda ocurrir durante la lectura de la entrada
            System.err.println("Error al leer la entrada: " + e.getMessage()); // Imprime un mensaje de error en la salida de error estándar
        }
    }
}
```

Ejemplo para leer las propiedades del sistema utilizando la clase `System`:

```java
package com.driagon;

import java.util.Properties;

public class SystemPropertiesTest {
    public static void main(String[] args) {
        Properties propiedades = System.getProperties(); // Obtiene las propiedades del sistema utilizando el método getProperties() de la clase System
        for (String key : propiedades.stringPropertyNames()) { // Itera sobre todas las claves de las propiedades del sistema
            String value = propiedades.getProperty(key); // Obtiene el valor de la propiedad correspondiente a la clave actual
            System.out.println(key + ": " + value); // Imprime la clave y el valor de la propiedad en la salida estándar (consola)
        }
    }
}
```

### Clases para primitivos, autoboxing, Strings

#### Clases para tipos de datos primitivos

En Java, cada tipo de dato primitivo tiene una clase envolvente (wrapper class) correspondiente que proporciona métodos y funcionalidades adicionales para trabajar con esos tipos de datos. Estas clases envolventes permiten tratar los tipos de datos primitivos como objetos y proporcionan métodos para convertir entre tipos de datos, realizar operaciones y manipular valores. Las clases envolventes para los tipos de datos primitivos en Java son las siguientes:

| Tipo de dato primitivo | Clase envolvente (Wrapper Class)           |
|------------------------|--------------------------------------------|
| byte                   | java.lang.Byte                             |
| short                  | java.lang.Short                            |
| int                    | java.lang.Integer                          |
| long                   | java.lang.Long                             |
| float                  | java.lang.Float                            |
| double                 | java.lang.Double                           |
| char                   | java.lang.Character                        |
| boolean                | java.lang.Boolean                          |

Como puedes observar en la tabla, cada tipo de dato primitivo tiene una clase envolvente correspondiente en el paquete `java.lang`. Estas clases proporcionan métodos y funcionalidades adicionales para trabajar con los tipos de datos primitivos, como la conversión entre tipos, la comparación de valores y la manipulación de cadenas de caracteres.

Cada clase tiene definidos las constantes `MIN_VALUE` y `MAX_VALUE`, que representan los valores mínimo y máximo que puede almacenar el tipo de dato primitivo correspondiente. Por ejemplo, la clase `Integer` tiene las constantes `Integer.MIN_VALUE` y `Integer.MAX_VALUE`, que representan el valor mínimo y máximo que puede almacenar un entero en Java.

Cada clase también tiene definidos métodos estáticos para convertir entre tipos de datos primitivos y objetos, como `valueOf()` y `parseX()`, donde `X` es el tipo de dato primitivo correspondiente. Estos métodos permiten convertir fácilmente entre tipos de datos primitivos y objetos, lo que facilita la manipulación y el procesamiento de datos en Java.

Ejemplo que imprime el valor mínimo y máximo de cada tipo de dato primitivo utilizando las clases envolventes:

```java
package com.driagon;

public class PrimitivosYClasesEnvolventes {
    public static void main(String[] args) {
        System.out.println("Valores mínimo y máximo de los tipos de datos primitivos en Java:");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE);
        System.out.println("boolean: false o true");
    }
}
```

#### Autoboxing

Autoboxing es el proceso automático de conversión de un tipo de dato primitivo a su clase envolvente correspondiente. Por ejemplo, cuando asignamos un valor entero a una variable de tipo `Integer`, Java realiza automáticamente la conversión de `int` a `Integer`. Esto permite trabajar con tipos de datos primitivos como objetos sin necesidad de realizar conversiones explícitas.

Convertir un primitivo a clase se llama boxing, y convertir una clase a primitivo se llama unboxing. Por ejemplo, si tenemos un `int` y lo asignamos a un `Integer`, Java realiza boxing automáticamente. De manera similar, si tenemos un `Integer` y lo asignamos a un `int`, Java realiza unboxing automáticamente.

Ejemplo de autoboxing y unboxing en Java:

```java
package com.driagon;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Boxing: conversión automática de int a Integer
        int primitivo = 10; // Declaración de un tipo de dato primitivo int
        Integer objeto = primitivo; // Conversión automática de int a Integer (boxing)
        
        // Unboxing: conversión automática de Integer a int
        Integer otroObjeto = 20; // Declaración de un objeto Integer
        int otroPrimitivo = otroObjeto; // Conversión automática de Integer a int (unboxing)
        
        System.out.println("Valor del primitivo: " + primitivo); // Imprime el valor del primitivo
        System.out.println("Valor del objeto: " + objeto); // Imprime el valor del objeto
        System.out.println("Valor del otro objeto: " + otroObjeto); // Imprime el valor del otro objeto
        System.out.println("Valor del otro primitivo: " + otroPrimitivo); // Imprime el valor del otro primitivo
    }
}
```

#### Strings

En Java, un `String` es un objeto que representa una secuencia de caracteres. Los `String` son inmutables, lo que significa que una vez creado un objeto `String`, su valor no puede cambiar. Si se realiza una operación que modifica un `String`, se crea un nuevo objeto `String` con el valor modificado, mientras que el objeto original permanece sin cambios. El tipo de datos `String` se llama alfanumérico, ya que puede contener letras, números y caracteres especiales. Los `String` se utilizan ampliamente en Java para representar texto y realizar operaciones de manipulación de cadenas.

Declaración de un String en Java:

```java
String mensaje = "Hola, mundo!"; // Declaración de un objeto String llamado mensaje con el valor "Hola, mundo!"
```

Como se había comentado, un objeto String es inmutable, es decir, su valor original no cambia. Por ejemplo, si concatenamos un String con otro, se crea un nuevo objeto String con el valor concatenado, mientras que el objeto original permanece sin cambios.

Ejemplo de inmutabilidad de los Strings en Java:

```java
package com.driagon;

public class InmutabilidadString {
    public static void main(String[] args) {
        String original = "Hola"; // Declaración de un objeto String llamado original con el valor "Hola"
        String concatenado = original + ", mundo!"; // Concatenación de original con ", mundo!" y asignación a un nuevo objeto String llamado concatenado
        
        System.out.println("Original: " + original); // Imprime el valor del objeto original
        System.out.println("Concatenado: " + concatenado); // Imprime el valor del objeto concatenado
    }
}
```

Java puede convertir números a su contraparte String automáticamente, y viceversa, utilizando métodos de la clase `String` y las clases envolventes correspondientes. Por ejemplo, podemos convertir un número entero a un String utilizando el método `String.valueOf()` o la concatenación con una cadena vacía. Para convertir un String a un número entero, podemos utilizar el método `Integer.parseInt()`.

Java también puede realizar el autoboxing al concatenar un número con un String. Por ejemplo, si concatenamos un número entero con un String, Java convierte automáticamente el número a su representación en cadena antes de realizar la concatenación.

Ejemplo de conversión entre números y Strings en Java:

```java
package com.driagon;

public class ConversionNumerosStrings {
    public static void main(String[] args) {
        int i = 42; // Declaración de un tipo de dato primitivo int
       int j = 10;
       
       String s = "" + (i + j); // Concatenación de i y j con una cadena vacía, lo que convierte automáticamente el resultado a un String
       System.out.println(s); // Imprime el resultado de la suma como un String
       
       s = "" + i + j; // Concatenación de i y j con una cadena vacía, lo que convierte automáticamente el resultado a un String
       System.out.println(s); // Imprime el valor de i y j como un String concatenado
    }
}
```

Ejemplo conversión de String a número y viceversa en Java:

```java
package com.driagon;

public class ConversionStringNumeros {
    public static void main(String[] args) {
        String s = "2020";
        
        int res = 0;
        for (int n = 0; n < s.length(); n++) {
            int digit = s.charAt(n) - '0';
            res = res * 10 + digit;
        }
        System.out.println(res); // Imprime el valor numérico convertido desde el String
    }
}
```

### La clase StringBuilder

La clase `StringBuilder` en Java es una clase mutable que se utiliza para crear y manipular cadenas de caracteres de manera eficiente. A diferencia de los objetos `String`, que son inmutables, los objetos `StringBuilder` permiten modificar el contenido de la cadena sin crear nuevos objetos, eds decir, son mutables. Esto hace que `StringBuilder` sea más eficiente en términos de rendimiento cuando se realizan múltiples operaciones de concatenación o modificación de cadenas.

El método que se utiliza para concatenar cadenas en `StringBuilder` es el método `append()`. Este método agrega el contenido especificado al final de la cadena existente en el objeto `StringBuilder`. Además, `StringBuilder` proporciona otros métodos útiles, como `insert()`, `delete()`, `replace()` y `reverse()`, que permiten realizar diversas operaciones de manipulación de cadenas de manera eficiente.

```java
package com.driagon;

public class StringBuilderTest {
    public static void main(String[] args) {
        String total = "10";
        String nombre = "Juan";
        String s = "El total es: " + total + " y el nombre es: " + nombre; // Concatenación de cadenas utilizando el operador +
        System.out.println(s); // Imprime el resultado de la concatenación de cadenas
       
        StringBuilder sb = new StringBuilder(); // Creación de un objeto StringBuilder vacío
        sb.append("El total es: "); // Agrega la cadena "El total es: " al objeto StringBuilder
        sb.append(total); // Agrega el valor de la variable total al objeto StringBuilder
        sb.append(" y el nombre es: "); // Agrega la cadena " y el nombre es: " al objeto StringBuilder
        sb.append(nombre); // Agrega el valor de la variable nombre al objeto StringBuilder
        System.out.println(sb.toString()); // Convierte el objeto StringBuilder a un String y lo imprime en la consola
    }
}
```

### La clase StringTokenizer y ejemplo: Lineas de texto con tamaño límite

La clase `StringTokenizer` en Java es una clase que se utiliza para dividir una cadena de texto en tokens o subcadenas basadas en un delimitador específico. Esta clase proporciona métodos para iterar sobre los tokens y obtener cada uno de ellos de manera individual. La clase `StringTokenizer` es útil cuando se necesita procesar cadenas de texto que contienen múltiples elementos separados por un delimitador, como espacios, comas o cualquier otro carácter.

Ejemplo, tenemos un String con datos numéricos separados por comas, y queremos dividirlo en tokens individuales utilizando la clase `StringTokenizer`. A continuación, se muestra un ejemplo de cómo hacerlo:

```java
package com.driagon;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String datos = "10,20,30,40,50"; // Cadena de texto con datos numéricos separados por comas
        StringTokenizer tokenizer = new StringTokenizer(datos, ","); // Crea un objeto StringTokenizer con el delimitador ","
        
        System.out.println("Tokens individuales:");
        while (tokenizer.hasMoreTokens()) { // Itera mientras haya más tokens disponibles
            String token = tokenizer.nextToken(); // Obtiene el siguiente token
            System.out.println(token); // Imprime el token en la consola
        }
    }
}
```