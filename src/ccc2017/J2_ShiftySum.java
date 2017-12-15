package ccc2017;

import java.util.Scanner;

public class J2_ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k = sc.nextInt();
		int out = 0;
		
		for (int i = 0; i <= k;i++){
			out += n*(Math.pow(10,i));
		}
		System.out.println(out);
	}

}
