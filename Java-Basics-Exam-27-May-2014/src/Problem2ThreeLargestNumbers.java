import java.math.BigDecimal;
import java.util.Scanner;

public class Problem2ThreeLargestNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.valueOf(input.nextLine());
		String minV = "-1" + new String(new char[100]).replace("\0", "0");

		BigDecimal first = new BigDecimal(minV);
		BigDecimal second = new BigDecimal(minV);
		BigDecimal third = new BigDecimal(minV);
		
		for (int i = 0; i < n ; i++) {
			String line = input.nextLine();
			BigDecimal number = new BigDecimal(line);
			
			if (number.compareTo(first) == 1 ) {
				third = second;
				second = first;
				first = number;			
			}
			else if (number.compareTo(second) == 1 ) {
				third = second;
				second = number;				
			}
			else if (number.compareTo(third) == 1 ) {
				third = number;			
			}
		}
		
		System.out.println(first.toPlainString());
		if (n != 1 ) {
			System.out.println(second.toPlainString());
		}
		if (n != 1 && n !=2) {
			System.out.println(third.toPlainString());
		}
		
		input.close();
	}
}
