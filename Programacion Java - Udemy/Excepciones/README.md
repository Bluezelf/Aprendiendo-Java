# Manejo de Excepciones en Java
En el ámbito del desarrollo de software, nosotros como desarrolladores debemos de tener un buen control del flujo de nuestro código, saber reparar `errores` y a su vez manejarlos
es primordial, por eso en este repositorio explicaremos más a detalle como es el proceso de __Manejo de Excepciones en Java__

Tenemos el ejemplo en el cual queremos ver que una división entre 0 da error, por lo cual en el siguiente programa:
```java
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        }catch (Exception e){
            System.out.println("Ocurrió un error:");
            e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }
}
```
Tenemos el bloque de código que nos dará una excepción, por lo cual para que nuestro programa no termine de forma abrupta lo encerramos en un `try-catch`, de esta manera
tenemos un mejor control del flujo de nuestro programa.

## Creando nuestra propia excepción
Ahora nosotros mismos podemos crear nuestra propia excepción, como por ejemplo la de la división entre 0, para que directamente nos indique que es una división entre 0.

Tenemos nuestra propia clase de `OperacionExcepcion` la cual extiende de `Excepcion`:
```java
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
```
Seguido de eso creamos nuestra clase `Aritmetica` y va a hacer uso de esta nueva excepción creada:
```java
public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if(denominador == 0){
            throw new OperacionExcepcion("Division entre 0");
        }
        return numerador / denominador;
    }
}
```
Definimos el método `division` que toma 2 parámetros, y agregamos la palabra clave `throws`, esto indica que el método puede devolver una excepción.
Dentro del `if` observamos que si el denominador es igual a `0` nos botará una excepción del tipo `OperacionExcepcion` (La que acabamos de crear) y dentro de ella ponemos el mensaje
que queremos que nos dé. Pero si el denominador no es `0` simplemente retorna la división.
