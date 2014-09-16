import java.util.Scanner;

public class Problem1CountBeers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stacks = 0;
		int beers = 0;
		
		while (true) {
			String line = input.nextLine();
			
			if (line.equals("End")) {
				break;
			}
			String[] tokens = line.split(" ");
			
			if (tokens[1].equals("beers")) {
				beers += Integer.valueOf(tokens[0]);
			}
			else {
				stacks += Integer.valueOf(tokens[0]);
			}			
		}
		System.out.printf("%1$s stacks + %2$s beers", (stacks + beers / 20), (beers % 20));
		
		input.close();
	}
}
