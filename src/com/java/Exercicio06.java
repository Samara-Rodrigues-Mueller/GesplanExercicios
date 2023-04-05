package com.java;

public class Exercicio06 {

	public static void main(String[] args) {

		int []num = new int [3];
		num [0] = 7;
		num [1] = 8;
		num [2] = 6;

		int media = 0;
		for (int i = 0; i<num.length; i++){
			media += num[i];
		}
		float resultado = media / num.length;

		System.out.println("A média é: " +resultado);

	}
}
