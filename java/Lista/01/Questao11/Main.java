package Questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, b, margem;
        int a;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        valor = teclado.nextDouble();
        System.out.print("Digite a margem de erro máxima aceitável: ");
        margem = teclado.nextDouble();
        
        a = (int) valor;
        while(Math.abs((valor) - (a * a)) > margem){
            b = valor / a;
            b += a;
            a = b / 2;
        }
        System.out.println("A raiz quadrada aproximada de " + valor + " é " + a);
        teclado.close();
    }
}
