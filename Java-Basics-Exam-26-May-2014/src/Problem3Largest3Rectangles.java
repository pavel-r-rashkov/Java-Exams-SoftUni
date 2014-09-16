import java.util.Scanner;

public class Problem3Largest3Rectangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		line = line.substring(line.indexOf('[') + 1);
		line = line.trim();
		String[] sides = line.split("[x \\[\\]]+");
		int maxArea = 0;
		
		for (int i = 0 ; i <= sides.length - 6; i += 2) {

			int firstRec = Integer.valueOf(sides[i]) * Integer.valueOf(sides[i + 1]);
			int secondRec = Integer.valueOf(sides[i + 2]) * Integer.valueOf(sides[i + 3]);
			int thirdRec = Integer.valueOf(sides[i + 4]) * Integer.valueOf(sides[i + 5]);
			int area = firstRec + secondRec + thirdRec;
			
			if (area > maxArea) {
				maxArea = area;
			}
		}
		System.out.println(maxArea);
		
		input.close();
	}

}
