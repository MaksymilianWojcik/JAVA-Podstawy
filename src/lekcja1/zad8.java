package lekcja1;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisz program, który oblicza silniê
		
		int silnia = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj liczbe: ");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = 1; i<=x; i++){
			silnia *= i;
			System.out.println("Dla i = " + i + " silni wynosi: " + silnia);
		}
		
		System.out.println(silnia);
		

	}

}
