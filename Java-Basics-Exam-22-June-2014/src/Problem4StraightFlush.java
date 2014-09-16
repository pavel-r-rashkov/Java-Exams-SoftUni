
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4StraightFlush {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] hand = input.nextLine().split("[ ,]+");
		ArrayList<String> cards = new ArrayList<String>(Arrays.asList("2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD", "*",
				"2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AH", "*",
				"2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC", "*",
				"2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS", "*"));
		
		boolean answer = false;
		
		for (int i = 0 ; i < hand.length ; i++) {
			if (Arrays.asList(hand).contains(cards.get(cards.indexOf(hand[i]) + 1))
					&& Arrays.asList(hand).contains(cards.get(cards.indexOf(hand[i]) + 2)) 
					&& Arrays.asList(hand).contains(cards.get(cards.indexOf(hand[i]) + 3))
					&& Arrays.asList(hand).contains(cards.get(cards.indexOf(hand[i]) + 4))) {
				answer = true;
				System.out.printf("[%1$s, %2$s, %3$s, %4$s, %5$s]", hand[i], cards.get(cards.indexOf(hand[i]) + 1),
						cards.get(cards.indexOf(hand[i]) + 2), cards.get(cards.indexOf(hand[i]) + 3),
						cards.get(cards.indexOf(hand[i]) + 4));
				System.out.println();
			}
		}
		if (!answer) {
			System.out.println("No Straight Flushes");
		}
		
		input.close();
	}
}
