package ccc2005;

import java.util.Scanner;

public class S1_SnowCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for (int x = 0; x <= b; x++) {
			String in = sc.next();
			String out = "";
			int current = 0;
			for (int i = 0; i < in.length(); i++) {

				if (current < 10) {

					char thing = in.charAt(i);
					if (Character.toString(in.charAt(i)).equals("2") || Character.toString(in.charAt(i)).equals("A")
							|| Character.toString(in.charAt(i)).equals("B")
							|| Character.toString(in.charAt(i)).equals("C")) {
						out = out + "2";
					} else if (Character.toString(in.charAt(i)).equals("3")
							|| Character.toString(in.charAt(i)).equals("D")
							|| Character.toString(in.charAt(i)).equals("E")
							|| Character.toString(in.charAt(i)).equals("F")) {
						out = out + "3";
					} else if (Character.toString(in.charAt(i)).equals("4")
							|| Character.toString(in.charAt(i)).equals("G")
							|| Character.toString(in.charAt(i)).equals("H")
							|| Character.toString(in.charAt(i)).equals("I")) {
						out = out + "4";
					} else if (Character.toString(in.charAt(i)).equals("5")
							|| Character.toString(in.charAt(i)).equals("J")
							|| Character.toString(in.charAt(i)).equals("K")
							|| Character.toString(in.charAt(i)).equals("L")) {
						out = out + "5";
					} else if (Character.toString(in.charAt(i)).equals("6")
							|| Character.toString(in.charAt(i)).equals("M")
							|| Character.toString(in.charAt(i)).equals("N")
							|| Character.toString(in.charAt(i)).equals("O")) {
						out = out + "6";
					} else if (Character.toString(in.charAt(i)).equals("7")
							|| Character.toString(in.charAt(i)).equals("P")
							|| Character.toString(in.charAt(i)).equals("Q")
							|| Character.toString(in.charAt(i)).equals("R")
							|| Character.toString(in.charAt(i)).equals("S")) {
						out = out + "7";
					} else if (Character.toString(in.charAt(i)).equals("8")
							|| Character.toString(in.charAt(i)).equals("T")
							|| Character.toString(in.charAt(i)).equals("U")
							|| Character.toString(in.charAt(i)).equals("V")) {
						out = out + "8";
					} else if (Character.toString(in.charAt(i)).equals("9")
							|| Character.toString(in.charAt(i)).equals("W")
							|| Character.toString(in.charAt(i)).equals("X")
							|| Character.toString(in.charAt(i)).equals("Y")
							|| Character.toString(in.charAt(i)).equals("Z")) {
						out = out + "9";
					} else if (i == 4 || i == 7) {
						out= out + "-";
					} else {

					}

				} else {

				}

				current += 1;
			}
			System.out.println(out);

		}
	}
}
