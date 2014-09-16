import java.util.Scanner;

public class Problem3LongestOddEvenSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		line = line.substring(line.indexOf('(') + 1);
		line = line.trim();
		String[] numbers = line.split("[ ()]+");
		
		int maxSequence = 1;
		int currentSequence = 1;
		int lastNumber = Integer.valueOf(numbers[0]);
		boolean even = Integer.valueOf(numbers[0]) % 2 == 0;

		for (int i = 1 ; i < numbers.length ; i++) {
			
			if (Integer.valueOf(numbers[i]) == 0) {
				currentSequence++;
				even = !even;
			}
			else if (lastNumber == 0 ) {
				if ((even && Integer.valueOf(numbers[i]) % 2 != 0) || !even && Integer.valueOf(numbers[i]) % 2 == 0) {
					currentSequence++;	
				}
				else {
					maxSequence = currentSequence > maxSequence ? currentSequence : maxSequence;
					currentSequence = 1;
				}
				even = Integer.valueOf(numbers[i]) % 2 == 0;			
			}
			else if (((lastNumber % 2 == 0) && (Math.abs(Integer.valueOf(numbers[i])) % 2 == 1))
					|| ((Math.abs(lastNumber % 2) == 1) && (Integer.valueOf(numbers[i]) % 2 == 0))) {				
				currentSequence++;	
				even = Integer.valueOf(numbers[i]) % 2 == 0;
			}
			else {
				maxSequence = currentSequence > maxSequence ? currentSequence : maxSequence;
				currentSequence = 1;
				even = Integer.valueOf(numbers[i]) % 2 == 0;
			}
			lastNumber = Integer.valueOf(numbers[i]);
		}
		
		maxSequence = currentSequence > maxSequence ? currentSequence : maxSequence;
		System.out.println(maxSequence);
		input.close();
	}
}