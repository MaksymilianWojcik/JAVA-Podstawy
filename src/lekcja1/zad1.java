package lekcja1;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.println("Podaj x: ");
		x = sc.nextInt();
		System.out.println("Podaj y: ");
		y = sc.nextInt();
		
		sc.close();
		
		System.out.println("Wynik to: " + (x+y));

	}

}
