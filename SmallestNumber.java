package branchingandlooping;

import java.util.Scanner;

public class SmallestNumber {
public static void main(String args[]) {
	Scanner d =  new Scanner(System.in);
	System.out.println("Enter three numbers: ");
	double num1 = d.nextDouble();
	double num2 = d.nextDouble();
	double num3 = d.nextDouble();
	d.close();
	
	double smallest = findSmallest(num1, num2, num3);
	System.out.println("The Smallest number is: " + smallest);
	
}

public static double findSmallest(double num1, double num2, double num3) {
	double smallest = num1;
	if(num2 < smallest) {
		smallest = num2;
	}
	if(num3 < smallest) {
		smallest = num3;
	}
	return smallest;
}
}
