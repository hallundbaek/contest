import java.util.Scanner;


public class E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		scanner.close();
		if (a.equals(b)) {
			System.out.println(0);
			return;
		}
		int x = 0;
		while (x < b.length() && x < a.length() && a.charAt(x) == b.charAt(x)) {
			x++;
		}
		int y = 0;
		while (a.charAt(a.length() - y - 1) == b.charAt(b.length() - y - 1) && a.length() - y > x && b.length() - y > x) {
			y++;
		}
		System.out.println(b.length() - x - y);
		
	}

}
