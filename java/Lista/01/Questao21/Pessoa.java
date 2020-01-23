package Questao21;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public long cpf;
    public long telefone;
    public boolean possuiEmprestimo = false;
    
    public Pessoa(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        nome = tec.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cpf = tec.nextLong();
        System.out.print("Digite o telefone do cliente (somente numeros com DDD): ");
        telefone = tec.nextLong();
    }
    
    public void exibeNomePessoa(){
        System.out.print(nome);
    }
    
    public void exibeCpfPessoa(){
        System.out.print(cpf);
    }
    
    public void exibeTelefonePessoa(){
        System.out.print(telefone);
    }
    
    public boolean verificaEmprestimoAtivo(){
        return possuiEmprestimo;
    }
}
