package com.java;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de N: ");

		int N = sc.nextInt();

		int soma = 0;
		for (int i=1; i<=N; i++) {
			soma = soma + i;

		}
		System.out.println ("Soma dos números: "+soma);

		sc.close();
	}
}



