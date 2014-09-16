import java.util.Arrays;
import java.util.Scanner;

public class Problem2SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cards = input.nextLine().split(" ");
		int sum = 0;
		
		String[] values = {"*", "*", "2", "3", "4", "5", "6", "7", "8", "9", 
				"10", "*", "J", "Q", "K", "A" };
		
		for (int i = 0 ; i < cards.length ; i++) {
			String face = cards[i].substring(0, cards[i].length() - 1);
			int value;
			
			if (i - 1 >= 0 && face.equals(cards[i - 1].substring(0, cards[i - 1].length() - 1))) {
				value = 2 * (Arrays.asList(values).indexOf(face));
			}
			else if (i + 1 < cards.length && face.equals(cards[i + 1].substring(0, cards[i + 1].length() - 1))) {
				value = 2 * (Arrays.asList(values).indexOf(face));
			}
			else {
				value = (Arrays.asList(values).indexOf(face));
			}
			sum += value;
		}
		System.out.println(sum);
		
		input.close();
	}
}
