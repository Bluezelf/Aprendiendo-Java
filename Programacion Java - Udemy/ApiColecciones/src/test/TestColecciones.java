package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        // Instancio un objeto ArrayList implementando la interfaz List, si recuerda el orden el cual han sido los elementos agregados
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

//        for(Object elemento: miLista){
//            System.out.println("elemento = " + elemento);
//        }

        // Podemos hacer uso de función Lambda o también llamado función flecha
        // Usando función Lambda - (argumentos) -> EXPRESIÓN
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
