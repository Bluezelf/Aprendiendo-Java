package test;

import domain.Persona;

public class ForEach {
    public static void main(String[] args) {
        int edades[] = {3, 4, 5, 6};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Jose")};
        for (Persona personita: personas){
            System.out.println(personita);
        }
    }
}

// Una manera más sencilla de poder recorrer un arreglo