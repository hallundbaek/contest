import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		String string3 = scanner.nextLine();
		String string4 = scanner.nextLine();
		String string5 = scanner.nextLine();
		scanner.close();
		int hej = 0;
		int multudutu = 1;
		for (int i = string1.length() - 3 ; i >= 0; i -= 4) {
			switch (string1.substring(i, i + 3) + string2.substring(i, i + 3) + string3.substring(i, i + 3) + string4.substring(i, i + 3) + string5.substring(i, i + 3)) {
			case "**** ** ** ****":
				hej += multudutu * 0;
				multudutu *= 10;
				break;
			case "  *  *  *  *  *":
				hej += multudutu * 1;
				multudutu *= 10;
				break;
			case "***  *****  ***":
				hej += multudutu * 2;
				multudutu *= 10;
				break;
			case "***  ****  ****":
				hej += multudutu * 3;
				multudutu *= 10;
				break;
			case "* ** ****  *  *":
				hej += multudutu * 4;
				multudutu *= 10;
				break;
			case "****  ***  ****":
				hej += multudutu * 5;
				multudutu *= 10;
				break;
			case "****  **** ****":
				hej += multudutu * 6;
				multudutu *= 10;
				break;
			case "***  *  *  *  *":
				hej += multudutu * 7;
				multudutu *= 10;
				break;
			case "**** ***** ****":
				hej += multudutu * 8;
				multudutu *= 10;
				break;
			case "**** ****  ****":
				hej += multudutu * 9;
				multudutu *= 10;
				break;
				default:
					break;
			}
		}
		if (hej % 6 == 0) {
			System.out.println("BEER!!");
		} else {
			System.out.println("BOOM!!");
		}
	}

}
