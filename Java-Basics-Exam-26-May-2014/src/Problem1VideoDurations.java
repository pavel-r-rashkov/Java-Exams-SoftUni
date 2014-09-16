import java.util.Scanner;

public class Problem1VideoDurations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			
			if (line.equals("End")) {
				break;
			}
			String[] tokens = line.split(":");
			hours += Integer.valueOf(tokens[0]);
			minutes += Integer.valueOf(tokens[1]);
		}
		
		System.out.printf("%1$s:%2$02d",(hours + minutes / 60), minutes % 60);
		input.close();
	}

}
