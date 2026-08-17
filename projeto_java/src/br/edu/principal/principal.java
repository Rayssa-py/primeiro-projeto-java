package br.edu.principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		String nome;
		double n1, n2, media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("digite N2: ");
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		
		System.out.println("Nome: " + nome + " | Média: " + media);
		
	}
}
