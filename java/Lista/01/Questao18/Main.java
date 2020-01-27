/*
Escreva um número por extenso aceitando números de até 9 dígitos, usando métodos para
as traduções e vetores de Strings que guardam cada tradução (ex.: unidades = { “zero”,
“um”, “dois”, ..., “nove” }).
*/

package Questao18;

import java.util.Scanner;

class Main {
    public static String milhao(int valor) {
        if(valor / 1000000 > 0) {
            if(valor / 1000000 == 1)
                return " milhão";
            else
                return " milhões";
        }
        return "";
    }

    public static String milhar(int valor) {
        if(valor / 1000 > 0) {
            return " mil";
        }
        return "";
    }

    public static String centena(int valor) {
        if(((valor / 100) % 10) > 0) {
            String[] centena = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
            
            if((((valor / 100) % 10) == 1) && (valor % 100 == 0))
                return "cem";
            else
                return centena[((valor / 100) % 10) - 1];
        }
        return "";
    }

    public static boolean checaEntreDezEVinte(int valor){
        if((20 > valor % 100) && (valor % 100 > 10))
            return true;
        else
            return false;
    }

    public static String dezena(int valor) {
        if(((valor / 10) % 10) > 0) {
            String[] dezena = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

            if((20 > valor % 100) && (valor % 100 > 10)) {
                String[] entreDezEVinte = {"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
                return entreDezEVinte[(valor % 100 / 10) - 1];
            }
            else
                return dezena[((valor / 10) % 10) - 1];
        }
        return "";
    }

    public static String unidade(int valor) {
        if(checaEntreDezEVinte(valor) == true)
            return "";
        else if(valor % 10 > 0) {
            String[] unidade = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            return unidade[valor % 10 - 1];
        }
        else
            return "";
    }

    public static void valorPorExtenso(int valor){
        String centenaMilhao = centena(valor / 1000000),
               dezenaMilhao = dezena(valor / 1000000),
               unidadeMilhao = unidade(valor / 1000000),
               centenaMilhar = centena(valor / 1000),
               dezenaMilhar = dezena(valor / 1000),
               unidadeMilhar = unidade(valor / 1000),
               centena = centena(valor),
               dezena = dezena(valor),
               unidade = unidade(valor);

        //Imprimir ordem de milhão
        System.out.print(centenaMilhao);
        if(dezenaMilhao.length() > 0)
            System.out.print(" e ");
        System.out.print(dezenaMilhao);
        if(unidadeMilhao.length() > 0)
            System.out.print(" e ");
        System.out.print(unidadeMilhao);
        System.out.print(milhao(valor));

        //Impressão de preposição de ligação
        if(centenaMilhar.length() > 0 && (dezenaMilhar.length() > 0 || unidadeMilhar.length() > 0))
            System.out.print(", ");
        else if(centenaMilhar.length() > 0 ^ (dezenaMilhar.length() > 0 || unidade.length() > 0))
            System.out.print(" e ");
        else
            System.out.print("");

        //Imprime ordem de milhar
        System.out.print(centenaMilhar);
        if(dezenaMilhar.length() > 0)
            System.out.print(" e ");
        System.out.print(dezenaMilhar);
        if(unidadeMilhar.length() > 0)
            System.out.print(" e ");
        System.out.print(unidadeMilhar);
        System.out.print(milhar(valor));

        //Impressão de preposição de ligação
        if(centena.length() > 0 && (dezena.length() > 0 || unidade.length() > 0))
            System.out.print(", ");
        else if(centena.length() > 0 ^ (dezena.length() > 0 && unidade.length() > 0))
            System.out.print(" e ");
        else
            System.out.print("");

        //Imprime ordem de unidades
        System.out.print(centena);
        if(dezena.length() > 0)
            System.out.print(" e ");
        System.out.print(dezena);
        if(unidade.length() > 0)
            System.out.print(" e ");
        System.out.print(unidade);
    }

    public static void main(String[] args) {
        int valor;
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite o valor: ");
        valor = t.nextInt();
        
        valorPorExtenso(valor);
    }
}
