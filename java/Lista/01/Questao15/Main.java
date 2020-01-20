package Questao15;

import java.util.Scanner;

public class Main {
    public static float media(float p1, float p2) {
        return (p1 + p2) / 2;
    }

    public static String resultado(float p1, float p2) {
        float nota = media(p1, p2);
        if(nota > 6)
            return "Aprovado";
        else if(nota > 4)
            return "Verificação Suplementar";
        else
            return "Reprovado";
    }

    public static void main(String[] args) {
        float p1, p2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a nota da P1: ");
        p1 = teclado.nextFloat();
        System.out.print("Digite a nota da P2: ");
        p2 = teclado.nextFloat();
        
        System.out.print("Resultado: "+resultado(p1, p2));
        teclado.close();
    }
}
