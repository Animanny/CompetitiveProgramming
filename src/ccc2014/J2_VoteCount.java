package ccc2014;

import java.util.Scanner;

public class J2_VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String in = sc.next();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < length ; i++){
			char current = in.charAt(i);
			if (current == 'A'){
				a++;
			} else {
				b++;
			}		
		}
		
		System.out.println((a>b)?("A"):(b>a)?("B"):("Tie"));

	}

}
