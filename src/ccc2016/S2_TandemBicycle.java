package ccc2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S2_TandemBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int q = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> dmoj = new ArrayList<Integer>(n);
		ArrayList<Integer> peg = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			dmoj.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			peg.add(sc.nextInt());
		}

		if (q == 1) {

			for (int i = 0; i < n; i++) {
				total += Math.max(peg.get(i),dmoj.get(i));
			}
		} else {
			dmoj.sort(null);
			peg.sort(null);
			Collections.reverse(peg);
			for (int i = 0; i < n; i++) {
				total += Math.max(peg.get(i),dmoj.get(i));
			}

		}

		System.out.println(total);

	}

}
