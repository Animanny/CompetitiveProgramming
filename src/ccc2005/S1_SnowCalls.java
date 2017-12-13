package ccc2005;
import java.util.Scanner;

public class S1_SnowCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for (int x = 0; x <= b; x++) {
			String in = sc.nextLine();
			String out = null;
			for (int i = 0; i <= 10; i++) {
				if (String.valueOf(in.charAt(i)) == "2" || String.valueOf(in.charAt(i)) == "A"
						|| String.valueOf(in.charAt(i)) == "B" || String.valueOf(in.charAt(i)) == "C") {
					out = out + "2";
				} else if (String.valueOf(in.charAt(i)) == "3" || String.valueOf(in.charAt(i)) == "D"
						|| String.valueOf(in.charAt(i)) == "E" || String.valueOf(in.charAt(i)) == "F") {
					out = out + "3";
				} else if (String.valueOf(in.charAt(i)) == "4" || String.valueOf(in.charAt(i)) == "G"
						|| String.valueOf(in.charAt(i)) == "H" || String.valueOf(in.charAt(i)) == "I") {
					out = out + "4";
				} else if (String.valueOf(in.charAt(i)) == "5" || String.valueOf(in.charAt(i)) == "J"
						|| String.valueOf(in.charAt(i)) == "K" || String.valueOf(in.charAt(i)) == "L") {
					out = out + "5";
				} else if (String.valueOf(in.charAt(i)) == "6" || String.valueOf(in.charAt(i)) == "M"
						|| String.valueOf(in.charAt(i)) == "N" || String.valueOf(in.charAt(i)) == "O") {
					out = out + "6";
				} else if (String.valueOf(in.charAt(i)) == "7" || String.valueOf(in.charAt(i)) == "P"
						|| String.valueOf(in.charAt(i)) == "Q" || String.valueOf(in.charAt(i)) == "R"
						|| String.valueOf(in.charAt(i)) == "S") {
					out = out + "7";
				} else if (String.valueOf(in.charAt(i)) == "8" || String.valueOf(in.charAt(i)) == "T"
						|| String.valueOf(in.charAt(i)) == "U" || String.valueOf(in.charAt(i)) == "V") {
					out = out + "8";
				} else if (String.valueOf(in.charAt(i)) == "9" || String.valueOf(in.charAt(i)) == "W"
						|| String.valueOf(in.charAt(i)) == "X" || String.valueOf(in.charAt(i)) == "Y"
						|| String.valueOf(in.charAt(i)) == "Z") {
					out = out + "9";
				} else if (i == 3 || i == 7) {
					out += "-";
				}
			}
			System.out.println(out);

		}
	}
}
