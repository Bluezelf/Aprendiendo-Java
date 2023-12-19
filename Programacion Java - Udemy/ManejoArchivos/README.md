# Manejo de Archivos
## Creación del Archivo
En este ejercicio veremos raudamente como es que se crea un archivo dentro de Java
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
}
```
Tenemos esa estructura, primero debemos de crear una instancia de la clase `File`, la cual llamaremos `archivo` y dentro del parámetro del constructor pondremos su nombre
luego encerramos en un bloque `try-catch` el proceso para escribir en ese archivo, ya que de no hacerlo el IDE nos marcará error, ahora instanciamos un objeto de la clase
`PrintWriter` para __Escribir__ en el archivo, le ponemos como parametro el objeto que instanciamos de `File` y para poder finalizar y que realmente se escriba el archivo dentro del disco
ponemos `salida.close()`
## Escritura del Archivo
