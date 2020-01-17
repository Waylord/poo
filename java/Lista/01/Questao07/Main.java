/*
Considere os programas a seguir, que leem um código repetidamente e imprimem o
código lido até que o código lido seja igual a -1. O código -1 não deve ser impresso.
a. Qual das duas soluções é a correta?
b. Como a solução incorreta poderia ser corrigida?
*/

//Programa A
import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        
        System.out.println("Informe o código: ");
        codigo = teclado.nextInt();
        while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();
        }
    }
}

//Programa B
import java.util.Scanner;
public class Codigo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        
        do {
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            System.out.println("Código: " + codigo);
        }while (codigo != -1);
    }
}

/*
Resposta:
a) A solução correta é o programa A.
b) Para corrigir o programa B, pode-se incluir a seguinte condição após a linha 34: if(codigo == -1) break;
*/
