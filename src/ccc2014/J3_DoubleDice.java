package ccc2014;


import java.util.Scanner;

public class J3_DoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int norolls = in.nextInt();
		int a = 100;
		int d = 100;

		for (int i = 0; i < norolls; i++) {
			int aroll = in.nextInt();
			int droll = in.nextInt();
			if (aroll > droll) {
				d -= aroll;
			} else if (aroll == droll) {
			} else {

				a -= droll;
			}

		}

		System.out.println(a);
		System.out.println(d);

	}

}
