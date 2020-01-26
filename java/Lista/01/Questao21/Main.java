package Questao21;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        /* O código cadastra duas pessoas e tenta emprestar o mesmo livro entre elas,
        retorna erro, a primeira devolve o livro e a segunda consegue realizar o emprestimo. */
        Livro book = new Livro();
        Pessoa user = new Pessoa();
        Pessoa user2 = new Pessoa();
        Emprestimo lending = new Emprestimo(book, user);
        lending.realizarEmprestimo(book, user2);
        lending.devolverEmprestimo(book, user);
        lending.realizarEmprestimo(book,user2);

    }
}
