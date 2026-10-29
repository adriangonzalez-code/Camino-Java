# El Camino de Java

En este repositorio encontrarás una serie de ejemplos y explicaciones sobre los fundamentos del lenguaje de programación
Java. El objetivo es proporcionar una guía práctica para aprender y comprender los conceptos básicos de Java, desde la
sintaxis hasta las estructuras de control y las funciones.

## Fundamentos del Lenguaje

### Convenciones, primitivos, expresiones, precedencia de operadores

#### Convenciones utilizadas en Java

La convención más utilizada es siempre comenzar con mayúscula el nombre de una clase y con minúscula el nombre de un
método o variable. Por ejemplo, `MiClase` para una clase y `miMetodo()` para un método. A esta convención se le conoce
como **CamelCase**.

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

Un tipo de dato primitivo un tipo de dato mas básico de Java, es un tipo de dato que no es un objeto y que representa un
valor simple. En Java, los tipos de datos primitivos son:

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

Como puedes obervar, los tipos de datos primitivos están escritos en minúscula y representan valores simples como
números, caracteres y valores booleanos. Estos tipos de datos son fundamentales para la programación en Java y se
utilizan ampliamente en la creación de variables y estructuras de control.

#### Expresiones y Operadores

Las expresiones y operadores nos permiten modificar el contenido de una variable, realizar cálculos y tomar decisiones
en nuestro código. En Java, los operadores se dividen en varias categorías, como operadores aritméticos, operadores de
comparación, operadores lógicos y operadores de asignación.

Los operadores son símbolos que nos permiten realizar operaciones sobre uno o más operandos. Por ejemplo, el operador
`+` nos permite sumar dos números, mientras que el operador `==` nos permite comparar si dos valores son iguales.

Uno o mas operadores forman lo que se conoce como una expresión. Una expresión es una combinación de operadores y
operandos que produce un valor. Por ejemplo, la expresión `2 + 3` produce el valor `5`.

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

Podemos observar que la multiplicación tiene una mayor precedencia que la suma, por lo que se realiza primero. Si
quisiéramos cambiar el orden de evaluación, podríamos utilizar paréntesis para forzar la evaluación de la suma primero:

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

Los operadores de asignación se evalúan de derecha a izquierda, lo que significa que el valor de la expresión de la
derecha se asigna a la variable de la izquierda. Por ejemplo, en la expresión `a = b = c`, primero se evalúa `b = c`, y
luego el resultado se asigna a `a`.

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

Los operadores de asignación son una forma abreviada de asignar valores a las variables. En lugar de escribir
`a = a + b`, podemos escribir `a += b`. Esto es útil para simplificar el código y hacerlo más legible.

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

Los operadores aritméticos nos permiten realizar operaciones matemáticas básicas como suma, resta, multiplicación,
división y módulo. Los operadores aritméticos en Java son:

| Operador | Descripción    |
|----------|----------------|
| `+`      | Suma           |
| `-`      | Resta          |
| `*`      | Multiplicación |
| `/`      | División       |
| `%`      | Módulo         |

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

Los operadores unitarios son aquellos que operan sobre un solo operando. En Java, los operadores unitarios incluyen el
operador de negación lógica (`!`), el operador de negación aritmética (`-`), y los operadores de incremento y decremento
(`++` y `--`).

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

Los operadores lógicos nos permiten combinar expresiones booleanas y tomar decisiones en nuestro código. En Java, los
operadores lógicos incluyen el operador AND lógico (`&&`), el operador OR lógico (`||`), y el operador NOT lógico (`!`).

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

Los operadores lógicos binarios son aquellos que operan sobre dos operandos y devuelven un resultado booleano. En Java,
los operadores lógicos binarios incluyen el operador AND bit a bit (`&`), el operador OR bit a bit (`|`), y el operador
XOR bit a bit (`^`).

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

El complemento a 2 es una representación de números enteros en binario que permite realizar operaciones aritméticas de
manera más sencilla, especialmente la resta. En esta representación, el bit más significativo (MSB) indica el signo del
número: 0 para números positivos y 1 para números negativos.

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

El corrimiento de bits es una operación que desplaza los bits de un número binario hacia la izquierda o hacia la
derecha. En Java, existen tres operadores de corrimiento de bits:

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

Una sentencia es una instrucción que realiza una acción en el programa. En Java, las sentencias se dividen en varias
categorías, como sentencias de control de flujo, sentencias de declaración y sentencias de expresión. Existen difentes
formas de escribir sentencias en Java, pero todas ellas deben terminar con un punto y coma (`;`). A continuación, se
presentan algunos ejemplos de sentencias en Java:

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

Una función es un conjunto de instrucciones que realiza una tarea específica y puede devolver un valor, y puede ser
ejecutado varias veces y en otras partes de un programa. En Java, las funciones se definen dentro de una clase y se
conocen como métodos. Un método puede tener parámetros de entrada y un valor de retorno.

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

En la definición del lenguaje Java, se habla de parámetros formales y parámetros actuales. Los parámetros formales son
los que se definen en la declaración del método, mientras que los parámetros actuales son los que se pasan al llamar al
método. En el ejemplo anterior, `int a` y `int b` son parámetros formales, mientras que `5` y `10` son parámetros
actuales.

A los parámetros formales se les puede llamar también **parámetros**, mientras que a los parámetros actuales se les
puede llamar **argumentos**.

El nombre de parámetro definido en un método, no tiene nada que ver con el nombre de una variable que pudieras haber
definido en otra parte del programa. Por ejemplo, en el siguiente código, el parámetro `a` del método `sumar` no tiene
nada que ver con la variable `a` definida en el método `main`.

La palabra return se utiliza para devolver un valor desde un método. Cuando se ejecuta una sentencia return, el control
del programa vuelve al punto donde se llamó al método, y el valor devuelto puede ser utilizado en ese punto.

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

Un arreglo es una secuencia de variables del mismo tipo que se almacenan en memoria de manera contigua y se acceden
mediante un índice. En Java, los arreglos son objetos que pueden contener elementos de cualquier tipo de dato,
incluyendo tipos primitivos y objetos.

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

No es posible usar un indice mas allá del tamaño del arreglo, ya que esto generará un error de ejecución llamado
`ArrayIndexOutOfBoundsException`. Por ejemplo, si intentamos acceder al índice 5 del arreglo `numeros` declarado
anteriormente, obtendremos un error, ya que el arreglo tiene un tamaño de 5 y los índices válidos son del 0 al 4.

```java
// Ejemplo de error de índice fuera de límites en Java
public class ErrorIndice {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[] numeros = {1, 2, 3, 4, 5}; // Declaración de un arreglo de enteros llamado numeros y asignación de valores
        System.out.println("El sexto número es: " + numeros[5]); // Intento de acceder al índice 5 del arreglo, lo que generará un error de ejecución
    } // Fin del método principal
}
```

Como puedes observar, el indice inicia en 0 y termina en n-1, donde n es el tamaño del arreglo. Por lo tanto, si un
arreglo tiene 5 elementos, los índices válidos son 0, 1, 2, 3 y 4. Intentar acceder a un índice fuera de este rango
generará un error de ejecución.

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

Con el método `length` podemos obtener el tamaño del arreglo, lo que nos permite calcular el promedio de manera más
flexible, sin necesidad de conocer el tamaño del arreglo de antemano. Esto es especialmente útil cuando trabajamos con
arreglos de tamaño variable.

#### Arreglos multidimensionales

Un arreglo multidimensional es un arreglo que contiene otros arreglos como elementos. En Java, los arreglos
multidimensionales se pueden declarar utilizando múltiples corchetes `[]`. Por ejemplo, un arreglo bidimensional se
puede declarar como `int[][] matriz`.

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

Como Java trata a los arreglos multidimensionales como arreglos de arreglos, es posible tener filas de diferentes
tamaños. Esto significa que no todas las filas de un arreglo bidimensional tienen que tener el mismo número de columnas.
Por ejemplo, podemos declarar un arreglo bidimensional con filas de diferentes longitudes:

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

Java cuenta con una clase llamada System, dentro de esta clase se encuentran muchos métodos y variables útiles. Uno de
estos métodos es `arraycopy()`, que nos permite copiar elementos de un arreglo a otro de manera eficiente. La sintaxis
del método es la siguiente:

```java
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length); // Copia elementos de un arreglo a otro, los argumentos son: src (arreglo de origen), srcPos (posición inicial en el arreglo de origen), dest (arreglo de destino), destPos (posición inicial en el arreglo de destino) y length (número de elementos a copiar).
```

### Ciclo For, for mejorado

#### Ciclo For

El ciclo `for` es una estructura de control que nos permite repetir un bloque de código un número determinado de veces.
La sintaxis básica del ciclo `for` es la siguiente:

