package nccc2018;

import java.util.Scanner;

public class J1_AStringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean state = false;
		int init = Integer.parseInt((sc.nextLine()));

		while (!state) {
			init += 1;
			String modified = String.valueOf(init);
			for (int i = 0; i < modified.length(); i++) {
				if (modified.charAt(i) == '0') {
					state = false;
					break;
				} else {
					state = true;
				}
			}
		}
		
		System.out.println(init);

	}

}
