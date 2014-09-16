import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4Orders {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine());
		LinkedHashMap<String, TreeMap<String, Integer>> orders = new LinkedHashMap<String, TreeMap<String, Integer>>(); 
		
		for (int i = 0 ; i < n ; i++) {
			String[] tokens = input.nextLine().split(" ");
			
			TreeMap<String, Integer> customer = orders.get(tokens[2]);	
			
			if (!orders.containsKey(tokens[2])) {
				customer = new TreeMap<String, Integer>();
			}
			
			Integer value = customer.get(tokens[0]);
		
			if (!customer.containsKey(tokens[0])) {
				value = 0;
			}
			customer.put(tokens[0], value + Integer.valueOf(tokens[1]));
			
			orders.put(tokens[2], customer);
		}
		
		for (Map.Entry<String, TreeMap<String, Integer>> entry : orders.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			TreeMap<String, Integer> customer = entry.getValue();
			ArrayList<String> customerCount = new ArrayList<String>();
			
			for (Map.Entry<String, Integer> ent : customer.entrySet()) {
				
				customerCount.add(ent.getKey() + " " + ent.getValue());
			}
			System.out.println(String.join(", ", customerCount));
		}
		
		input.close();
	}
}