```java
for(inicialización;condición;actualización){
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

A partir de Java 5, se introdujo el ciclo `for` mejorado, también conocido como "for-each". Este ciclo nos permite
recorrer los elementos de un arreglo o una colección de manera más sencilla y legible. La sintaxis básica del ciclo
`for` mejorado es la siguiente:

```java
for(tipo variable :arreglo){
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

La sintaxis del ciclo `for` es muy flexible y nos permite omitir cualquiera de sus tres partes: inicialización,
condición y actualización. Sin embargo, debemos tener cuidado al omitir la condición, ya que esto puede llevar a un
bucle infinito si no se maneja correctamente.

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

La sobrecarga de métodos (method overloading) es una característica de Java que nos permite definir múltiples métodos
con el mismo nombre siempre y cuando el tipo de datos de sus parámetros o el número de parámetros sean diferentes. Esto
nos permite crear métodos que realizan la misma operación pero con diferentes tipos o cantidades de datos.

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

Técnicamente hablando, se podría decir que el identificador de una función es el nombre de la función junto con el tipo
y número de sus parámetros. Esto significa que dos funciones pueden tener el mismo nombre siempre y cuando tengan
diferentes tipos o cantidades de parámetros, lo que permite la sobrecarga de métodos en Java.

Java cuenta con una clase que contiene métodos sobrecargados, es la clase System, que contiene métodos como `println()`,
que puede recibir diferentes tipos de datos como argumentos, incluyendo enteros, decimales, cadenas de texto y objetos.
Esto nos permite imprimir diferentes tipos de datos en la consola utilizando el mismo método `println()`.

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

El ciclo `while` es una estructura de control que nos permite repetir un bloque de código mientras se cumpla una
condición determinada. La sintaxis básica del ciclo `while` es la siguiente:

```java
while(condición){
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

El ciclo `do-while` es similar al ciclo `while`, pero la diferencia principal es que el bloque de código se ejecuta al
menos una vez antes de evaluar la condición. La sintaxis básica del ciclo `do-while` es la siguiente:

```java
do{
        // Bloque de código a repetir
        }while(condición);
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

Los bloques son secciones de código delimitadas por llaves `{}` que agrupan varias sentencias. Los bloques se utilizan
para definir el alcance de las variables y para organizar el código en estructuras de control como ciclos y
condicionales. Un bloque puede contener declaraciones de variables, sentencias y otros bloques anidados.

En Java, los bloques se utilizan en diferentes contextos, como en métodos, ciclos, condicionales y clases. Por ejemplo,
un bloque dentro de un método puede contener varias sentencias que se ejecutan secuencialmente. De hecho, las
condiciones y ciclos pueden no usar llaves si solo contienen una sentencia, pero es recomendable usarlas para mejorar la
legibilidad del código y evitar errores al agregar más sentencias en el futuro.

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

Las condiciones son una parte del lenguaje de programación que nos permiten tomar decisiones en nuestro código. En Java,
las condiciones se expresan mediante expresiones booleanas que pueden ser verdaderas (`true`) o falsas (`false`). Las
condiciones se utilizan en estructuras de control como `if`, `else if`, `else` y `switch`.

#### Condicional if

El condicional `if` nos permite ejecutar un bloque de código si se cumple una condición determinada. La sintaxis básica
del condicional `if` es la siguiente:

```java
if(condición){
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

El condicional `if-else` nos permite ejecutar un bloque de código si se cumple una condición y otro bloque de código si
no se cumple. La sintaxis básica del condicional `if-else` es la siguiente:

```java
if(condición){
        // Bloque de código a ejecutar si la condición es verdadera
        }else{
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

El condicional `if-else-if` nos permite evaluar múltiples condiciones de manera secuencial. Si la primera condición es
falsa, se evalúa la siguiente, y así sucesivamente, hasta que se encuentre una condición verdadera o se llegue al bloque
`else`. La sintaxis básica del condicional `if-else-if` es la siguiente:

```java
if(condición1){
        // Bloque de código a ejecutar si la condición1 es verdadera
        }else if(condición2){
        // Bloque de código a ejecutar si la condición2 es verdadera
        }else{
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

En el ejemplo anterior, podemos observar que se cumplen varias condiciones, pero Java ejecuta únicamente el bloque de
código correspondiente a la primera condición verdadera que encuentra. En este caso, como la calificación es 85, se
imprime "Bueno" y no se evalúan las condiciones siguientes. Esto demuestra cómo funciona la estructura `if-else-if` para
tomar decisiones basadas en múltiples criterios.

#### El operador condicional `? :`

El operador condicional `? :`, también conocido como operador ternario, es una forma concisa de escribir una expresión
condicional en Java. Este operador evalúa una condición y devuelve un valor si la condición es verdadera y otro valor si
la condición es falsa. La sintaxis básica del operador condicional es la siguiente:

```java
// Ejemplo del operador en su forma if-else
if(condición){
valor1; // Valor si la condición es verdadera
}else{
valor2; // Valor si la condición es falsa
}

// Equivalente con operador condicional ? :
condición ?valor1 :valor2; // Devuelve valor1 si la condición es verdadera
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

Ejemplo de una función que devuelve el número mayor entre 3 números utilizando el tradicional `if-else` y el operador
condicional `? :`:

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

Ninguno de los ciclos o bucles que ya conocemos (for, while, do-while) necesita ejecutarse de principio a fin, porque
hay situaciones en las que necesitamos interrumpir la ejecución de un ciclo antes de que termine, o saltar a la
siguiente iteración del ciclo sin ejecutar el resto del bloque de código. Para esto, Java nos proporciona las sentencias
`break` y `continue`.

La sentencia `break` se utiliza para salir de un ciclo o bucle antes de que se cumpla la condición de finalización.
Cuando se ejecuta una sentencia `break`, el control del programa salta inmediatamente fuera del ciclo, y la ejecución
continúa con la siguiente instrucción después del ciclo. La sentencia `continue`, por otro lado, se utiliza para saltar
a la siguiente iteración del ciclo sin ejecutar el resto del bloque de código dentro del ciclo. Cuando se ejecuta una
sentencia `continue`, el control del programa salta inmediatamente a la siguiente iteración del ciclo, evaluando
nuevamente la condición de repetición.

Ejemplo de uso de la sentencia `continue` para calcular el promedio de un arreglo de números, ignorando los números
negativos:

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

Java permite el uso de etiquetas (labels) con las sentencias `break` y `continue`, lo que nos permite salir de o
continuar con un ciclo específico en caso de tener ciclos anidados. Una etiqueta es un identificador seguido de dos
puntos (`:`) que se coloca antes de un ciclo o bloque de código. Cuando se utiliza una sentencia `break` o `continue`
con una etiqueta, el control del programa salta al ciclo o bloque de código etiquetado. Esto es útil cuando tenemos
ciclos anidados y queremos salir de un ciclo externo o continuar con un ciclo externo desde un ciclo interno.

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
        buscar:
        // Etiqueta para el ciclo externo
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

Para el caso del uso de etiquetas con la sentencia `continue`, podemos utilizar un ejemplo similar al anterior, pero en
lugar de salir del ciclo externo, continuaremos con la siguiente iteración del ciclo externo desde el ciclo interno.

```java
// Ejemplo de uso de etiquetas con la sentencia continue en Java
public class ContinueConEtiqueta {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        int[][] matriz = { // Declaración de un arreglo bidimensional llamado matriz y asignación de valores
                {1, 2, 3}, // Primera fila
                {4, 5, 6}, // Segunda fila
                {7, 8, 9}  // Tercera fila
        };
        buscar:
        // Etiqueta para el ciclo externo
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

La sentencia `switch` es una estructura de control que nos permite ejecutar diferentes bloques de código según el valor
de una expresión. La sintaxis básica de la sentencia `switch` es la siguiente:

```java
switch(expresión){
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

La sentencia `break` es opcional en cada caso del `switch`, pero es recomendable utilizarla para evitar que la ejecución
continúe en los casos siguientes, lo que se conoce como "fall-through". Si no se incluye la sentencia `break`, el
programa continuará ejecutando los bloques de código de los casos siguientes hasta encontrar un `break` o llegar al
final del `switch`.

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

Una clase es una combinación de variables y métodos que representan un concepto o entidad en el mundo real. En Java, una
clase es una plantilla o un modelo que define las propiedades (atributos) y comportamientos (métodos) de un objeto. Un
objeto es una instancia de una clase, que representa una entidad concreta con sus propios valores para los atributos
definidos en la clase. La creación de objetos a partir de clases nos permite organizar y estructurar nuestro código de
manera más eficiente, facilitando la reutilización y el mantenimiento del mismo.

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

En Java, las variables de objetos no almacenan directamente los datos del objeto, sino que almacenan una referencia (o
dirección de memoria) al objeto en el heap. Esto significa que cuando creamos un objeto y lo asignamos a una variable,
la variable contiene una referencia al objeto, y no el objeto en sí. Por lo tanto, si asignamos una variable de objeto a
otra variable, ambas variables apuntarán al mismo objeto en memoria.

Cuando declaramos una variable de tipo primitiva sin inicializarla, Java asigna un valor predeterminado a esa variable.
Por ejemplo, para los tipos primitivos numéricos (como `int`, `double`, etc.), el valor predeterminado es `0`. Para los
tipos booleanos, el valor predeterminado es `false`. Sin embargo, para las variables de tipo objeto, el valor
predeterminado es `null`, lo que indica que la variable no apunta a ningún objeto en memoria.

Un claro ejemplo es crear un objeto de la clase `Average` y asignarlo a una variable, posteriormente crear un objeto de
la clase `Average` y asignarle la referencia del primer objeto. Si modificamos el primer objeto, los cambios se
reflejarán en el segundo objeto, ya que ambos apuntan al mismo objeto en memoria.

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

La palabra reservada `null` en Java se utiliza para indicar que una variable de tipo objeto no apunta a ningún objeto en
memoria. Cuando una variable de tipo objeto se inicializa con `null`, significa que no tiene una referencia válida a un
objeto, y cualquier intento de acceder a sus métodos o atributos resultará en un error de tiempo de ejecución conocido
como `NullPointerException`.

### Cómo borrar objetos en memoria, variables mutables e inmutables, this.

#### ¿Cómo se libera la memoria usada por los objetos?

En Java, la memoria utilizada por los objetos se libera automáticamente mediante un proceso llamado recolección de
basura (garbage collection). El recolector de basura es un mecanismo que se encarga de identificar y eliminar los
objetos que ya no son accesibles o referenciados por ninguna variable en el programa. Cuando un objeto ya no tiene
referencias válidas, el recolector de basura lo marca para su eliminación y libera la memoria asociada a ese objeto.

Java es lo suficientemente inteligente para determinar cuándo un objeto ya no es necesario y puede ser eliminado, lo que
ayuda a prevenir fugas de memoria y optimizar el uso de recursos. Sin embargo, es importante tener en cuenta que la
recolección de basura no garantiza una liberación inmediata de la memoria, ya que el recolector de basura se ejecuta en
segundo plano y su comportamiento puede variar según la implementación de la máquina virtual de Java (JVM).

#### Variables mutables e inmutables

En Java, las variables mutables son aquellas cuyo valor puede cambiar después de haber sido inicializadas. Por ejemplo,
los tipos primitivos como `int`, `double` y `boolean` son mutables, ya que podemos asignarles nuevos valores en
cualquier momento. Además, los objetos de clases como `ArrayList` y `HashMap` también son mutables, ya que podemos
modificar su contenido agregando, eliminando o cambiando elementos.

Por otro lado, las variables inmutables son aquellas cuyo valor no puede cambiar después de haber sido inicializadas. Un
ejemplo común de variables inmutables en Java son los objetos de la clase `String`. Una vez que se crea un objeto
`String`, su valor no puede modificarse. Si intentamos cambiar el contenido de un `String`, en realidad estamos creando
un nuevo objeto `String` con el nuevo valor, mientras que el objeto original permanece sin cambios.

La inmutabilidad de una variable sirve para garantizar que su valor no se modifique accidentalmente, lo que puede ser
útil en situaciones donde se requiere consistencia y seguridad en el manejo de datos. Además, las variables inmutables
pueden mejorar el rendimiento y la eficiencia del programa, ya que permiten compartir referencias a objetos sin
preocuparse por cambios inesperados en su estado.

En situaciones concurrentes o donde se utilicen múltiples hilos de ejecución, las variables inmutables son especialmente
valiosas, ya que no requieren sincronización adicional para garantizar la consistencia de los datos. Esto se debe a que,
al ser inmutables, no pueden ser modificadas por otros hilos, lo que reduce el riesgo de condiciones de carrera y
errores relacionados con la concurrencia.

#### El identificador `this`

El identificador `this` en Java es una referencia al objeto actual dentro de una clase. Se utiliza para acceder a los
atributos y métodos del objeto en el que se encuentra el código. El uso de `this` es especialmente útil cuando hay
ambigüedad entre los nombres de los parámetros de un método y los nombres de los atributos de la clase.

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

Las excepciones son un mecanismo en Java creado para poder manejar errores y situaciones inesperadas que pueden ocurrir
durante la ejecución de un programa. Una excepción es un evento que interrumpe el flujo normal de ejecución del programa
y puede ser causada por diversos factores, como errores de programación, problemas de entrada/salida, errores de red,
entre otros. Cuando ocurre una excepción, el programa genera un objeto de excepción que contiene información sobre el
error, como el tipo de excepción, un mensaje descriptivo y, en algunos casos, la pila de llamadas (stack trace) que
muestra el camino que llevó al error.

El mecanismo de una excepción funciona de la siguiente manera: cuando un método detecta un error al momento de realizar
alguna acción, genera un objeto especial de clase Exception y lo reporta a Java, el cual a su ves intentará encontrar un
código que pueda manejar la excepción. Si no se encuentra un código adecuado para manejar la excepción, el programa se
detendrá y mostrará un mensaje de error en la consola.

Para que un programa pueda manejar excepciones, se utilizan bloques de código especiales llamados `try` y `catch`. El
bloque `try` contiene el código que puede generar una excepción, mientras que el bloque `catch` contiene el código que
maneja la excepción si ocurre. Finalmente, el programa puede incluir un bloque llamado `finally`, que contiene código
que está garantizado que se ejecute, haya o no haya existido un error. La sintaxis básica para manejar excepciones en
Java es la siguiente:

```java
try{
        // Código que puede generar una excepción
        }catch(TipoDeExcepcion e){
        // Código para manejar la excepción
        }finally{
        // Código que se ejecuta siempre, haya o no habido una excepción
        }
```

Todas las execpiones que un programa puede arrojar son objetos derivados de la clase `Throwable`, que es la clase base
para todas las excepciones y errores en Java. La clase `Throwable` tiene dos subclases principales: `Exception` y
`Error`. La clase `Exception` representa condiciones que un programa puede manejar, mientras que la clase `Error`
representa problemas graves que generalmente no pueden ser manejados por el programa.

Las excepciones se pueden clasificar en dos categorías principales: excepciones verificadas (checked exceptions) y
excepciones no verificadas (unchecked exceptions). Las excepciones verificadas son aquellas que derivan de `Exeption` y
que el compilador obliga a manejar, ya sea mediante un bloque `try-catch` o declarando la excepción en la firma del
método con la palabra clave `throws`. Por otro lado, las excepciones no verificadas son aquellas que no requieren ser
manejadas explícitamente, como las excepciones de tiempo de ejecución (RuntimeException) y sus subclases.

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

Para explicar mejor la funcionalidad del bloque `finally`, podemos utilizar un ejemplo práctico que simule la apertura y
cierre de un archivo. Suponiendo que existen 3 métodos, uno para abrir un archivo, otro para leerlo y otro para
cerrarlo, podemos estructurar el código de la siguiente manera:

```java
try{
abrirArchivo(); // Intento de abrir el archivo

leerArchivo(); // Intento de leer el archivo

cerrarArchivo(); // Cierre del archivo, garantizado que se ejecute siempre
}catch(
IOException e){ // Captura de la excepción IOException
        System.out.

println("Se produjo un error al abrir o leer el archivo: "+e.getMessage()); // Manejo de la excepción y mensaje de error
        }
```

Si se llegara a presentar alguna excepción durante la apertura o lectura del archivo, el bloque `catch` se ejecutará
para manejar la excepción y mostrar un mensaje de error. Pero el método `cerrarArchivo()` no se ejecutará, ya que el
flujo del programa se interrumpirá al entrar al bloque `catch`. Para garantizar que el archivo se cierre correctamente,
podemos utilizar un bloque `finally` de la siguiente manera:

```java
try{
abrirArchivo(); // Intento de abrir el archivo

leerArchivo(); // Intento de leer el archivo
}catch(
IOException e){ // Captura de la excepción IOException
        System.out.

println("Se produjo un error al abrir o leer el archivo: "+e.getMessage()); // Manejo de la excepción y mensaje de error
        }finally{

cerrarArchivo(); // Cierre del archivo, garantizado que se ejecute siempre, no importa si hubo una excepción o no
}
```

#### Uso de `throw` y `throws`

La palabra clave `throw` en Java se utiliza para lanzar una excepción de manera explícita dentro de un método o bloque
de código. Cuando se utiliza `throw`, se crea un objeto de excepción y se lanza, lo que interrumpe el flujo normal del
programa y transfiere el control a un bloque `catch` correspondiente, si existe. La sintaxis básica para utilizar
`throw` es la siguiente:

```java
throw new TipoDeExcepcion("Mensaje de error"); // Lanza una nueva excepción del tipo especificado con un mensaje de error
```

Por otro lado, la palabra clave `throws` se utiliza en la declaración de un método para indicar que el método puede
lanzar una o más excepciones durante su ejecución. Esto permite que el método informe a los llamadores que deben manejar
esas excepciones, ya sea mediante un bloque `try-catch` o propagando la excepción hacia arriba en la cadena de llamadas.
La sintaxis básica para utilizar `throws` es la siguiente:

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

Un bloque `try` puede manejar múltiples tipos de excepciones utilizando varios bloques `catch`. Cada bloque `catch` se
encarga de capturar un tipo específico de excepción, lo que permite manejar diferentes errores de manera
individualizada. Las excepciones más generales deben ser capturadas después de las excepciones más específicas, ya que
si se colocan primero, las excepciones más específicas nunca serán alcanzadas. Esto se debe a que la jerarquía de
excepciones en Java permite que una excepción más general capture también las excepciones más específicas que heredan de
ella.

La sintaxis básica para utilizar múltiples bloques `catch` es la siguiente:

```java
try{
        // Código que puede generar una excepción
        }catch(IOException e){
        // Código para manejar la excepción TipoDeExcepcion1
        }catch(
NullPointerException e){
        // Código para manejar la excepción TipoDeExcepcion2
        }catch(
Exception e){
        // Código para manejar la excepción TipoDeExcepcion3
        }
```

### Métodos y campos estáticos, variables finales

#### Métodos y campos estáticos

En Java, los métodos y campos estáticos pertenecen a la clase en sí misma, en lugar de a una instancia específica de la
clase. Esto significa que se pueden acceder a ellos sin necesidad de crear un objeto de la clase. Los métodos y campos
estáticos se declaran utilizando la palabra clave `static`.

Un ejemplo de campos y métodos estáticos es la clase `Math` de Java, que proporciona métodos para realizar operaciones
matemáticas comunes, como el cálculo de raíces cuadradas, potencias y funciones trigonométricas. Los métodos de la clase
`Math` son estáticos, lo que permite llamarlos directamente desde la clase sin necesidad de crear un objeto.

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

Las variables finales son aquellas cuyo valor inicial nunca cambia después de haber sido asignado. En Java, se utiliza
la palabra clave `final` para declarar una variable como final. Una vez que se le asigna un valor a una variable final,
no se puede modificar ni reasignar. Esto es útil para definir constantes o valores que deben permanecer inalterables a
lo largo del programa.

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

Todos los programas necesitan valores que no cambian durante la ejecución del programa, como el valor de PI, la
velocidad de la luz o el número de días en una semana. En Java, podemos definir constantes utilizando la palabra clave
`final`, lo que indica que el valor de la variable no puede cambiar después de haber sido asignado. Además, es común
utilizar la convención de nombrar las constantes en mayúsculas para diferenciarlas de las variables normales.

En Java no existe una palabra clave específica para declarar constantes, pero podemos combinar `final` con `static` para
crear constantes de clase que sean compartidas por todas las instancias de la clase. Esto es útil cuando queremos
definir valores que son universales y no dependen de un objeto específico.

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

Un ejemplo de las ventajas de usar constantes es cuando evaluamos el valor de una constante en una condicional
`if-else`. Por ejemplo:

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

Aunque incialmente nuestro código se ve de esa manera, el compilador de Java elimina el bloque donde se cumpla la
condición y el código se ve de la siguiente manera:

```java
public static final int EDAD_MINIMA = 18;
System.out.

println("Eres mayor de edad."); // Imprime un mensaje indicando que la persona es mayor de edad
```

#### Control de acceso a los miembros de una clase

En Java, el control de acceso a los miembros de una clase se refiere a la capacidad de restringir o permitir el acceso a
los atributos y métodos de una clase desde otras clases o paquetes. Esto se logra mediante el uso de modificadores de
acceso, que determinan la visibilidad y accesibilidad de los miembros de la clase. Los modificadores de acceso más
comunes en Java son:

- `public`: Los miembros declarados como `public` son accesibles desde cualquier clase o paquete. No hay restricciones
  de acceso, lo que significa que cualquier código puede acceder a ellos.
- `private`: Los miembros declarados como `private` son accesibles únicamente dentro de la misma clase. No pueden ser
  accedidos desde otras clases, incluso si están en el mismo paquete. Esto proporciona encapsulamiento y protege los
  datos internos de la clase.
- `protected`: Los miembros declarados como `protected` son accesibles dentro de la misma clase, en subclases (clases
  que heredan de la clase) y en clases del mismo paquete. Esto permite un nivel de acceso intermedio entre `public` y
  `private`.
- `default` (sin modificador): Si no se especifica ningún modificador de acceso, los miembros tienen un acceso por
  defecto, lo que significa que son accesibles únicamente dentro del mismo paquete.

#### Constructores

Los constructores son métodos especiales en Java que se utilizan para inicializar objetos de una clase. Se llaman
automáticamente cuando se crea un objeto y tienen el mismo nombre que la clase. Los constructores no tienen un tipo de
retorno, ni siquiera `void`, y pueden aceptar parámetros para permitir la inicialización de los atributos del objeto con
valores específicos.

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

Los tipos Enum (enumeraciones) en Java son un tipo de dato especial que permite definir un conjunto de constantes con
nombre. Cada constante en un Enum es una instancia de la clase Enum y puede tener propiedades y métodos asociados. Los
Enums se utilizan para representar un conjunto fijo de valores posibles, lo que mejora la legibilidad del código y
reduce la posibilidad de errores al utilizar valores literales.

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

Los programas de Java son en realidad un conjunto de clases que interactúan entre sí para producir el resultado deseado.
El código fuente de una clase es un archivo de texto con extensión `.java`, que contiene la definición de la clase y sus
miembros (atributos y métodos). Este código fuente es compilado por el compilador de Java (`javac`) para generar un
archivo de bytecode con extensión `.class`, que puede ser ejecutado por la máquina virtual de Java (JVM).

Uitlizando Notepad++ o cualquier editor de texto, podemos crear un archivo con extensión `.java` y escribir el código
fuente de nuestra clase. Por ejemplo, podemos crear un archivo llamado `MiClase.java` con el siguiente contenido:

```java
public class MiClase { // Declaración de la clase MiClase con el modificador de acceso public usando la convención de nombrar las clases con la primera letra en mayúscula, y si son compuestas, la primera letra de cada palabra en mayúscula
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa, este método es estático y público, lo que significa que puede ser llamado sin crear una instancia de la clase y es accesible desde cualquier lugar. Este método es buscado por la JVM como punto de entrada del programa.
        System.out.println("Hola, mundo!"); // Imprime el mensaje "Hola, mundo!" en la consola
    } // Fin del método principal
} // Fin de la clase MiClase
```

**Nota:** Es importante que el nombre del archivo coincida exactamente con el nombre de la clase pública que contiene,
incluyendo mayúsculas y minúsculas. En este caso, el archivo debe llamarse `MiClase.java` porque la clase pública se
llama `MiClase`. De igual manera, si el editor te lo permite, asegúrate de guardar el archivo con codificación UTF-8
para evitar problemas con caracteres especiales.

Guarda el archivo con extensión `.java` y luego compílalo utilizando el compilador de Java (`javac`) desde la línea de
comandos. Aseguráte de encontrarte en el directorio donde guardaste el archivo `MiClase.java` en la terminal y ejecuta
el siguiente comando:

```batch
C:\myPath>javac MiClase.java
```

```mac
$ javac MiClase.java
```

Si la compilación es exitosa, se generará un archivo llamado `MiClase.class` en el mismo directorio. Este archivo
contiene el bytecode que puede ser ejecutado por la JVM.

Para ejecutar el programa, utiliza el comando `java` seguido del nombre de la clase (sin la extensión `.class`):

```batch
C:\myPath>java MiClase
```

```mac
$ java MiClase
```

**Nota:** Asegúrate de encontrarte en el directorio donde se encuentran los archivos `.java` y `.class` desde tu
terminal, ya que de lo contrario, la JVM no podrá encontrar la clase y se producirá un error de ejecución, para ello
debes utilizar el comando `cd` para cambiar al directorio correcto antes de ejecutar el programa.

### Ejercicio de dibujo de árbol de Navidad

El siguiente ejercicio consiste en dibujar un árbol de Navidad utilizando caracteres en la consola. El árbol tendrá una
altura determinada estará compuesto por asteriscos (`*`) para representar las ramas y un tronco representado por el
carácter `| |`. La salida del programa será un árbol de Navidad simétrico y centrado en la consola.

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

Un comentario es cualquier texto que se escribe en el programa y funciona como ayuda para que otros programadores (o uno
mismo en el futuro) puedan entender mejor el código. Los comentarios no son ejecutados por la máquina virtual de Java
(JVM) y no afectan el funcionamiento del programa. En Java, existen tres tipos principales de comentarios:

1. **Comentarios de una sola línea**: Se utilizan para agregar comentarios breves en una sola línea. Se escriben
   utilizando dos barras diagonales (`//`). Todo el texto después de `//` en esa línea se considera un comentario y no
   se ejecutará.

   ```java
   // Este es un comentario de una sola línea
   int x = 5; // Esto también es un comentario
   ```

2. **Comentarios de varias líneas**: Se utilizan para agregar comentarios que abarcan varias líneas. Se escriben
   utilizando `/*` al inicio del comentario y `*/` al final. Todo el texto entre estos delimitadores se considera un
   comentario y no se ejecutará.

   ```java
   /* Este es un comentario de varias líneas
      que puede abarcar varias líneas de texto.
      Es útil para explicar secciones más grandes de código. */
   int y = 10; /* Esto también es un comentario de varias líneas */
   ```

3. **Comentarios de documentación (Javadoc)**: Se utilizan para generar documentación automática del código fuente. Se
   escriben utilizando `/**` al inicio del comentario y `*/` al final. Los comentarios de Javadoc se colocan
   generalmente antes de la declaración de clases, métodos o atributos, y pueden incluir etiquetas especiales para
   describir parámetros, valores de retorno y excepciones.

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

La máquina virtual de Java (JVM) es un componente fundamental del entorno de ejecución de Java que permite ejecutar
programas escritos en el lenguaje de programación Java. La JVM actúa como una capa de abstracción entre el código Java y
el sistema operativo subyacente, lo que permite que los programas Java sean portátiles y puedan ejecutarse en diferentes
plataformas sin necesidad de modificaciones.

Java funciona bajo el concepto de compatilidad universal, también conocido como "write once, run anywhere" (WORA), lo
que significa que el mismo código Java puede ejecutarse en diferentes sistemas operativos y arquitecturas de hardware
sin cambios. Esto se logra mediante la compilación del código fuente Java en un formato intermedio llamado bytecode, que
es independiente de la plataforma. El bytecode es interpretado y ejecutado por la JVM, que traduce las instrucciones del
bytecode en instrucciones específicas del sistema operativo y hardware en tiempo de ejecución.

Podríamos pensar que un programa en Java, al ser compilado y posteriormente interpretado por la JVM, sería más lento que
un programa escrito en un lenguaje compilado directamente a código máquina, como C o C++. Sin embargo, la JVM utiliza
técnicas de optimización y compilación just-in-time (JIT) para mejorar el rendimiento de los programas Java. La
compilación JIT traduce partes del bytecode en código máquina nativo en tiempo de ejecución, lo que permite que el
programa se ejecute más rápido después de la primera ejecución. De hecho, en muchos casos, los programas Java pueden
alcanzar un rendimiento comparable o mejor al de los programas escritos en lenguajes compilados directamente a código
máquina como C o C++.

### El classpath y package

El classpath es un indicador que le dije a Java dónde buscar las clases y paquetes necesarios para ejecutar un programa.
Es una lista de directorios y archivos JAR que contienen las clases y recursos que el programa necesita para funcionar
correctamente. El classpath puede configurarse mediante la variable de entorno `CLASSPATH` o mediante la opción `-cp` o
`-classpath` al ejecutar el comando `java` o `javac`.

Todos los programas se rigen bajo las reglas del classpath, y si no se encuentra una clase o paquete necesario para
ejecutar el programa, se producirá un error de ejecución. Por ejemplo, si intentamos ejecutar un programa que utiliza
una clase que no está en el classpath, obtendremos un error como "ClassNotFoundException" o "NoClassDefFoundError".

Hoy en día, existen editores de Java muy poderosos que nos permiten crear proyectos de Java y manejar el classpath de
manera automática, como Eclipse, NetBeans o IntelliJ IDEA, pero entre todo ese poder ocultan los detalles de cómo
funciona el classpath y los paquetes, por lo que es importante entender estos conceptos para poder trabajar con Java de
manera efectiva.

Es importante tener en cuenta que el classpath no solo afecta la ejecución de los programas, sino también la compilación
de los mismos. Si una clase o paquete necesario para compilar un programa no está en el classpath, obtendremos un error
de compilación. Por lo tanto, es importante asegurarse de que el classpath esté configurado correctamente tanto para la
compilación como para la ejecución de los programas.

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

En este ejemplo, el proyecto tiene un directorio `src` que contiene el código fuente de la clase `MiClase` dentro del
paquete `com.ejemplo`, y un directorio `lib` que contiene un archivo JAR llamado `miBiblioteca.jar` que contiene clases
adicionales necesarias para el proyecto.

Para compilar y ejecutar el programa, debemos asegurarnos de que el classpath incluya tanto el directorio `src` como el
archivo JAR `miBiblioteca.jar`. Podemos hacerlo utilizando la opción `-cp` o `-classpath` al ejecutar los comandos
`javac` y `java`. Por ejemplo, para compilar la clase `MiClase`, podemos utilizar el siguiente comando:

```bash
javac -cp src:lib/miBiblioteca.jar src/com/ejemplo/MiClase.java
```

Las clases se pueden encontrar en dos lugares, en directorios y en archivos JAR. Los directorios contienen archivos
`.class` que representan las clases compiladas, mientras que los archivos JAR son archivos comprimidos que contienen
múltiples clases y recursos. Al configurar el classpath, podemos incluir tanto directorios como archivos JAR para que
Java pueda encontrar todas las clases necesarias para ejecutar el programa.

#### Paquetes (Packages)

Los paquetes en Java son una forma de organizar y agrupar clases relacionadas en un espacio de nombres común. Un paquete
es un contenedor que permite evitar conflictos de nombres entre clases y facilita la gestión del código fuente. Los
paquetes también proporcionan un nivel adicional de control de acceso, ya que las clases dentro de un paquete pueden
acceder a otras clases del mismo paquete sin necesidad de ser públicas.

Ejemplo, supongamos que tenemos un proyecto de Java con la siguiente estructura de directorios:

```
MiProyecto/
├── src/
│   ├── com/
│   │   └── ejemplo/
│   │       └── MiClase.java
```

En este ejemplo, la clase `MiClase` está ubicada dentro del paquete `com.ejemplo`. Para declarar que la clase pertenece
a este paquete, debemos incluir la declaración del paquete al inicio del archivo `MiClase.java`:

```java
package com.ejemplo; // Declaración del paquete al que pertenece la clase MiClase

public class MiClase { // Declaración de la clase MiClase con el modificador de acceso public
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        System.out.println("Hola desde el paquete com.ejemplo!"); // Imprime un mensaje indicando que el programa se ejecuta desde el paquete com.ejemplo
    } // Fin del método principal
} // Fin de la clase MiClase
```

Podríamos pensar que el nombre correcto de la clase es `MiClase`, pero en realidad, el nombre completo de la clase es
`com.ejemplo.MiClase`, ya que pertenece al paquete `com.ejemplo`. Esto significa que para ejecutar la clase desde la
línea de comandos, debemos utilizar el nombre completo del paquete y la clase:

```bash
java -cp src com.ejemplo.MiClase
```

**Nota:** Es importante asegurarse de que en la terminal nos encontremos en el directorio raíz del proyecto
(`MiProyecto`) antes de ejecutar el comando, ya que de lo contrario, la JVM no podrá encontrar la clase y se producirá
un error de ejecución.

¿El archivo `MiClase.java` debe estar ubicado en el directorio correspondiente al paquete, es decir, en
`src/com/ejemplo/MiClase.java`? Si no lo hacemos, la compilación se realizará correctamente, pero al momento de ejecutar
el programa, la JVM no podrá encontrar la clase y se producirá un error de ejecución. Por lo tanto, es importante seguir
la convención de ubicar los archivos de clase en directorios que reflejen la estructura del paquete al que pertenecen.

### Relación entre el classpath y packages

El classpath y los paquetes están estrechamente relacionados en Java, ya que el classpath determina dónde la JVM busca
las clases y paquetes necesarios para ejecutar un programa. Cuando se utiliza un paquete, la estructura de directorios
debe reflejar la jerarquía del paquete, y el classpath debe incluir el directorio raíz que contiene esa estructura. Por
ejemplo, si tenemos un paquete `com.ejemplo` y la clase `MiClase` dentro de ese paquete, la estructura de directorios
debe ser `src/com/ejemplo/MiClase.java`, y el classpath debe incluir el directorio `src` para que la JVM pueda encontrar
la clase correctamente.

## El API de Java (Parte 1)

### Documentación oficial de Java

#### El API de Java

El API de Java (Application Programming Interface) es un conjunto de clases, interfaces y paquetes que proporcionan
funcionalidades predefinidas para facilitar el desarrollo de aplicaciones en Java. El API de Java está organizado en
diferentes paquetes, cada uno con un propósito específico, y abarca una amplia gama de áreas, como estructuras de datos,
entrada/salida, redes, concurrencia, seguridad y más.

#### Documentación oficial de Java

La documentación oficial de Java es una fuente fundamental para aprender y utilizar el API de Java. Proporciona
información detallada sobre las clases, interfaces y métodos disponibles, así como ejemplos de uso y guías de
referencia. La documentación oficial de Java se encuentra en la página web de Oracle, en la sección de Java SE
Documentation. La documentación está disponible en línea y se puede acceder a ella de forma gratuita. Además, la
documentación oficial de Java se actualiza regularmente para reflejar las nuevas características y mejoras del lenguaje.

### La clase `java.lang.Sytem`

La clase `java.lang.System` es una clase final que forma parte del paquete `java.lang`, el cual se importa
automáticamente en todos los programas de Java. Esta clase proporciona métodos y campos estáticos que permiten
interactuar con el entorno de ejecución de Java, como la entrada/salida estándar, la gestión de propiedades del sistema,
la obtención de información sobre el entorno y la finalización del programa.

La clase `System` tiene 3 variables de clase (estáticas) que son muy útiles para la entrada y salida de datos:

1. `System.out`: Es un objeto de la clase `PrintStream` que representa la salida estándar del programa, generalmente la
   consola. Se utiliza para imprimir mensajes y resultados en la consola utilizando métodos como `print()`, `println()`
   y `printf()`.
2. `System.in`: Es un objeto de la clase `InputStream` que representa la entrada estándar del programa, generalmente el
   teclado. Se utiliza para leer datos de entrada desde la consola utilizando clases como `Scanner` o `BufferedReader`.
3. `System.err`: Es un objeto de la clase `PrintStream` que representa la salida de error estándar del programa,
   generalmente la consola.

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

En Java, cada tipo de dato primitivo tiene una clase envolvente (wrapper class) correspondiente que proporciona métodos
y funcionalidades adicionales para trabajar con esos tipos de datos. Estas clases envolventes permiten tratar los tipos
de datos primitivos como objetos y proporcionan métodos para convertir entre tipos de datos, realizar operaciones y
manipular valores. Las clases envolventes para los tipos de datos primitivos en Java son las siguientes:

| Tipo de dato primitivo | Clase envolvente (Wrapper Class) |
|------------------------|----------------------------------|
| byte                   | java.lang.Byte                   |
| short                  | java.lang.Short                  |
| int                    | java.lang.Integer                |
| long                   | java.lang.Long                   |
| float                  | java.lang.Float                  |
| double                 | java.lang.Double                 |
| char                   | java.lang.Character              |
| boolean                | java.lang.Boolean                |

Como puedes observar en la tabla, cada tipo de dato primitivo tiene una clase envolvente correspondiente en el paquete
`java.lang`. Estas clases proporcionan métodos y funcionalidades adicionales para trabajar con los tipos de datos
primitivos, como la conversión entre tipos, la comparación de valores y la manipulación de cadenas de caracteres.

Cada clase tiene definidos las constantes `MIN_VALUE` y `MAX_VALUE`, que representan los valores mínimo y máximo que
puede almacenar el tipo de dato primitivo correspondiente. Por ejemplo, la clase `Integer` tiene las constantes
`Integer.MIN_VALUE` y `Integer.MAX_VALUE`, que representan el valor mínimo y máximo que puede almacenar un entero en
Java.

Cada clase también tiene definidos métodos estáticos para convertir entre tipos de datos primitivos y objetos, como
`valueOf()` y `parseX()`, donde `X` es el tipo de dato primitivo correspondiente. Estos métodos permiten convertir
fácilmente entre tipos de datos primitivos y objetos, lo que facilita la manipulación y el procesamiento de datos en
Java.

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

Autoboxing es el proceso automático de conversión de un tipo de dato primitivo a su clase envolvente correspondiente.
Por ejemplo, cuando asignamos un valor entero a una variable de tipo `Integer`, Java realiza automáticamente la
conversión de `int` a `Integer`. Esto permite trabajar con tipos de datos primitivos como objetos sin necesidad de
realizar conversiones explícitas.

Convertir un primitivo a clase se llama boxing, y convertir una clase a primitivo se llama unboxing. Por ejemplo, si
tenemos un `int` y lo asignamos a un `Integer`, Java realiza boxing automáticamente. De manera similar, si tenemos un
`Integer` y lo asignamos a un `int`, Java realiza unboxing automáticamente.

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

En Java, un `String` es un objeto que representa una secuencia de caracteres. Los `String` son inmutables, lo que
significa que una vez creado un objeto `String`, su valor no puede cambiar. Si se realiza una operación que modifica un
`String`, se crea un nuevo objeto `String` con el valor modificado, mientras que el objeto original permanece sin
cambios. El tipo de datos `String` se llama alfanumérico, ya que puede contener letras, números y caracteres especiales.
Los `String` se utilizan ampliamente en Java para representar texto y realizar operaciones de manipulación de cadenas.

Declaración de un String en Java:

```java
String mensaje = "Hola, mundo!"; // Declaración de un objeto String llamado mensaje con el valor "Hola, mundo!"
```

Como se había comentado, un objeto String es inmutable, es decir, su valor original no cambia. Por ejemplo, si
concatenamos un String con otro, se crea un nuevo objeto String con el valor concatenado, mientras que el objeto
original permanece sin cambios.

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

Java puede convertir números a su contraparte String automáticamente, y viceversa, utilizando métodos de la clase
`String` y las clases envolventes correspondientes. Por ejemplo, podemos convertir un número entero a un String
utilizando el método `String.valueOf()` o la concatenación con una cadena vacía. Para convertir un String a un número
entero, podemos utilizar el método `Integer.parseInt()`.

Java también puede realizar el autoboxing al concatenar un número con un String. Por ejemplo, si concatenamos un número
entero con un String, Java convierte automáticamente el número a su representación en cadena antes de realizar la
concatenación.

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

La clase `StringBuilder` en Java es una clase mutable que se utiliza para crear y manipular cadenas de caracteres de
manera eficiente. A diferencia de los objetos `String`, que son inmutables, los objetos `StringBuilder` permiten
modificar el contenido de la cadena sin crear nuevos objetos, eds decir, son mutables. Esto hace que `StringBuilder` sea
más eficiente en términos de rendimiento cuando se realizan múltiples operaciones de concatenación o modificación de
cadenas.

El método que se utiliza para concatenar cadenas en `StringBuilder` es el método `append()`. Este método agrega el
contenido especificado al final de la cadena existente en el objeto `StringBuilder`. Además, `StringBuilder` proporciona
otros métodos útiles, como `insert()`, `delete()`, `replace()` y `reverse()`, que permiten realizar diversas operaciones
de manipulación de cadenas de manera eficiente.

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

La clase `StringTokenizer` en Java es una clase que se utiliza para dividir una cadena de texto en tokens o subcadenas
basadas en un delimitador específico. Esta clase proporciona métodos para iterar sobre los tokens y obtener cada uno de
ellos de manera individual. La clase `StringTokenizer` es útil cuando se necesita procesar cadenas de texto que
contienen múltiples elementos separados por un delimitador, como espacios, comas o cualquier otro carácter.

Ejemplo, tenemos un String con datos numéricos separados por comas, y queremos dividirlo en tokens individuales
utilizando la clase `StringTokenizer`. A continuación, se muestra un ejemplo de cómo hacerlo:

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

### `String.format()` y `System.out.printf()`

La clase `String.format()` y el método `System.out.printf()` en Java son utilizados para formatear cadenas de texto y
mostrarlas en la consola. Ambos métodos permiten especificar un formato personalizado para la cadena de texto,
incluyendo el tipo de datos, el ancho y la precisión de los valores numéricos, entre otros.

La clase `String.format()` devuelve una cadena formateada según el formato especificado, mientras que el método
`System.out.printf()` muestra directamente la cadena formateada en la consola.

Ejemplo de uso de `String.format()` y `System.out.printf()`:

```java
package com.driagon;

public class FormateoCadenas {
    public static void main(String[] args) {
        int numero = 42; // Declaración de un tipo de dato primitivo int
        double decimal = 3.14159; // Declaración de un tipo de dato primitivo double
        String texto = "Hola, mundo!"; // Declaración de un objeto String

        System.out.println("Número: " + numero + ", Decimal: " + decimal + ", Texto: " + texto); // Salida usando System.out.println() de manera tradicional

        // Uso de String.format() para formatear una cadena
        String mensajeFormateado = String.format("Número: %d, Decimal: %.2f, Texto: %s", numero, decimal, texto);
        System.out.println(mensajeFormateado); // Imprime la cadena formateada en la consola

        // Uso de System.out.printf() para mostrar una cadena formateada directamente en la consola
        System.out.printf("Número: %d, Decimal: %.2f, Texto: %s%n", numero, decimal, texto);
    }
}
```

En el ejemplo anterior, se utiliza `%d` para formatear un número entero, `%.2f` para formatear un número decimal con dos
decimales y `%s` para formatear una cadena de texto. El resultado se muestra en la consola utilizando ambos métodos.

### Conversión de datos

En Java, la conversión de datos se refiere al proceso de cambiar un valor de un tipo de dato a otro. Esto puede ser
necesario cuando se trabaja con diferentes tipos de datos y se requiere realizar operaciones o asignaciones entre ellos.
La conversión de datos puede ser implícita (automática) o explícita (manual).

```java
String s = "123456";
int i;

try{
i =Integer.

parseInt(s); // Convierte el String s a un entero utilizando el método parseInt() de la clase Integer
    System.out.

println("El valor convertido es: "+i); // Imprime el valor convertido en la consola
}catch(
NumberFormatException e){
        System.err.

println("Error: El valor no es un número válido."); // Imprime un mensaje de error en la salida de error estándar si la conversión falla
}
```

#### Manejo de fechas

El manejo de fechas es mas complejo de lo que parece, ya que existen diferentes formatos de fechas y horas, y es
importante tener en cuenta la zona horaria y el calendario utilizado. En Java, existen varias clases para trabajar con
fechas y horas, como `java.util.Date`, `java.util.Calendar`, `java.time.LocalDate`, `java.time.LocalTime`,
`java.time.LocalDateTime`, entre otras.

Por ejemplo, si tenemos `01/02/03`, ¿Cómo lo interpretamos? ¿Es el 1 de febrero de 2003, o el 2 de enero de 2003, o el 3
de febrero de 2001? La interpretación depende del formato de fecha utilizado y del contexto en el que se encuentra. Por
lo tanto, es importante especificar claramente el formato de fecha y hora al trabajar con fechas en Java.

Para poder manejar fechas, podemos apoyarnos del formato, ya sea que lo hagamos de manera manual, o utilizando la clase
`SimpleDateFormat` de Java, que nos permite definir un patrón de formato para las fechas y horas. Por ejemplo, podemos
utilizar el patrón `dd/MM/yyyy` para representar una fecha en el formato día/mes/año.

Podemos crear nuestra propia implementación de manejo de fechas, de modo que nos permitirá reforzar los conocimientos
adquiridos en el curso, y nos permitirá tener un mejor control sobre el manejo de fechas y horas en nuestras
aplicaciones Java. A continuación, se muestra un ejemplo de cómo podríamos implementar una clase `Fecha` que nos permita
manejar fechas de manera más sencilla:

```java
String srtDate = "01/02/2003"; // Fecha en formato dd/MM/yyyyy
        int date, month, year;

String tmp = srtDate.substring(0, 2); // Extrae el día de la fecha utilizando el método substring()
date =Integer.

parseInt(tmp); // Convierte el día a un entero utilizando el método parseInt() de la clase Integer

tmp =srtDate.

substring(3,5); // Extrae el mes de la fecha utilizando el método substring()

month =Integer.

parseInt(tmp); // Convierte el mes a un entero utilizando el método parseInt() de la clase Integer

tmp =srtDate.

substring(6,10); // Extrae el año de la fecha utilizando el método substring()

year =Integer.

parseInt(tmp); // Convierte el año a un entero utilizando el método parseInt() de la clase Integer

Calendar cal = Calendar.getInstance();
cal.

set(Calendar.DATE, date); // Establece el día en el objeto Calendar
cal.

set(Calendar.MONTH, month -1); // Establece el mes en el objeto Calendar (restando 1 ya que los meses en Calendar son indexados desde 0)
cal.

set(Calendar.YEAR, year); // Establece el año en el objeto Calendar
cal.

set(Calendar.HOUR_OF_DAY, 0); // Establece la hora en el objeto Calendar a 0 (medianoche)
cal.

set(Calendar.MINUTE, 0); // Establece los minutos en el objeto Calendar a 0
cal.

set(Calendar.SECOND, 0); // Establece los segundos en el objeto Calendar
cal.

set(Calendar.MILLISECOND, 0); // Establece los milisegundos en el objeto Calendar a 0

Date result = cal.getTime(); // Obtiene la fecha completa como un objeto Date
System.out.

println("Fecha: "+fecha); // Imprime la fecha en la consola
```

No obstante, este código es un ejemplo simple y no considera casos complejos como validar si la cadena está en el
formato correcto, si la fecha es válida (por ejemplo, 30 de febrero no es una fecha válida), o si se deben manejar
diferentes formatos de fecha. Para un manejo más robusto de fechas y horas, se recomienda utilizar las clases del
paquete `java.time` introducidas en Java 8, como `LocalDate`, `LocalTime`, `LocalDateTime`, y `DateTimeFormatter`, que
proporcionan una API más moderna y segura para trabajar con fechas y horas.

Ejemplo de manejo de fechas utilizando `Date` realizando validaciones necesarias:

```java
package com.driagon;

import java.util.Date;

public class DateParser {

    public static Date parseDate(String strDate) {
        if (strDate == null || strDate.length() == 0) {
            return null; // Retorna null si la cadena de fecha es nula o vacía
        }

        int date, month, year;
        int idx0 = strDate.indexOf('/');
        if (idx0 == -1) {
            return null; // Retorna null si no se encuentra el primer separador '/'
        }

        String tmp = strDate.substring(0, idx0);
        date = Integer.parseInt(tmp); // Convierte el día a un entero utilizando el método parseInt() de la clase Integer
        int idx1 = strDate.indexOf('/', idx0 + 1);
        if (idx1 == -1) {
            return null; // Retorna null si no se encuentra el segundo separador '/'
        }
        tmp = strDate.substring(idx0 + 1, idx1);
        month = Integer.parseInt(tmp); // Convierte el mes a un entero utilizando el método parseInt() de la clase Integer

        tmp = strDate.substring(idx1 + 1);
        year = Integer.parseInt(tmp); // Convierte el año a un entero utilizando el método parseInt() de la clase Integer

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, date); // Establece el día en el objeto Calendar
        cal.set(Calendar.MONTH, month - 1); // Establece el mes en el objeto Calendar (restando 1 ya que los meses en Calendar son indexados desde 0)
        cal.set(Calendar.YEAR, year); // Establece el año en el objeto Calendar
        cal.set(Calendar.HOUR_OF_DAY, 0); // Establece la hora en el objeto Calendar a 0 (medianoche)
        cal.set(Calendar.MINUTE, 0); // Establece los minutos en el objeto Calendar a 0
        cal.set(Calendar.SECOND, 0); // Establece los segundos en el objeto Calendar a 0
        cal.set(Calendar.MILLISECOND, 0); // Establece los milisegundos en el objeto Calendar a 0

        return cal.getTime(); // Retorna la fecha completa como un objeto Date
    }
}
```

### Manejo de fechas

En Java, el manejo de fechas se puede realizar utilizando diferentes clases y métodos proporcionados por la API de Java.
A continuación, se presentan algunos ejemplos de cómo trabajar con fechas en Java utilizando las clases `Date`,
`Calendar` y `SimpleDateFormat`.

```java
package com.driagon;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date fechaActual = new Date(); // Crea un objeto Date con la fecha y hora actual
        System.out.println("Fecha y hora actual: " + fechaActual); // Imprime la fecha y hora actual en la consola
    }
}
```

La mayoría de los métodos de la clase `Date` están obsoletos desde Java 7, y se recomienda utilizar la clase `Calendar`
para realizar operaciones más complejas con fechas. La clase `Calendar` proporciona métodos para obtener y establecer
diferentes componentes de la fecha, como el año, mes, día, hora, minuto y segundo.

```java
package com.driagon;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Crea un objeto Calendar con la fecha y hora actual
        System.out.println(cal.getTime()); // Imprime la fecha y hora actual en la consola utilizando el método getTime() de Calendar
        cal.add(Calendar.DAY_OF_MONTH, 1); // Agrega un día a la fecha actual
        System.out.println(cal.getTime()); // Imprime la nueva fecha y hora en la consola
        cal.add(Calendar.HOUR, 2); // Agrega dos horas a la fecha actual
        System.out.println(cal.getTime()); // Imprime la nueva fecha y hora en la consola
    }
}
```

Como pudiste ver en el código, `Calendar.getInstance()` nos devuelve un objeto `Calendar`, aunque si bien pudimos
utilizar `new GregorianCalendar()`, es recomendable utilizar `Calendar.getInstance()` ya que nos devuelve un objeto
`Calendar` con la configuración regional y de zona horaria del sistema, dado que existen muchas zonas horarias y
calendarios diferentes en el mundo, y es importante tener en cuenta estas diferencias al trabajar con fechas y horas en
aplicaciones Java. `Calendar.getInstance()` nos devuelve un objeto `Calendar` que representa la fecha y hora actual en
la zona horaria y configuración regional del sistema, lo que nos permite trabajar con fechas y horas de manera más
precisa y consistente.

Una vez creado el objeto `Calendar`, podemos utilizar los métodos `add()` y `set()` para modificar la fecha y hora según
nuestras necesidades. El método `add()` nos permite agregar o restar unidades de tiempo específicas, como días, horas,
minutos, etc., mientras que el método `set()` nos permite establecer valores específicos para los diferentes componentes
de la fecha y hora.

También podemos extraer información específica de la fecha y hora utilizando los métodos `get()`, `getTime()`,
`getTimeInMillis()`, entre otros. Por ejemplo, podemos obtener el año, mes, día, hora, minuto y segundo utilizando los
métodos `get(Calendar.YEAR)`, `get(Calendar.MONTH)`, `get(Calendar.DAY_OF_MONTH)`, `get(Calendar.HOUR_OF_DAY)`,
`get(Calendar.MINUTE)` y `get(Calendar.SECOND)` respectivamente.

```java
package com.driagon;

import java.util.Calendar;

public class CalendarInfo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Crea un objeto Calendar con la fecha y hora actual
        System.out.println("Año: " + cal.get(Calendar.YEAR)); // Imprime el año actual en la consola
        System.out.println("Mes: " + (cal.get(Calendar.MONTH) + 1)); // Imprime el mes actual en la consola (sumando 1 ya que los meses en Calendar son indexados desde 0)
        System.out.println("Día: " + cal.get(Calendar.DATE)); // Imprime el día del mes actual en la consola
        System.out.println("Hora: " + cal.get(Calendar.HOUR)); // Imprime la hora actual en formato de 24 horas en la consola
        System.out.println("Minuto: " + cal.get(Calendar.MINUTE)); // Imprime el minuto actual en la consola
        System.out.println("Segundo: " + cal.get(Calendar.SECOND)); // Imprime el segundo actual en la consola
    }
}
```

Hay algunas particularidades a tener en cuenta al trabajar con fechas y horas en Java. Por ejemplo, los meses en la
clase `Calendar` están indexados desde 0, lo que significa que enero es el mes 0, febrero es el mes 1, y así
sucesivamente. Por lo tanto, al obtener el mes actual utilizando `cal.get(Calendar.MONTH)`, debemos sumar 1 para obtener
el valor correcto del mes.

```java
package com.driagon;

import java.util.Calendar;

public class Mes {

    public static void main() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; // Arreglo de nombres de los meses
        Calendar cal = Calendar.getInstance(); // Crea un objeto Calendar con la fecha y hora actual
        int mesActual = cal.get(Calendar.MONTH); // Obtiene el mes actual (indexado desde 0) utilizando el método get() de Calendar
        System.out.println("Mes actual: " + meses[mesActual]); // Imprime el nombre del mes actual en la consola utilizando el arreglo de nombres de los meses
    }
}
```

La clase `Calendar` también nos permite comparar, sumar y restar fechas, así como calcular diferencias entre fechas
utilizando los métodos `compareTo()`, `before()`, `after()`, `add()`, `roll()`, entre otros. Esto nos permite realizar
operaciones más complejas con fechas y horas en nuestras aplicaciones Java.

```java
package com.driagon;

import java.util.Calendar;

public class Fecha {

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance(); // Crea un objeto Calendar con la fecha y hora actual
        Calendar cal2 = Calendar.getInstance(); // Crea otro objeto Calendar con la fecha y hora actual

        cal2.add(Calendar.DAY_OF_MONTH, 5); // Agrega 5 días a la fecha del segundo objeto Calendar

        // Compara las fechas de ambos objetos Calendar utilizando los métodos before() y after()
        if (cal1.before(cal2)) { // Compara si la fecha del primer objeto Calendar es anterior a la del segundo objeto Calendar
            System.out.println("La fecha del primer calendario es anterior a la del segundo calendario."); // Imprime un mensaje indicando que la primera fecha es anterior
        } else if (cal1.after(cal2)) { // Compara si la fecha del primer objeto Calendar es posterior a la del segundo objeto Calendar
            System.out.println("La fecha del primer calendario es posterior a la del segundo calendario."); // Imprime un mensaje indicando que la primera fecha es posterior
        } else {
            System.out.println("Ambas fechas son iguales."); // Imprime un mensaje indicando que ambas fechas son iguales
        }

        // También comparar usando compareTo()
        int comparacion = cal1.compareTo(cal2); // Compara las fechas de ambos objetos Calendar utilizando el método compareTo()
        if (comparacion < 0) { // Si el resultado es negativo, la primera fecha es anterior a la segunda
            System.out.println("La fecha del primer calendario es anterior a la del segundo calendario (usando compareTo())."); // Imprime un mensaje indicando que la primera fecha es anterior
        } else if (comparacion > 0) { // Si el resultado es positivo, la primera fecha es posterior a la segunda
            System.out.println("La fecha del primer calendario es posterior a la del segundo calendario (usando compareTo())."); // Imprime un mensaje indicando que la primera fecha es posterior
        } else {
            System.out.println("Ambas fechas son iguales (usando compareTo())."); // Imprime un mensaje indicando que ambas fechas son iguales
        }
    }
}
```

## Programación Orientada a Objetos (POO)

Durante el curso, hemos hablado sobre las clases y los objetos, que son los conceptos fundamentales de la Programación
Orientada a Objetos (POO). La POO es un paradigma de programación que se basa en el concepto de "objetos", que son
instancias de clases. Una clase es una plantilla o un modelo que define las propiedades (atributos) y comportamientos
(métodos) de los objetos que se crean a partir de ella.

La programación orientada a objetos es un método de programación que imita la manera en que todos nosotros hacemos las
cosas. Es una evolución natural de las innovaciones anteriores al diseño de lenguajes de programación: Es más
estructurado que intentos anteriores de programación estructurada y más modular y abstracto que intentos anteriores de
abstracción de datos y ocultamiento de los detalles. Hay tres propiedades principales que caracterizan a la programación
orientada a objetos:

* **Encapsulamiento**: Es la combinación de un registro con procedimientos y funciones para manipular sus datos, con lo
  que se forma un nuevo tipo de datos: El objeto.
* **Herencia**: Se refiere a definir un objeto y entonces usarlo para construir una jerarquía de objetos descendientes,
  donde cada descendiente hereda el acceso al código y datos de su antecesor.
* **Polimorfismo**: Es darle un nombre a una acción que se comparte de arriba a abajo en la jerarquía de objetos, donde
  cada objeto en la jerarquía implementa la acción de una forma única para sí mismo.

El reto de la programación orientada a objetos es que se requiere que hagas a un lado tus hábitos en la forma en que
piensas sobre cómo programar que ha sido estándar por muchos años. Sin embargo, una vez que haces eso, OOP es una
herramienta simple, directa y superior para resolver muchos de los problemas de los que están plagados los programas
tradicionales.

Una nota para los que han programado en OOP en otros lenguajes: Hagan a un lado sus impresiones previas de OOP y
aprendan las características de este lenguaje en sus propios términos. OOP no es la única forma de programar; es un
continuo de ideas.

Y una nota para los que no tienen idea de lo que se trata OOP: Demasiado desarrollo, demasiada confusión, y mucha gente
hablando acerca de algo que no entienden ha enturbiado las aguas en años recientes. Esfuérzate por olvidar lo que la
gente te ha dicho acerca de OOP. La mejor manera (de hecho la única manera) de aprender algo útil sobre OOP es hacer lo
que estás a punto de hacer: Sentarte e intentarlo por ti mismo. No te preocupes si no entiendes todo de inmediato. La
POO es un paradigma que requiere práctica y experiencia para dominarlo.

La programación orientada a objetos está divida en dos partes: la parte técnica y la parte filosófica. La parte técnica
es la sintaxis y el funcionamiento de este tipo de programación, mientras que la parte filosófica es la forma en que se
piensa y se aborda la resolución de problemas utilizando este paradigma. La parte técnica es más fácil de aprender, ya
que se trata de aprender la sintaxis y las reglas del lenguaje, mientras que la parte filosófica requiere un cambio de
mentalidad y una comprensión más profunda de los conceptos de la POO.

### La parte técnica de la POO

La parte técnica de la POO se centra en la implementación de clases y objetos, así como en la utilización de los
conceptos de encapsulamiento, herencia y polimorfismo.

##### Campos

Los campos son variables que se declaran dentro de una clase y que representan las propiedades o atributos de los
objetos creados a partir de esa clase.

Ejemplo de definición de campos en una clase:

```java
public class Persona {
    private String nombre; // Campo privado que representa el nombre de la persona
}
```

##### Encapsulamiento

Uno de los principios fundamentales de la programación orientada a objetos es el ocultamiento de la información, que se
logra mediante el encapsulamiento. El encapsulamiento consiste en agrupar los datos (campos) y los métodos que operan
sobre esos datos dentro de una clase, y controlar el acceso a esos datos mediante modificadores de acceso. Esto permite
proteger los datos de modificaciones no deseadas y garantizar que los objetos se utilicen de manera coherente. Existen 4
tipos de modificadores acceso que se pueden utilizar:

- `private`: Los campos `private` solo pueden ser accedidos desde dentro de la clase.
- `protected`: Los campos `protected` pueden ser accedidos desde la clase y sus subclases.
- `public`: Los campos `public` pueden ser accedidos desde cualquier parte del programa.
- `default` (sin modificador de acceso): Los campos con acceso `default` pueden ser accedidos desde cualquier clase en
  el mismo paquete.

La siguiente tabla resume los modificadores de acceso y su alcance:

| Acceso    | Clase | Paquete | Subclase | Mundo |
|-----------|-------|---------|----------|-------|
| private   | Sí    | No      | No       | No    |
| default   | Sí    | Sí      | No       | No    |
| protected | Sí    | Sí      | Sí       | No    |
| public    | Sí    | Sí      | Sí       | Sí    |

##### Herencia

La herencia es un mecanismo que permite crear nuevas clases a partir de clases existentes, heredando sus propiedades y
comportamientos. La clase que hereda se llama subclase o clase derivada, mientras que la clase de la que se hereda se
llama superclase o clase base. La herencia permite reutilizar código y establecer relaciones jerárquicas entre clases.

Ejemplo de herencia en Java:

```java
public class Point {
    public int x, y; // Campos públicos que representan las coordenadas del punto
}

public class Circle extends Point { // La clase Circle hereda de la clase Point
    public int radius; // Campo público que representa el radio del círculo
}

public class Rectangle extends Point { // La clase Rectangle hereda de la clase Point
    public int width, height; // Campos públicos que representan el ancho y alto del rectángulo
}
```

Como puedes observar, hemos definido una clase `Point` que representa un punto en la pantalla, a partir de esta clase,
hemos creado dos subclases: `Circle` y `Rectangle`, que heredan los campos `x` e `y` de la clase `Point`, y agregan sus
propios campos específicos: `radius` para el círculo y `width` y `height` para el rectángulo.

Para heredar de una clase en Java, se utiliza la palabra clave `extends`, seguida del nombre de la clase base. Una
subclase puede heredar campos y métodos de su superclase, y también puede agregar sus propios campos y métodos.

En este ejemplo, la clase `Point` es una clase base, que se usa para crear Círculos y Rectángulos. Las variables de tipo
base son compatibles con las variables de tipo derivado, lo que significa que podemos asignar un objeto de una subclase
a una variable de la superclase.

Ejemplo de compatibilidad entre variables de tipo base y derivado:

```java
public class Main {
    public static void main(String[] args) {
        Point p = new Point(); // Crea un objeto de la clase Point
        Circle c = new Circle(); // Crea un objeto de la clase Circle
        Rectangle r = new Rectangle(); // Crea un objeto de la clase Rectangle

        p = c; // Asigna el objeto Circle a la variable de tipo Point (compatibilidad de tipos)
        p = r; // Asigna el objeto Rectangle a la variable de tipo Point (compatibilidad de tipos)

        // O bien podemos crear un objeto de la subclase y asignarlo a una variable de la superclase directamente:
        Point p2 = new Circle(); // Crea un objeto de la clase Circle y lo asigna a una variable de tipo Point (compatibilidad de tipos)
        Point p3 = new Rectangle(); // Crea un objeto de la clase Rectangle y lo asigna a una variable de tipo Point (compatibilidad de tipos)

        // De manera inversa no es posible, es decir, no podemos asignar un objeto de la superclase a una variable de la subclase directamente:
        // Circle c2 = new Point(); // Esto generará un error de compilación
        // Rectangle r2 = new Point(); // Esto generará un error de compilación
    }
}
```

Como una regla general, todo objeto en Java en realidad deriva de la clase `Object`, que es la superclase de todas las
clases en Java. Esto significa que cualquier clase que creemos en Java hereda implícitamente de la clase `Object`, ya
sea de manera directa o indirecta. Por lo tanto, todas las clases en Java tienen acceso a los métodos y propiedades
definidos en la clase `Object`, como `toString()`, `equals()`, `hashCode()`.

##### Polimorfismo

La palabra polimorfismo proviene del griego y significa "muchas formas". En programación orientada a objetos, el
polimorfismo se refiere a la capacidad de las clases de definir su propio comportamiento para un método que tiene el
mismo nombre en la superclase. Esto permite que un objeto de una subclase pueda ser tratado como un objeto de su
superclase, y que el método correspondiente a la subclase sea invocado en tiempo de ejecución.

```java
public class Point {
    public int x, y; // Campos públicos que representan las coordenadas del punto

    public void draw() { // Método público que dibuja el punto
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")"); // Imprime las coordenadas del punto en la consola
    }
}

public class Circle extends Point { // La clase Circle hereda de la clase Point
    public int radius; // Campo público que representa el radio del círculo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el círculo 
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius); // Imprime las coordenadas del círculo y su radio en la consola
    }
}

public class Rectangle extends Point { // La clase Rectangle hereda de la clase Point
    public int width, height; // Campos públicos que representan el ancho y alto del rectángulo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el rectángulo
        System.out.println("Dibujando un rectángulo en (" + x + ", " + y + ") con ancho " + width + " y alto " + height); // Imprime las coordenadas del rectángulo, su ancho y alto en la consola
    }
}

public class Main {
    public static void main(String[] args) {
        Point p = new Point(); // Crea un objeto de la clase Point
        Circle c = new Circle(); // Crea un objeto de la clase Circle
        Rectangle r = new Rectangle(); // Crea un objeto de la clase Rectangle

        p.draw(); // Llama al método draw() del objeto Point
        c.draw(); // Llama al método draw() del objeto Circle
        r.draw(); // Llama al método draw() del objeto Rectangle

        // Polimorfismo: podemos tratar a los objetos de las subclases como objetos de la superclase
        Point p2 = new Circle(); // Crea un objeto de la clase Circle y lo asigna a una variable de tipo Point
        Point p3 = new Rectangle(); // Crea un objeto de la clase Rectangle y lo asigna a una variable de tipo Point

        p2.draw(); // Llama al método draw() del objeto Circle, demostrando polimorfismo
        p3.draw(); // Llama al método draw() del objeto Rectangle, demostrando polimorfismo
    }
}
```

Como puedes observar, hemos definido un método `draw()` en la clase `Point`, y luego lo hemos creado el método con el
mismo nombre en las subclases `Circle` y `Rectangle` utilizando la anotación `@Override`, a esto se le llama
sobrescribir un método. Esto significa que cuando llamamos al método `draw()` en un objeto de la subclase, se ejecutará
la versión del método correspondiente a esa subclase, demostrando así el polimorfismo.

La compatibilidad de una clase base con sus clases derivadas es útil para poder crear colecciones de objetos de
diferentes tipos que comparten una relación jerárquica. Por ejemplo, podemos crear una lista de objetos de tipo `Point`,
y agregar a esa lista objetos de tipo `Circle` y `Rectangle`, ya que ambos son subclases de `Point`. Esto nos permite
tratar a todos los objetos de la lista como objetos de tipo `Point`, y llamar al método `draw` en cada uno de ellos,
demostrando así el polimorfismo.

```java
public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[3]; // Crea un arreglo de objetos de tipo Point con capacidad para 3 elementos
        points[0] = new Point(); // Asigna un objeto de la clase Point al primer elemento del arreglo
        points[1] = new Circle(); // Asigna un objeto de la clase Circle al segundo elemento del arreglo
        points[2] = new Rectangle(); // Asigna un objeto de la clase Rectangle al tercer elemento del arreglo

        for (Point p : points) { // Itera sobre cada objeto en el arreglo de puntos
            p.draw(); // Llama al método draw() del objeto actual, demostrando polimorfismo
        }
    }
}
```

Lo que veríamos en la consola sería:

```bash
Dibujando un punto en (0, 0)
Dibujando un círculo en (0, 0) con radio 0
Dibujando un rectángulo en (0, 0) con ancho 0 y alto 0
```

### Type Casting, super y constructores

#### Type Casting (Conversión de tipos)

Se refiere a la conversión de un tipo de dato a otro temporalmente, ya sea de manera implícita o explícita, para que
funcione los tipos de ambos objetos debe ser compatible, es decir, que uno de los tipos debe ser una subclase del otro.
Por ejemplo, no es posible convertir un double a un int directamente, ya que ambos tipos de datos son
incompatibles, pero mediante type casting podemos convertir un double a un int de manera explícita, aunque se perderá la
parte decimal del número. Existen dos tipos de type casting: el implícito y el explícito. El implícito ocurre cuando el
compilador realiza la conversión automáticamente, mientras que el explícito ocurre cuando el programador indica al
compilador que real ice la conversión mediante el uso de paréntesis y el tipo de dato al que se desea convertir.

```java
public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78; // Declaración de un tipo de dato primitivo double
        int n = d; // Esto generará un error de compilación, ya que no se puede convertir un double a un int de manera implícita
        int i = (int) d; // Conversión explícita de double a int mediante type casting
        System.out.println("Valor de d: " + d); // Imprime el valor original del double en la consola
        System.out.println("Valor de i: " + i); // Imprime el valor convertido a int en la consola
    }
}
```

Volviendo al ejemplo de las clases `Point`, `Circle` y `Rectangle`, podemos agregar un método para calcular el área de
cada figura:

```java
public class Point {
    public int x, y; // Campos públicos que representan las coordenadas del punto

    public void draw() { // Método público que dibuja el punto
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")"); // Imprime las coordenadas del punto en la consola
    }
}

public class Circle extends Point { // La clase Circle hereda de la clase Point
    public int radius; // Campo público que representa el radio del círculo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el círculo 
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius); // Imprime las coordenadas del círculo y su radio en la consola
    }

    public double area() { // Método público que calcula el área del círculo
        return Math.PI * radius * radius; // Calcula y retorna el área del círculo utilizando la fórmula A = πr²
    }
}

public class Rectangle extends Point { // La clase Rectangle hereda de la clase Point
    public int width, height; // Campos públicos que representan el ancho y alto del rectángulo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el rectángulo
        System.out.println("Dibujando un rectángulo en (" + x + ", " + y + ") con ancho " + width + " y alto " + height); // Imprime las coordenadas del rectángulo, su ancho y alto en la consola
    }

    public double area() { // Método público que calcula el área del rectángulo
        return width * height; // Calcula y retorna el área del rectángulo utilizando la fórmula A = w * h
    }
}
```

Como puedes observar, solo hemos creado un método `area()` en las subclases `Circle` y `Rectangle`, ya que el área de un
punto no tiene sentido. Esto nos permite calcular el área de cada figura de manera específica, demostrando así el
polimorfismo, pero al crear un arreglo de objetos de tipo `Point`, no podemos llamar al método `area()` directamente, ya
que no está definido en la clase base `Point`. Para poder llamar al método `area()` de las subclases, necesitamos
realizar un type casting explícito para convertir el objeto de tipo `Point` a su tipo específico (`Circle` o
`Rectangle`) antes de llamar al método.

```java
public class Main {
    public static void main(String[] args) {
        Point c = new Circle(); // Crea un objeto de la clase Circle y lo asigna a una variable de tipo Point
        Point r = new Rectangle(); // Crea un objeto de la clase Rectangle y lo asigna a una variable de tipo Point

        // Si intento llamar al método area() directamente, obtendré un error de compilación, ya que el método area() no está definido en la clase Point
        // double area = c.area(); // Esto generará un error de compilación

        // Para poder llamar al método area() de las subclases, necesitamos realizar un type casting explícito para convertir el objeto de tipo Point a su tipo específico (Circle o Rectangle) antes de llamar al método.
        double areaCircle = ((Circle) c).area(); // Convierte el objeto c a Circle y llama al método area()
        double areaRectangle = ((Rectangle) r).area(); // Convierte el objeto r a Rectangle y llama al método area()

        System.out.println("Área del círculo: " + areaCircle); // Imprime el área del círculo en la consola
        System.out.println("Área del rectángulo: " + areaRectangle); // Imprime el área del rectángulo en la consola

    }
}
```

#### Idenificador `super`

¿Qué pasa si quisiera llamar al método `draw()` de la clase base `Point` desde las subclases `Circle` y `Rectangle` para
hacer mi propia implementación del método `draw()` pero usando la funcionalidad de la clase base? Para ello, podemos
utilizar el identificador `super`, que nos permite acceder a los miembros (campos y métodos) de la superclase desde una
subclase. Esto es útil cuando queremos extender o modificar el comportamiento de un método heredado sin perder la
funcionalidad original.

Por ejemplo, queremos dibujar un circulo y un rectángulo, pero que tamnbién se dibuje el punto donde está su centro,
para ello podemos llamar al método `draw()` de la clase base `Point` desde las subclases `Circle` y `Rectangle`
utilizando el identificador `super`.

```java
public class Circle extends Point { // La clase Circle hereda de la clase Point
    public int radius; // Campo público que representa el radio del círculo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el círculo
        super.draw(); // Llama al método draw() de la clase base Point para dibujar el punto donde está el centro del círculo
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius); // Imprime las coordenadas del círculo y su radio en la consola
    }
}

public class Rectangle extends Point { // La clase Rectangle hereda de la clase Point
    public int width, height; // Campos públicos que representan el ancho y alto del rectángulo

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el rectángulo
        super.draw(); // Llama al método draw() de la clase base Point para dibujar el punto donde está el centro del rectángulo
        System.out.println("Dibujando un rectángulo en (" + x + ", " + y + ") con ancho " + width + " y alto " + height); // Imprime las coordenadas del rectángulo, su ancho y alto en la consola
    }
}
```

#### Constructores

Toda clase en Java tiene definido un constructor aunque no lo hayamos definido explícitamente. Un constructor es un
método especial que se llama automáticamente cuando se crea un objeto de una clase. Su propósito principal es
inicializar los campos del objeto y realizar cualquier configuración necesaria para que el objeto esté listo para su
uso. Los constructores tienen el mismo nombre que la clase y no tienen un tipo de retorno, ni siquiera `void`.

Un claro ejemplo, es que si intentaste escribir los códigos anteriores en tu IDE y al ejecutarlos, te diste cuenta que
imprimía los valores de los campos `x`, `y`, `radius`, `width` y `height` como 0, esto se debe a que no hemos
inicializado los campos de las clases `Point`, `Circle` y `Rectangle`, y por defecto, los campos de tipo `int` se
inicializan con el valor 0.

Para inicializar los campos de las clases, podemos definir constructores en cada clase que nos permitan establecer los
valores de los campos al momento de crear un objeto. Por ejemplo, podemos definir un constructor en la clase `Point` que
reciba los valores de `x` e `y`, y un constructor en la clase `Circle` que reciba los valores de `x`, `y` y `radius`.

```java
public class Point {
    public int x, y; // Campos públicos que representan las coordenadas del punto

    public Point(int x, int y) { // Constructor que recibe los valores de x e y
        this.x = x; // Inicializa el campo x con el valor recibido
        this.y = y; // Inicializa el campo y con el valor recibido
    }

    public void draw() { // Método público que dibuja el punto
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")"); // Imprime las coordenadas del punto en la consola
    }

}

public class Circle extends Point { // La clase Circle hereda de la clase Point
    public int radius; // Campo público que representa el radio del círculo

    public Circle(int x, int y, int radius) { // Constructor que recibe los valores de x, y y radius
        super(x, y); // Llama al constructor de la clase base Point para inicializar los campos x e y
        this.radius = radius; // Inicializa el campo radius con el valor recibido
    }

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el círculo
        super.draw(); // Llama al método draw() de la clase base Point para dibujar el punto donde está el centro del círculo
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius); // Imprime las coordenadas del círculo y su radio en la consola
    }
}

public class Rectangle extends Point { // La clase Rectangle hereda de la clase Point
    public int width, height; // Campos públicos que representan el ancho y alto del rectángulo

    public Rectangle(int x, int y, int width, int height) { // Constructor que recibe los valores de x, y, width y height
        super(x, y); // Llama al constructor de la clase base Point para inicializar los campos x e y
        this.width = width; // Inicializa el campo width con el valor recibido
        this.height = height; // Inicializa el campo height con el valor recibido
    }

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la clase Point
    public void draw() { // Método público que dibuja el rectángulo
        super.draw(); // Llama al método draw() de la clase base Point para dibujar el punto donde está el centro del rectángulo
        System.out.println("Dibujando un rectángulo en (" + x + ", " + y + ") con ancho " + width + " y alto " + height); // Imprime las coordenadas del rectángulo, su ancho y alto en la consola
    }
}

public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 2); // Crea un objeto de la clase Point con coordenadas (1, 2)
        Circle c = new Circle(3, 4, 5); // Crea un objeto de la clase Circle con coordenadas (3, 4) y radio 5
        Rectangle r = new Rectangle(6, 7, 8, 9); // Crea un objeto de la clase Rectangle con coordenadas (6, 7), ancho 8 y alto 9

        p.draw(); // Llama al método draw() del objeto Point
        c.draw(); // Llama al método draw() del objeto Circle
        r.draw(); // Llama al método draw() del objeto Rectangle

        int areaCircle = ((Circle) c).area(); // Convierte el objeto c a Circle y llama al método area()
        int areaRectangle = ((Rectangle) r).area(); // Convierte el objeto r a

        System.out.println("Área del círculo: " + areaCircle); // Imprime el área del círculo en la consola
        System.out.println("Área del rectángulo: " + areaRectangle); // Imprime el área del rectángulo en la consola
    }
}
```

Como pudiste observar, hemos definido constructores en las clases `Point`, `Circle` y `Rectangle` que nos permiten
inicializar los campos de cada objeto al momento de crearlos. Al definir un constructor, ya no se genera un constructor
por defecto, por lo que si queremos crear un objeto sin pasarle parámetros, debemos definir un constructor sin
parámetros explícitamente. Por ejemplo, podemos definir un constructor sin parámetros en la clase `Point` que inicialice
los campos `x` e `y` con valores predeterminados, a esto se le llama sobrecarga de constructores, que consiste en
definir múltiples constructores con diferentes listas de parámetros en la misma clase, lo que nos permite crear objetos
de la misma clase de diferentes maneras.

```java
public class Point {
    public int x, y; // Campos públicos que representan las coordenadas del punto

    public Point() { // Constructor sin parámetros que inicializa los campos x e y con valores predeterminados
        this.x = 0; // Inicializa el campo x con el valor 0
        this.y = 0; // Inicializa el campo y con el valor 0
    }

    public Point(int x, int y) { // Constructor que recibe los valores de x e y
        this.x = x; // Inicializa el campo x con el valor recibido
        this.y = y; // Inicializa el campo y con el valor recibido
    }

    public void draw() { // Método público que dibuja el punto
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")"); // Imprime las coordenadas del punto en la consola
    }
}
```

#### Los constructores no se heredan

Hemos mencionado que cuando declaro una clase derivada, esta hereda los campos y métodos de la clase base, pero no
hereda los constructores. Esto significa que si queremos crear un objeto de la clase derivada, debemos definir un
constructor en la clase derivada que llame al constructor de la clase base utilizando el identificador `super`. Si no
definimos un constructor en la clase derivada, el compilador generará un constructor por defecto que llamará al
constructor por defecto de la clase base. Sin embargo, si la clase base no tiene un constructor por defecto, el
compilador generará un error de compilación. Por lo tanto, es importante definir un constructor en la clase derivada que
llame al constructor de la clase base con los parámetros adecuados.

En el ejemplo anterior, si hubiéramos definido el constructor solamente en la clase `Point` que recibe los parámetros
`x` e `y`, y no hubiéramos definido un constructor sin parámetros, al intentar crear un objeto de la clase `Circle` o
`Rectangle` llamando al constructor sin parámetros, obtendríamos un error de compilación de incompatibilidad, ya que el
constructor por defecto de la clase `Point` no existe que es el que intentará ser llamado por las clases `Circle` o
`Rectangle`. Por lo tanto, es importante definir un constructor en la clase derivada que llame al constructor de la
clase base con los parámetros adecuados, o definir un constructor sin parámetros en la clase base para que el compilador
genere un constructor por defecto en la clase derivada.

### Destructores e Interfaces

#### Destructores

En otros lenguajes orientados a objetos existe la definición de destructores, que son métodos especiales que se llaman
automáticamente cuando un objeto es destruido o liberado de memoria. Su propósito principal es liberar los recursos que
el objeto pueda haber adquirido durante su ciclo de vida, como memoria dinámica, archivos abiertos, conexiones de red,
etc. Sin embargo, en Java no existen destructores como tal, ya que el lenguaje utiliza un recolector de basura (Garbage
Collector) que se encarga de liberar la memoria ocupada por los objetos que ya no son referenciados. Por lo tanto, no es
necesario definir destructores en Java, ya que el recolector de basura se encarga de liberar la memoria automáticamente.

Como hemos mencionado, todos los objetos en Java derivan de la clase `Object`, que es la superclase de todas las clases
en Java. La clase `Object` define un método llamado `finalize()`, que es llamado por el recolector de basura antes de
liberar la memoria ocupada por un objeto. Sin embargo, el método `finalize()` está obsoleto desde Java 9 y no se
recomienda su uso, ya que no garantiza que los recursos sean liberados de manera oportuna y puede generar problemas de
rendimiento.

#### Interfaces

Cuando hablamos de herencia, mencionamos que una clase puede heredar de otra clase, pero en Java también existe el
concepto de interfaces, que son un tipo especial de clase que define un contrato o una serie de métodos que una clase
debe implementar. Una interfaz no puede contener implementación de métodos, solo la firma de los métodos, es decir, el
nombre del método, los parámetros y el tipo de retorno. Una clase puede implementar múltiples interfaces, lo que permite
una forma de herencia múltiple en Java. Las interfaces son útiles para definir un conjunto de métodos que deben ser
implementados por diferentes clases, lo que permite una mayor flexibilidad y reutilización de código.

Tomando como ejemplo las clases `Point`, `Circle` y `Rectangle`, podemos definir una interfaz llamada `Drawable` que
define un método llamado `draw()`, que debe ser implementado por las clases que implementen la interfaz. Esto nos
permite definir un contrato que garantiza que todas las clases que implementen la interfaz `Drawable` tendrán un método
`draw()` que puede ser llamado de manera polimórfica.

```java
public interface Drawable { // Definición de la interfaz Drawable
    void draw(); // Método abstracto que debe ser implementado por las clases que implementen
}

public class Point implements Drawable { // La clase Point implementa la interfaz Drawable
    public int x, y; // Campos públicos que representan las coordenadas del punto

    public Point(int x, int y) { // Constructor que recibe los valores de x e y
        this.x = x; // Inicializa el campo x con el valor recibido
        this.y = y; // Inicializa el campo y con el valor recibido
    }

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la interfaz Drawable
    public void draw() { // Método público que dibuja el punto
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")"); // Imprime las coordenadas del punto en la consola
    }
}

public class Circle extends Point implements Drawable { // La clase Circle hereda de la clase Point e implementa la interfaz Drawable
    public int radius; // Campo público que representa el radio del círculo

    public Circle(int x, int y, int radius) { // Constructor que recibe los valores de x, y y radius
        super(x, y); // Llama al constructor de la clase base Point para inicializar los campos x e y
        this.radius = radius; // Inicializa el campo radius con el valor recibido
    }

    @Override // Anotación que indica que estamos sobrescribiendo el método draw() de la interfaz Drawable
    public void draw() { // Método público que dibuja el círculo
        super.draw(); // Llama al método draw() de la clase base Point para dibujar el punto donde está el centro del círculo
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius); // Imprime las coordenadas del círculo y su radio en la consola
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[3]; // Crea un arreglo de objetos de tipo Drawable con capacidad para 3 elementos
        drawables[0] = new Point(1, 2); // Asigna un objeto de la clase Point al primer elemento del arreglo
        drawables[1] = new Circle(3, 4, 5); // Asigna un objeto de la clase Circle al segundo elemento del arreglo
        drawables[2] = new Rectangle(6, 7, 8, 9); // Asigna un objeto de la clase Rectangle al tercer elemento del arreglo

        for (Drawable d : drawables) { // Itera sobre cada objeto en el arreglo de drawables
            d.draw(); // Llama al método draw() del objeto actual, demostrando polimorfismo
        }
    }
}
```

A diferencia de la herencia, una clase puede implementar las interfaces que sean necesarias.

Como pudiste observar, para crear una interfaz en Java, utilizamos la palabra clave `interface`, seguida del nombre de
la interfaz. Dentro de la interfaz, definimos los métodos que deben ser implementados por las clases que implementen la
interfaz. Para implementar una interfaz en una clase, utilizamos la palabra clave `implements`, seguida del nombre de la
interfaz. La clase debe proporcionar una implementación para todos los métodos definidos en la interfaz, de lo
contrario, la clase debe ser declarada como abstracta.

Las interfaces pueden ser utilizadas como un tipo de dato, de tal manera que podemos crear arreglos o colecciones de
objetos que implementen la misma interfaz, y llamar a los métodos definidos en la interfaz de manera polimórfica, sin
importar la clase específica del objeto.

#### Interfaces: Métodos default

A partir de Java 8, las interfaces pueden contener métodos con implementación, llamados métodos `default`. Esto permite
que las interfaces puedan proporcionar una implementación predeterminada para un método, de tal manera que las clases
que implementen la interfaz no estén obligadas a proporcionar su propia implementación del método, a menos que deseen
sobrescribirlo. Los métodos `default` son útiles para agregar nuevas funcionalidades a las interfaces sin romper la
compatibilidad con las clases que ya implementan la interfaz.

Continuando con el ejemplo de la interfaz `Drawable`, podemos agregar un método `default` llamado `moveTo(int x, int y)`
que permite mover un objeto a una nueva posición en el plano cartesiano. Este método puede ser implementado de manera
predeterminada en la interfaz, y las clases que implementen la interfaz pueden sobrescribirlo si desean proporcionar su
propia implementación.

```java
public interface Drawable { // Definición de la interfaz Drawable
    void draw(); // Método abstracto que debe ser implementado por las clases que implementen

    default void moveTo(int x, int y) { // Método default que permite mover un objeto a una nueva posición en el plano cartesiano
        System.out.println("Moviendo a (" + x + ", " + y + ")");
    }
}
```

#### Interfaces: Declaración de una interface

El siguiente ejemplo muestra cómo se declara una interface:

```java
public interface GenericInterface extends Interface1, Interface2 { // Definición de la interfaz GenericInterface que hereda de las interfaces Interface1 e Interface2
    public void method1(); // Método abstracto que debe ser implementado por las clases que implementen la interfaz

    String method2(); // Método abstracto que debe ser implementado por las clases que implementen la interfaz

    default void method3() { // Método default que puede ser sobrescrito por las clases que implementen la interfaz
        System.out.println("Método default de la interfaz GenericInterface");
    }

    static void staticMethod() { // Método static que puede ser llamado sin necesidad de crear un objeto de la interfaz
        System.out.println("Método static de la interfaz GenericInterface");
    }

    abstract void abstractMethod(); // Método abstracto que debe ser implementado por las clases que implementen la interfaz

    double PI = 3.14159; // Campo constante que puede ser utilizado por las clases que implementen la interfaz
}
```

En una interface, todos los métodos son públicos y abstractos por defecto, a menos que sean declarados como `default` o
`static`. Los campos son públicos, estáticos y finales por defecto, lo que significa que son constantes y no pueden ser
modificados. Las interfaces no pueden contener constructores, ya que no pueden ser instanciadas directamente. Sin
embargo, pueden ser implementadas por clases que proporcionen una implementación para los métodos definidos en la
interfaz. Una clase puede implementar múltiples interfaces, lo que permite una forma de herencia múltiple en Java.

Aunque en las interfaces se pueden declarar campos que por default son públicos, estáticos y finales, no es recomendable
declarar campos en las interfaces, ya que esto se considera una mala práctica de programación. Aunque Java 8 lo permite,
esto es algo que en la práctica no se ve, ya que las interfaces están pensadas para definir un contrato de métodos que
deben ser implementados por las clases que implementen la interfaz, y no para almacenar datos. En su lugar, se
recomienda utilizar clases abstractas o clases concretas para almacenar datos y proporcionar métodos para acceder a
ellos. Las interfaces deben centrarse en definir el comportamiento que se espera de las clases que las implementan, y no
en almacenar datos.