/*
Para cada produto informado (nome, preço e quantidade), escreva o nome do produto
comprado e o valor total a ser pago, considerando que são oferecidos descontos pelo
número de unidades compradas, segundo a tabela abaixo:
a. Até 10 unidades: valor total
b. de 11 a 20 unidades: 10% de desconto
c. de 21 a 50 unidades: 20% de desconto
d. acima de 50 unidades: 25% de desconto
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double valor;
        int qtd;
        String nome;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escreva o nome do produto: ");
        nome = teclado.next();
        System.out.print("Digite o valor unitário do produto: ");
        valor = teclado.nextInt();
        System.out.print("Digite a quantidade adquirida: ");
        qtd = teclado.nextInt();

        if(qtd > 50)
            valor *= qtd * 0.75;
        else if(qtd > 20)
            valor *= qtd * 0.80;
        else if(qtd > 10)
            valor *= qtd * 0.90;
        else
            valor *= qtd;
        
        System.out.println("Produto " + nome);
        System.out.print("Valor total: " + valor);
        teclado.close();
    }
}
