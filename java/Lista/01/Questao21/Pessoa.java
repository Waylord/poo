package Questao21;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public long cpf;
    public long telefone;
    public boolean possuiEmprestimo = false;
    public String livroEmprestado;
    
    public Pessoa(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        nome = tec.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cpf = tec.nextLong();
        System.out.print("Digite o telefone do cliente (somente numeros com DDD): ");
        telefone = tec.nextLong();
    }
    
    public String exibeNomePessoa(){
        return nome;
    }
    
    public long exibeCpfPessoa(){
        return cpf;
    }
    
    public long exibeTelefonePessoa(){
        return telefone;
    }
    
    public boolean verificaEmprestimoAtivo(){
        return possuiEmprestimo;
    }
}
