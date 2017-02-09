package lekcja1;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj wiek: ");
		int age = sc.nextInt();
		sc.close();
		
		if (age >= 18){
			System.out.println("Jestes osoba pelnoletnia");
		} else {
			System.out.println("Nie jestes osoba pelnoletnia");
		}

	}

}
