package branchingandlooping;
public class NumberPrinter {
    
	public static void main(String[] args) {
       
        System.out.println("Using for loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }

        
        System.out.println("\nUsing while loop:");
        int j = 10;
        while (j <= 50) {
            System.out.println(j);
            j++;
        }
    }
}