
import java.util.Arrays;
import java.util.Scanner;

public class Problem2PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine());
	    double[] numbers = new double[n];
		boolean hasAnswer = false;
		
		for (int i = 0 ; i < n ; i++) {
			numbers[i] = Double.valueOf(input.nextLine());
		}
	    Arrays.sort(numbers);
	    
	    for (int i = 0 ; i < n ; i++) {
	    	
	    	for (int j = i  ; j < n ; j++) {
	    		double ab = Math.pow(numbers[i], 2)  + Math.pow(numbers[j], 2);	   		
	    		
	    		for (int q = j ; q < n ; q++) {
	    			if (numbers[q] == Math.sqrt(ab)) {
		    			System.out.printf("%1$s*%1$s + %2$s*%2$s = %3$s*%3$s", (int)numbers[i], (int)numbers[j], (int)numbers[q]);
		    			System.out.println();
		    			hasAnswer = true;
		    		}
	    		}    		
	    	}
	    }
	    if (!hasAnswer) {
	    	System.out.println("No");
	    }
	    
	    input.close();
	}

}
