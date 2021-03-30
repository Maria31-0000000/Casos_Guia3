package com.senati.eti;

import java.util.Scanner;

public class tcaso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		int i = 1, factorial = 1 ;
		
		
		while (i <= n && n < 8) {
			factorial *= i; 

		 if (i < n)
			System.out.print(i + " * ");

			else 
				System.out.println(i + " = " + factorial);
			
			i++;
			

		}
		if(n >= 8)
			System.out.println("El numero es superior de 7 ");
		else
		System.out.println("El factorial es: " + factorial);

		}
		
	}




