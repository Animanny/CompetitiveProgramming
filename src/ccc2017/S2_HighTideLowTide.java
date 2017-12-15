package ccc2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S2_HighTideLowTide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> heights = new ArrayList<Integer>();
		int n = sc.nextInt();
		String out = "";

		for (int i = 0; i < n; i++) {
			heights.add(sc.nextInt());
		}

		Collections.sort(heights);
		if (n % 2 == 0) {

			int median = Math.round(n / 2);
			int deviation = 0;
			for (int i = 0; i < median; i++) {
				out += Integer.toString(heights.get(median - deviation - 1)) + " ";
				out += Integer.toString(heights.get(median + deviation)) + " ";

				deviation++;
			}
		} else {
			int median = ((n-1)/2);
			out += Integer.toString(heights.get(median)) + " ";
			int deviation = 1;
			for (int i = 0; i < median; i++) {
				out += Integer.toString(heights.get(median + deviation)) + " ";
				out += Integer.toString(heights.get(median - deviation)) + " ";

				deviation++;
			}
			
		}

		System.out.println(out);
	}

}
