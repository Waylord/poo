package Questao06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt(),
            counter = 1;
        
        while(valor > 9){
            counter++;
            valor /= 10;
        }
        
        System.out.println("O valor digitado possui " + counter + " dígitos.");
        teclado.close();
    }
}
