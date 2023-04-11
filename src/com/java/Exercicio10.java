package com.java;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
	String palavra = "esse";
	String palavraInversa = "";
	
	for (int i = palavra.length() -1; i>=0; i--) {
		
		palavraInversa = palavraInversa + palavra.charAt(i);
	}
	 
	  boolean palindromo = palavra.equals(palavraInversa);
	  
	  System.out.println("É um palíndromo? " + palindromo);
	}
}

