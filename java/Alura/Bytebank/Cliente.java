package bytebank;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Scanner t = new Scanner(System.in);

    public Cliente(){
        System.out.print("Informe o nome completo do cliente: ");
        setNome(t.nextLine());
        System.out.print("Digite o CPF do cliente: ");
        setCPF(t.nextLine());
        System.out.print("Informe a profissão do cliente: ");
        setProfissao(t.nextLine());
    }

    //Getters e Setters
    String getNome() {
        return this.nome;
    }

    String getCPF() {
        return this.cpf;
    }

    String getProfissao() {
        return this.profissao;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCPF(String cpf) {
        this.cpf = cpf;
    }

    void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
