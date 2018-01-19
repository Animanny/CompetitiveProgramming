package ccc2016;

import java.util.Scanner;

public class J1_TournamentSelection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String current;
		int score = 0;

		for (int i = 0; i < 6; i++) {
			current = sc.nextLine();

			if (current.equals("W")) {
				score++;
			}
		}

		if (score >= 5) {
			System.out.println(1);
		} else if (score >= 3) {
			System.out.println(2);
		} else if (score >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}

	}

}
