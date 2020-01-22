package Lista;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Pessoa {
    public String nome;
    public int idade;
    
    public Pessoa(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        nome = tec.nextLine();
        System.out.print("Digite a idade de " + nome + ": ");
        idade = tec.nextInt();
    }
}
