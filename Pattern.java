package branchingandlooping;

public class Pattern {

	public static void main(String[] args) {
	int n = 5; 

		 for (int i = n; i >= 1; i--) {
		            
		 for (int j = n; j >= 1; j--) {
		                
			 System.out.print(Math.min(i, j) + " ");
		  }
		     
		     System.out.println();
		 }
	}
}
