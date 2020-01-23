package Questao21;

import java.util.Scanner;

public class Livro {
    public String livro;
    public String autor;
    public boolean disponivel = true;
    
    public Livro() {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o nome do livro: ");
        livro = tec.nextLine();
        System.out.print("Digite o nome do autor: ");
        autor = tec.nextLine();
        
    }
    
    public void exibeLivro(){
        System.out.print(livro);
    }
    
    public void exibeAutor(){
        System.out.print(autor);
    }
    
    public boolean estaDisponivel(){
        return disponivel;
    }
}
