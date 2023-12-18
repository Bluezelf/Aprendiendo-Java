package domain;

abstract class Figura {
    abstract void dibujar();

    public void redimensionar() {
        System.out.println("Redimensionando la figura");
    }
}
