import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int inversions = scanner.nextInt();
		String string1 = scanner.next();
		String string2 = scanner.next();
		scanner.close();
		int length = string1.length();
		if (inversions % 2 == 0) {
			if (string1.equals(string2)) {
				System.out.println("Deletion succeeded");
				return;
			} else {
				System.out.println("Deletion failed");
				return;
			}
		} else {
			boolean flag = true;
			for (int i = 0; i < length; i++) {
				if (string1.charAt(i) == string2.charAt(i)) {
					System.out.println("Deletion failed");
					flag = false;
					break;
				}
				if (flag == true) {
					System.out.println("Deletion succeeded");
					return;
				}
			}
		}
	}
}
