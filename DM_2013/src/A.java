import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int seeds = scanner.nextInt();
		int highest = 0;
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < seeds; i++) {
			array.add(scanner.nextInt());
		}
		scanner.close();
		Collections.sort(array);
		Collections.reverse(array);
		
		int days = 2;
		for (int index = 0; index < seeds; index++) {
			if (array.get(index) + days > highest) {
				highest = array.get(index) + days;
			}
			days++;
		}
		System.out.println(highest);
	}
}
