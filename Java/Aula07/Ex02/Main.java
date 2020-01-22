package Ex02;

public class Main {
    public static void main(String[] args) {
        final int TAM = 10;
        Pessoa[] lista;
        lista = new Pessoa[TAM];
        for(int i = 0; i < TAM; i++){
            lista[i] = new Pessoa();
        }
    }
}
