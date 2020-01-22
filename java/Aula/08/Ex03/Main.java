import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Opções: ");
        System.out.println();
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.println();
        System.out.print("Qual opção você deseja? ");
        
        return teclado.nextInt();
    }
    
    public static double recebeValor(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        return teclado.nextDouble();
    }
    
    public static void main(String[] args){
        int opcao;
        Double valor = 0.0;
        Calculadora c = new Calculadora(0, 0, 1);
        do{
            System.out.println("Estado da memória: " + c.exibeMemoria());
            opcao = menu();
            if(opcao != 6){
                valor = recebeValor();
                c.Calculadora(c.exibeMemoria(), valor, opcao);
            }
        }while(opcao != 6);
    }
}
