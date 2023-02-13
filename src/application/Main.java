package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			String[] vect = scan.nextLine().split(" ");
			int n = scan.nextInt();
			
			System.out.println(vect[n]);
		} catch (InputMismatchException e) {
			System.out.println("Only integer number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong position");
		}
		
		System.out.println("End of program");
		
		scan.close();
	}
}
