import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3SimpleExpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		line = line.trim();
		String[] numbers = line.split("[\\+\\- ]+");
		ArrayList<String> signs = new ArrayList<String>();
		
		Pattern p = Pattern.compile("([\\-\\+])");
		Matcher m = p.matcher(line);
		
		while(m.find())
		{
		  String token = m.group( 1 );    
		  signs.add(token);
		}
		
		BigDecimal sum = new BigDecimal(numbers[0]);
		for (int i = 0 ; i < signs.size() ; i++) {
			
			if (signs.get(i).equals("+")) {
				BigDecimal num = new BigDecimal(numbers[i + 1]);
				sum = sum.add(num);
			}
			else {
				BigDecimal num = new BigDecimal(numbers[i + 1]);
				sum = sum.subtract(num);
			}
		}
		System.out.printf("%1$s", sum.toPlainString());
		
		input.close();
	}

}
