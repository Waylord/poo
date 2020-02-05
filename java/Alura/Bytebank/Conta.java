package bytebank;

import java.util.Scanner;

class Conta {
    private double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente titular;
    Scanner t = new Scanner(System.in);

    //Construtor
    public Conta(){
        System.out.print("Digite o número da conta: ");
        this.numero = t.nextInt();
        t.nextLine(); //Remove quebra de linha no Scanner;
    }


    //Metodos operacionais
    public void deposito(double valor) {
        this.saldo += valor;
    }

    public boolean saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true; 
        }
        return false;
    }

    public boolean transferencia(double valor, Conta destino) {
        if(saldo >= valor){
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        }
        return false;
    }

    //Getters e Setters
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente pessoa) {
        this.titular = pessoa;
    }
}
