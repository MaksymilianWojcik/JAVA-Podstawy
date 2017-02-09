package lekcja1;

import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisz program, który odczytuje imiê i sprawdza czy jest ono palindromem.

		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		sc.close();
		String wordReversed= "";
		
		for (int i = word.length()-1; i >= 0; i--){
			//System.out.print(word.charAt(i));
			wordReversed += word.charAt(i);
		}
		System.out.println("");
		
		if (word.equals(wordReversed)){
			System.out.println("Slowo jest palindromem");
		} else {
			System.out.println("Slowo nie jest palindromem");
		}
	}

}
