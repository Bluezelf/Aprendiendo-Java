package test;

import domain.Circulo;

public class testAbstracClass {
    public static void main(String[] args) {
        // No podemos instanciar una clase Figura, ya que es abstracta
        // Pero si podemos instanciar Circulo, ya que esta implementando la clase abstracta
        Circulo circulo = new Circulo();
        circulo.dibujar();
        circulo.redimensionar();
    }
}
