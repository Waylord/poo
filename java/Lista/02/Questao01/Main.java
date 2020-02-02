/*
Faça um programa para representar a árvore genealógica de uma família. Para tal, crie
uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em
mente que pai e mãe também são do tipo Pessoa.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pessoa filho = new Pessoa(),
			   mae = new Pessoa(),
			   pai = new Pessoa(),
			   avoMaterna = new Pessoa(),
			   avoMaterno = new Pessoa(),
			   avoPaterna = new Pessoa(),
			   avoPaterno = new Pessoa();
		
		filho.associarPai(pai);
		filho.associarMae(mae);
		mae.associarPai(avoMaterno);
		mae.associarMae(avoMaterna);
		pai.associarPai(avoPaterno);
		pai.associarMae(avoPaterna);

        System.out.println("Último descendente: " + filho.getNomePessoa());
        System.out.println();
        System.out.println("Pai: " + filho.mostrarNomePai());
        System.out.println("Avô paterno: " + pai.mostrarNomePai());
        System.out.println("Avó paterna: " + pai.mostrarNomeMae());
        System.out.println();
        System.out.println("Mãe: " + filho.mostrarNomeMae());
        System.out.println("Avô materno: " + mae.mostrarNomePai());
        System.out.println("Avó materna: " + mae.mostrarNomeMae());
        
	}
}
