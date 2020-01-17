/*
O programa abaixo gera saída somente o valor 1.0, independente dos
valores. Identifique o erro.
*/

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 double x1, y1, x2, y2, distancia;

 System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
 x1 = teclado.nextFloat();
 y1 = teclado.nextFloat();
 x2 = teclado.nextFloat();
 y2 = teclado.nextFloat();

 distancia = Math.pow(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0),1/2);
 System.out.println("A distância é: " + distancia);
 }
}

/*
Resposta: O valor 1/2 no Math.pow (linha 18) corresponde a uma divisão inteira de 1 para 2, que resulta em zero. E qualquer valor elevado a zero é um.
*/
