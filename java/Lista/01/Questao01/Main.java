/*
Lista de exercicios 1 - Questao 01
Este programa calcula as raizes de uma equação de segundo grau, 
onde ax² + bx + c = 0;
@author = Jair Ribeiro
*/

import java.util.Scanner;

public class Main {
    public static int delta(int a, int b, int c){
        return ((b * b) - (4 * a * c));
    }
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        a = teclado.nextInt();
        System.out.print("Digite o valor de b: ");
        b = teclado.nextInt();
        System.out.print("Digite o valor de c: ");
        c = teclado.nextInt();
        
        System.out.println("As raízes da equação " + a + "x² + " + b + "x + " + c + " são:");
        double raiz_neg = ((-b) - Math.pow(delta(a, b, c), 0.5)) / (2 * a);
        System.out.println("Raiz 1: " + raiz_neg);
        double raiz_pos = ((-b) + Math.pow(delta(a, b, c), 0.5)) / (2 * a);
        System.out.println("Raiz 2: " + raiz_pos);
        teclado.close();
    }
}
