package lekcja1;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz program, kt�ry odczytuj� imi� i wypisuj� na ekran ostatni� liter� imienia.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj imie:");
		String imie = sc.next();
		sc.close();
		
		char lastLetter = imie.charAt(imie.length()-1);
		
		System.out.println("ostatnia litera imienia to: " + lastLetter);
	}

}
