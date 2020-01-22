package Questao13;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            vetor[i] = (random.nextInt());
        }
        int aux;
        for(int x = 0; x < 100; x++){
            for(int y = x; y < 100; y++){
                if(vetor[x] > vetor[y]){
                    aux = vetor[x];
                    vetor[x] = vetor[y];
                    vetor[y] = aux;
                }
            }
            System.out.println(vetor[x]);
        }
    }
}
