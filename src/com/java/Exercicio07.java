package com.java;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		int quantidade = 0;

		System.out.println("Informe um n�mero: ");
		num = sc.nextInt();

		while (i<=num) {
			if (num%i==0)
				quantidade++;

			i++;

		}
		
		if(quantidade<=2)
		{
		 	System.out.println("O n�mero " + num + " � primo. ");
		}
		 else 
		 	{
		 		System.out.println("O n�mero " + num + " n�o � primo. ");
		}
	}
	
}



