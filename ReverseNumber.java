package branchingandlooping;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[]) {
		
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = d.nextInt();
		d.close();
		
		int reversedNumber = reverseNumber(number);
		System.out.println("Reversed number: " + reversedNumber);

	}
public static int reverseNumber(int number) {
	int reversedNumber = 0;
	while(number != 0) {
		int digit = number % 10;
		reversedNumber =reversedNumber * 10 + digit;
		number /= 10;
	}
	return reversedNumber;
}
}
