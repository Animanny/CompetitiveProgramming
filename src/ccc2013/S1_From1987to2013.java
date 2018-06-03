package ccc2013;

import java.util.Scanner;

public class S1_From1987to2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean state = false;

		while (!state) {
			input++;
			String temp = String.valueOf(input);
			state = true;
			for (int j = 0; j < temp.length(); j++) {

				for (int i = 0; i < temp.length(); i++) {

					if (i == j) {
						continue;
					}

					if (temp.charAt(i) == temp.charAt(j)) {
						state = false;
					} else {

					}
				}
			}
		}
		
		System.out.println(input);

	}

}
