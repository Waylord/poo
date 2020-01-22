/*
Leia do usuário o tempo em segundos e escreva em horas, minutos e segundos. Utilize 
cinco  métodos,  para  a  leitura  e  escrita  de  dados  e  para  obtenção  de  horas,  minutos  e 
segundos a partir do tempo em segun
dos. 
*/

Package Questao16;

import java.util.Scanner;

class Main {
    public static int segundoParaHora(int valor){
        return (valor / 3600);
    }

    public static int segundoParaMinuto(int valor){
        return (valor / 60 % 60);
    }

    public static int segundoParaSegundoEmHorario(int valor){
        return (valor % 60);
    }

    public static int entradaUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor em segundos: ");
        return teclado.nextInt();
    }

    public static void imprimeHorario(int segundos){
        int h = segundoParaHora(segundos),
            m = segundoParaMinuto(segundos),
            s = segundoParaSegundoEmHorario(segundos);
        System.out.println(segundos + " segundos equivalem a " + h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        int segundos = entradaUsuario();
        imprimeHorario(segundos);
    }
}
