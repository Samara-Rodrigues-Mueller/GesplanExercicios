package com.java;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);{

			int number1;

			System.out.println("Informe um número: ");
			number1 = sc.nextInt();

			if (number1%2 == 0)
			{
				System.out.println("O número é par.");
			}
			else 
			{
				System.out.println("O número é ímpar.");
			}

		}
	}
}

