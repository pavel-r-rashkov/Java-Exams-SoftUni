import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem1CognateWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		ArrayList<String> words = new ArrayList<String>();
		boolean answer = false;
		HashSet<String> output = new HashSet<String>();
		
		Pattern p = Pattern.compile("([A-Za-z]+)");
		Matcher m = p.matcher(line);
		
		while (m.find()) {
			String token = m.group(1);
			words.add(token);
		}

		for (int a = 0 ; a < words.size() ; a++) {
			for (int b = 0 ; b < words.size() ; b++) {
				for (int c = 0 ; c < words.size() ; c++) {
					if (b == a || c == a || c == b) {
						continue;
					}
					
					String leftSide = words.get(a) + words.get(b);
					String rightSide = words.get(c);
					if (leftSide.equals(rightSide)) {
						answer = true;
						output.add(words.get(a) + "|" + words.get(b) + "=" + words.get(c));
					}
				}
			}
		}
		for (String str : output) {
			System.out.println(str);
		}
		
		if (!answer) {
			System.out.println("No");
		}
		input.close();
	}
}
