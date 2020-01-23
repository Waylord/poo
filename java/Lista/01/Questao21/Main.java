package Questao21;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Livro model = new Livro();
        Pessoa user = new Pessoa();
        model.exibeLivro();
        System.out.print(", por ");
        model.exibeAutor();
        System.out.println();
        System.out.println("Disponibilidade: " + (model.estaDisponivel()? "Sim" : "Não"));
        
        System.out.print("Interessado: ");
        user.exibeNomePessoa();
        System.out.print(", Telefone: ");
        user.exibeTelefonePessoa();


    }
}
