/*
Este programa realiza o cálculo e imprime a sequência Fibonacci.
*/

package Questao08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int tamanho = 2, aux, a = 0, b = 1;
        
        System.out.print("Lista Fibonacci: ");
        if(tamanho == 1)
            System.out.print("0");
        else if(tamanho > 1){
            tamanho -= 2;
            System.out.print("0, 1");
            for(int i = 0; i < tamanho; i++){
                aux = b;
                b += a;
                a = aux;
                System.out.print(", " + b);
            }
        }
    }
}
