package Questao21;



public class Emprestimo {

    public Emprestimo(Livro book, Pessoa people){
        realizarEmprestimo(book, people);
    }

    public void realizarEmprestimo(Livro book, Pessoa people) {
        if(people.verificaEmprestimoAtivo() == true) {
            System.out.println("O usuário " + people.nome + " possui um empréstimo ativo. Não é possível realizar o empréstimo de mais de um livro ao mesmo tempo.");        }
        else if(book.estaDisponivel() == false) {
            System.out.println("O livro "+ book.livro + " não está disponível. Atualmente este livro está com " + book.emprestadoPara);
        }
        else {
            book.disponivel = false;
            people.possuiEmprestimo = true;
            book.emprestadoPara = people.nome;
            people.livroEmprestado = book.livro;
            System.out.println("O livro " + book.livro + " foi emprestado para " + people.nome + " com sucesso.");

        }
    }

    public void devolverEmprestimo(Livro book, Pessoa people) {
        if(people.verificaEmprestimoAtivo() == true) {
            people.possuiEmprestimo = false;
            book.emprestadoPara = "";
            people.livroEmprestado = "";
            book.disponivel = true;
            System.out.println("O livro " + book.livro + " foi devolvido com sucesso por " + people.nome);
        }
    }
}
