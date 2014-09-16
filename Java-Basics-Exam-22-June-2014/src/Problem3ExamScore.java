
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Problem3ExamScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line;
		
		for (int i = 0 ; i < 3 ; i++) {
			line = input.nextLine();
		}
		
		TreeMap<Integer, TreeMap<String, Double>> examData = new TreeMap<Integer, TreeMap<String, Double>>(); 
		
		while (true) {
			line = input.nextLine();
			if (line.charAt(0) == '-') {
				break;
			}
			
			line = line.substring(2);
			String[] tokens = line.split("[ \\|]+");

			TreeMap<String, Double> scoreStudents = examData.get(Integer.valueOf(tokens[2]));
			if (!examData.containsKey(Integer.valueOf(tokens[2]))) {
				scoreStudents = new TreeMap<String, Double>();
			}
			
			scoreStudents.put(tokens[0] + " " + tokens[1], Double.valueOf(tokens[3]));
			
			examData.put(Integer.valueOf(tokens[2]), scoreStudents);
		}
		
		for (Map.Entry<Integer, TreeMap<String, Double>> entry : examData.entrySet()) {
			System.out.print(entry.getKey() + " -> [");
			TreeMap<String, Double> students = entry.getValue();
			System.out.print(String.join(", ", students.keySet()) + "]; avg=");	
			Collection<Double> grades = students.values();
			double sum = 0;
			for (double grade : grades) {
				sum += grade;
			}
			System.out.printf("%1$.2f", (sum / grades.size()));
			System.out.println();
		}
		
		input.close();
	}
}
