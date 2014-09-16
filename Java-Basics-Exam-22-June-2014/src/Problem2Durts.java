import java.util.Scanner;


public class Problem2Durts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cX = input.nextInt();
		int cY = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();		
		
		for (int i = 0 ; i < n ; i++) {
			int dX = input.nextInt();
			int dY = input.nextInt();
			
			if (dX <= cX + r && dX >= cX - r && dY <= cY + r - r / 2 && dY >= cY - r + r / 2) {
				System.out.println("yes");
			}
			else if (dX <= cX + r - r / 2 && dX >= cX - r + r / 2 && dY >= cY - r && dY <= cY + r) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		input.close();
	}

}
