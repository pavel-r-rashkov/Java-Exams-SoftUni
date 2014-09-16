import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4CouplesFrequency {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		String[] numbers = input.nextLine().split(" ");
		double couplesCount = numbers.length - 1;
		LinkedHashMap<String, Integer> couplesFreq = new LinkedHashMap<String, Integer>();		
		
		for (int i = 0 ; i < couplesCount ; i++) {
			String couple = numbers[i] + " " + numbers[i + 1];
			Integer count = couplesFreq.get(couple);
			
			if (!couplesFreq.containsKey(couple)) {
				count = 0;
			}
			couplesFreq.put(couple, count + 1);
		}
		
		for (Map.Entry<String, Integer> entry : couplesFreq.entrySet()) {
			System.out.printf("%1$s -> %2$.2f%%", entry.getKey(), (entry.getValue() * 100 / couplesCount));
			System.out.println();
		}
		input.close();
	}

}
