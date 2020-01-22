/*
Faça um método que calcule a média de um aluno de acordo com o critério definido neste 
curso. Além disso, faça um outro método que informe o status do aluno de acordo com a 
tabela a seguir:
Nota acima de 6 - “Aprovado”
Nota entre 4 e 6 - Conceito “Verificação Suplementar”
Nota abaixo de 4 - Conceito “Reprovado”
*/

import java.util.Scanner;

public class Main {
    public static float media(float p1, float p2) {
        float nota = (p1 + p2) / 2;
        System.out.println("Nota: "+nota);
        return nota;
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
