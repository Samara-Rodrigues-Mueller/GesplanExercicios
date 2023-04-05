package com.java;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		System.out.println("Informe um número para calcular o fatorial: ");
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		long fatorial = 1;
		int i = 1;

		while (i <=numero) {
			fatorial = fatorial*i;
			i++;

		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}

}
