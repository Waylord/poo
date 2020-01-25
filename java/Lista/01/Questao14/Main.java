package Questao14;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        final int TAM = 50;
        int[] vetor1 = new int[TAM],
              vetor2 = new int[TAM],
              vetor_final = new int[TAM * 2];
        Random random = new Random();

        for(int i = 0; i < TAM; i++) {
            vetor1[i] = random.nextInt();
            vetor2[i] = random.nextInt();
        }
        
        //Ordena os dois vetores
        int aux;
        for(int x = 0; x < TAM; x++) {
            for(int y = x; y < TAM; y++) {
                if(vetor1[x] > vetor1[y]) {
                    aux = vetor1[x];
                    vetor1[x] = vetor1[y];
                    vetor1[y] = aux;
                }

                if(vetor2[x] > vetor2[y]) {
                    aux = vetor2[x];
                    vetor2[x] = vetor2[y];
                    vetor2[y] = aux;
                }
            }
        }

        int index1 = 0,
            index2 = 0,
            index3 = 0;

        System.out.println("Lista: ");
        while(index3 < (TAM * 2)){
            if(index1 < TAM) {
                if(index2 < TAM) {
                    if(vetor1[index1] < vetor2[index2]) {
                        vetor_final[index3] = vetor1[index1];
                        index1++;
                    }
                    else if(vetor1[index1] > vetor2[index2]) {
                        vetor_final[index3] = vetor2[index2];
                        index2++;
                    }
                    else {
                        vetor_final[index3] = vetor1[index1];
                        index1++;
                        index3++;
                        vetor_final[index3] = vetor2[index2];
                        index2++;
                    }
                }
                else {
                    vetor_final[index3] = vetor1[index1];
                    index1++;
                }
            }
            else {
                vetor_final[index3] = vetor2[index2];
                index2++;
            }

            System.out.println(index3 + ": " + vetor_final[index3]);
            index3++;
        }
    }
}
