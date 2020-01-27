/*
Leia  um  número  decimal  (até  3  dígitos)  e  escreva  o  seu  equivalente  em  numeração romana. 
Utilize métodospara  obter  cada  dígito  do  número  decimal  e  para  a transformação de numeração
decimal para romana (Dica1: 1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1.000 = M; Dica2:
utilize um vetor guardando a tradução para cada um dos dígitos).
*/

package Questao17;


import java.util.Scanner;

class Main {
    public static String centenaRomano(int valor) {
        String[] centena = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        return centena[valor - 1];
    }

    public static String dezenaRomano(int valor) {
        String[] dezena = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "IX"};
        return dezena[valor - 1];
    }
        
    public static String unidadeRomano(int valor) {
        String[] unidade = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return unidade[valor - 1];
    }

    public static void imprimirRomano(int[] vetor) {
        System.out.println("Valor: " + centenaRomano(vetor[0]) + dezenaRomano(vetor[1]) + unidadeRomano(vetor[2]));
    }

    public static void valorParaVetor(int valor) {
        int[] vetor = new int[3];
        for(int i = 2; i >= 0; i--) {
            vetor[i] = valor % 10;
            valor /= 10;
        }
        imprimirRomano(vetor);
    }

    public static void main(String[] args) {
        int valor;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o valor que deseja converter para romanos (até 999): ");
        valor = t.nextInt();
        valorParaVetor(valor);

    }
}
