package lekcja1;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stwórz program, który odczytujê dan¹ liczbê i sprawdza czy jest podzielna przez 4.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj liczbe: ");
		int x = sc.nextInt();
		sc.close();
		
		if (x % 4 == 0){
			System.out.println("Liczba jest podzielna przez 4");
		} else {
			System.out.println("Liczba nie jest podzielna przez 4");
		}

	}

}
