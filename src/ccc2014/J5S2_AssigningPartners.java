package ccc2014;

import java.util.ArrayList;
import java.util.Scanner;

public class J5S2_AssigningPartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		state currentstate = state.GOOD;
		int n = sc.nextInt();

		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			names1.add(sc.next());
		}
		for (int i = 0; i < n; i++) {
			names2.add(sc.next());
		}

		for (int i = 0; i < n; i++) {
			if (names1.get(i).equals((names2.get((n - 1 - i))))) {

			} else {
				currentstate = state.BAD;
			}
		}

		if (currentstate == state.GOOD) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}

	}

}

enum state {
	GOOD, BAD;
}