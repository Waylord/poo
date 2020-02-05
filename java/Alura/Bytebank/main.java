package bytebank;

class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        Conta contadoPaulo = new Conta();
        contadoPaulo.vinculaCliente(paulo);
        contadoPaulo.deposito(100);
        contadoPaulo.deposito(50);
        System.out.println(contadoPaulo.getSaldo());

        boolean sucessoDeSaque = contadoPaulo.saque(20);
        System.out.println(contadoPaulo.getSaldo());
        System.out.println(sucessoDeSaque);

        Conta contadaMarcela = new Conta();
        Cliente marcela = new Cliente();
        contadaMarcela.vinculaCliente(marcela);
        contadaMarcela.deposito(1000);

        contadaMarcela.transferencia(300, contadoPaulo);
        System.out.println("Saldo " + marcela.getNome() + ": " + contadaMarcela.getSaldo());
        System.out.println("Saldo " + paulo.getNome() + ":  " + contadoPaulo.getSaldo());
    }
}
