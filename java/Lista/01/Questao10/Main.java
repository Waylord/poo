/*
Calcule o retorno de um investimento financeiro fazendo as contas mês a mês, sem usar a
fórmula de juros compostos. O usuário deve informar quanto será investido por mês e
qual será a taxa de juros mensal. O programa deve informar o saldo do investimento após
um ano (soma das aplicações mês a mês considerando os juros compostos), e perguntar ao
usuário se ele deseja que seja calculado o ano seguinte, sucessivamente. Por exemplo,
caso o usuário deseje investir R$ 100,00 por mês, e tenha uma taxa de juros de 1% ao mês,
o programa forneceria a seguinte saída:
Saldo do investimento após 1 ano: 1280.9328043328942
Deseja processar mais um ano? (S/N)
*/

package Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char again = 'N';
        float c, i, m = 0;
        int t = 12;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor a ser investido: ");
        c = teclado.nextFloat();
        System.out.print("Informe a taxa de juros mensal: ");
        i = teclado.nextFloat();
        
        do{
            for(int x = 0; x < t; x++){
                m = (m + c) * (1+ i);
            }
            System.out.println("Saldo do investimento após 1 ano: " + m);
            System.out.print("Deseja processar mais um ano? (S/N) ");
            again = teclado.next().toUpperCase().charAt(0);
            
        }while(again == 'S');
        teclado.close();
    }
}
