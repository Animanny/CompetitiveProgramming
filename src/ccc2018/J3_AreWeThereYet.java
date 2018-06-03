package ccc2018;

import java.util.ArrayList;
import java.util.Scanner;

public class J3_AreWeThereYet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> distances = new ArrayList<Integer>();

		for (int i = 0; i < 4; i++) {
			distances.add(sc.nextInt());
		}

		for (int i = 0; i < 5; i++) {
			ArrayList<Integer> toPrint = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					toPrint.add(0);
				} else {
					int sum = 0;
					if (i < j) {
						for (int k = i; k < j; k++) {
							sum = sum + distances.get(k);
						}
						toPrint.add(sum);
					} else if (i > j) {
						for (int k = j; k < i; k++) {
							sum = sum + distances.get(k);
						}
						toPrint.add(sum);
					}
				}
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(toPrint.get(j) + " ");
			}

			System.out.println();
		}
	}
}
