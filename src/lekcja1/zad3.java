package lekcja1;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Napisz program, który odczytuje liczbê typu double i na ekran wypisuje ca³kowit¹
		wartoœæ tej liczby. */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj liczbe double");
		double x = sc.nextDouble();
		sc.close();
		
		int y = (int)x;
		
		
		System.out.println(y);
	}

}
