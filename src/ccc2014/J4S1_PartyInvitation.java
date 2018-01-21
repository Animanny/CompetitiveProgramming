package ccc2014;

import java.util.ArrayList;
import java.util.Scanner;

public class J4S1_PartyInvitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		// Create Array Containing the main List
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			list.add(i + 1);
		}

		// Create the m value and the array for it
		int m = sc.nextInt();
		int[] rounds = new int[m];
		for (int x = 0; x < m; x++) {
			rounds[x] = sc.nextInt();
		}

		//
		for (int x = 0; x < m; x++) {
			for (int z = 1; z <= list.size(); z++) {
				if ((z) % rounds[x] == 0) {
					list.set(z - 1, 200);
				}
			}

			for (int y = 0; y < list.size(); y++) {
				if (list.get(y) == 200) {
					list.remove(y);
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}