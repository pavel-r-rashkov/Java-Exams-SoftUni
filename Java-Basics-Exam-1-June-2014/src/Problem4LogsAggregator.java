import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class Problem4LogsAggregator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		HashMap<String, Integer> duration = new HashMap<String, Integer>();
		TreeMap<String, TreeSet<String>> ips = new TreeMap<String, TreeSet<String>>();
		
		for (int i = 0 ; i < n ; i++) {
			String[] tokens = input.nextLine().split(" ");
			
			Integer value = duration.get(tokens[1]);
			if (!duration.containsKey(tokens[1])) {
				value = 0;
			}
			duration.put(tokens[1], value + Integer.valueOf(tokens[2]));
			
			TreeSet<String> ipsList = ips.get(tokens[1]);
			if (!ips.containsKey(tokens[1])) {
				ipsList = new TreeSet<String>();
			}
			ipsList.add(tokens[0]);
			ips.put(tokens[1], ipsList);
		}
		
		for (Map.Entry<String, TreeSet<String>> entry : ips.entrySet()) {
			System.out.print(entry.getKey() + ": " + duration.get(entry.getKey()) + " [");
			String ip = String.join(", ", entry.getValue());
			System.out.print(ip + "]");
			System.out.println();
		}
		
		input.close();
	}
}
