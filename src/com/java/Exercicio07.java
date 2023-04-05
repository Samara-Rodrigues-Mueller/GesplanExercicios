package com.java;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		int quantidade = 0;

		System.out.println("Informe um número: ");
		num = sc.nextInt();

		while (i<=num) {
			if (num%i==0)
				quantidade++;

			i++;

		}
		
		if(quantidade<=2)
		{
		 	System.out.println("O número " + num + " é primo. ");
		}
		 else 
		 	{
		 		System.out.println("O número " + num + " não é primo. ");
		}
	}
	
}



