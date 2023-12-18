# Argumentos Variables
Para que una función pueda acceder a varios parámetros, pero sin saber cuantos parámetros recibir hasta el momento de la ejecución
se hace uso de los _Argumentos Variables_, con ellos podemos poner en la misma funcion 3 o 9 argumentos, sin necesidad de crear 2 funciones diferentes, el funcionamiento
es sencillo, simplemente a la hora que se desea crear esta función ponemos el tipo de dato y luego le siguen `...`, esto hará que cuando pongamos los argumentos, estos
se comporten en conjunto como un __Arreglo__, por ejemplo:
```java
private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento:" + numeros[i]);
        }
    }
```
En esta función ponemos como argumento `(int... numeros)`, es decir que va a aceptar numeros como parámetro, luego de ellos los imprime y hace uso de las métodos de un arreglo,
el código completo sería:
```java
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,3,4,5,6,7);
    }

    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento:" + numeros[i]);
        }
    }
}
```
Y el output:
```
Elemento:2
Elemento:3
Elemento:4
Elemento:5
Elemento:6
Elemento:7
```