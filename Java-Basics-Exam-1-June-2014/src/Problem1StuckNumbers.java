import java.util.Scanner;


public class Problem1StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] numbers = input.nextLine().split(" ");
		boolean hasAnswer = false;
		
		for (int a = 0 ; a < n ; a++) {
			
			for (int b = 0 ; b < n ; b++) {
				
				for (int c = 0 ; c < n ; c++) {
								
					for (int d = 0 ; d < n ; d++) {
						
						if (a == b || a == c || a == d || b == c || b == d || c == d) {
							continue;
						}
							
						String leftSide = numbers[a] + numbers[b];
						String rightSide = numbers[c] + numbers[d];
						if (leftSide.equals(rightSide)) {
							System.out.printf("%1$s|%2$s==%3$s|%4$s", numbers[a], numbers[b], numbers[c], numbers[d]);
							System.out.println();
							hasAnswer = true;
						}
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
