package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estático - Se ejecuta solo 1 vez al principio de todo
    static{
        System.out.println("Ejecución Bloque Estático");
        ++Persona.contadorPersonas;
    }

    // Se ejecuta cada vez que instanciemos un objeto de la clase Persona
    {
        System.out.println("Ejecución de bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
