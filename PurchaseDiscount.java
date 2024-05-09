package branchingandlooping;

import java.util.Scanner;

public class PurchaseDiscount {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount = d.nextDouble();
		d.close();
		
		double discount = 0.0;
		if(purchaseAmount < 500) {
			
		}
		else if(purchaseAmount >= 500 && purchaseAmount <= 1000){
			discount = 0.10 * purchaseAmount;
		}
		else {
			discount = 0.20 * purchaseAmount;
		}
		
		double finalAmount = purchaseAmount - discount;
		System.out.println("Final payable amount after discount: " + finalAmount);
		
	}

}
