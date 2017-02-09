package lekcja1;

import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz program, który odczytuje 2 zmienne i zamienia je.
		// Dla chêtnych: bez u¿ywania zmiennej pomocniczej.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj 2 liczby oddzielone spacja: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
					// np 200 | 100
		x = x + y;  //    300 | 100
		y = x - y;  //    300 | 200 
		x = x - y;	//	  100 | 200 
		
		System.out.println(x + " " + y);

	}

}
