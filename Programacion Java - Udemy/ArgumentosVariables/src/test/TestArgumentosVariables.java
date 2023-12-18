package test;

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
