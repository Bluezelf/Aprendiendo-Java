package test;

import enumeracion.Continentes;
import enumeracion.Dias;

import java.sql.SQLOutput;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente nro. 4: " + Continentes.AMERICA);
        System.out.println("Nro. de paises del 4to continente " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
        }
    }
}
