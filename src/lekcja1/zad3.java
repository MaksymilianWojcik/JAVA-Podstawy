package lekcja1;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Napisz program, kt�ry odczytuje liczb� typu double i na ekran wypisuje ca�kowit�
		warto�� tej liczby. */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj liczbe double");
		double x = sc.nextDouble();
		sc.close();
		
		int y = (int)x;
		
		
		System.out.println(y);
	}

}
