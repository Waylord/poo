package Questao01;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Pessoa filho = new Pessoa(),
               mae = new Pessoa (),
               pai = new Pessoa (),
               avoMaterna = new Pessoa (),
               avoMaterno = new Pessoa (),
               avoPaterna = new Pessoa (),
               avoPaterno = new Pessoa ();

        filho.associar Pai (pai);
        filho.associar Mae (mae);
        mae.associar Pai (avô Materno);
        mae.associar Mãe (avó Materna);
        pai.associar Pai (avô Paterno);
        pai.associar Mãe (avó Paterna);
    }
}
