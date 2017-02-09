package lekcja1;

import java.util.Scanner;

public class zad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz program, który odczytuje napis i wypisuje go wspak.

		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Podaj imie: ");
		String name = sc.next();
		sc.close();
		
		StringBuilder nameReversed = new StringBuilder(name);
		System.out.println(nameReversed.reverse());
		
	}

}
