package Questao20;

import java.util.Scanner;

public class Agenda {
	final int MAX = 5;
	String nome;
	Scanner t = new Scanner(System.in);
	
	public String SetNomeAgenda(){
		System.out.print("Digite um nome para essa agenda: ");
		this.nome = t.nextLine();
	}
	
	public String GetNomeAgenda(){
		return nome;
	}	
	
}
