package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases Envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
         */
        // Al proceso de usar una clase envolvente en vez de un tipo primitivo es AUTOBOXING, esto lo hacemos con la finalidad
        // de poder tener mas métodos y trabajar directamente con un objeto, ya que con el tipo primitivo es muy limitado
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());

        // Ahora creamos la variable entero2 el cual será de tipo primitivo y solo va a tomar el valor del objeto entero, a este proceso se le llama UNBOXING
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}

// Cada tipo primitivo tiene una clase Envolvente o Wrapper