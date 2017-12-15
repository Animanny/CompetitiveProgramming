package ccc2017;

import java.util.Scanner;

public class J3_ExactlyElectrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int power = sc.nextInt();
		int total = (Math.abs(c - a) + Math.abs(d - b));
		if(power < total){
			System.out.println("N");			
		}else if (total % 2 == power % 2) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}

}
