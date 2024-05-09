package branchingandlooping;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String args[]){
		
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = d.nextInt();
		
		if(number < 0) {
			System.out.println("The number is negative");
		}
		else if(number > 0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is zero");
		}
		d.close();
	}
}
