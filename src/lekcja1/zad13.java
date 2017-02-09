package lekcja1;

public class zad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisz program, który wypisuje co drug¹ literê imienia.
		
		String name = "maksymilian";
		
		for (int i = 1; i<=name.length()-1; i+=2){
			System.out.print(name.charAt(i));
		}
	}

}
