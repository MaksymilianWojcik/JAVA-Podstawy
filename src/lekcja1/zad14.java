package lekcja1;

import java.util.Scanner;

public class zad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Napisz program, który odczytuje dany wyraz z konsoli tak d³ugo a¿ natrafi na
poprawnie wprowadzone has³o */
		
		String haslo = "haslo";
		Scanner sc = new Scanner(System.in);
		String text = "";
		
		do{
			System.out.println("Podaj haslo: ");
			text = sc.next();
			
		} while (text != haslo);
		sc.close();
		
		
		
	}

}
