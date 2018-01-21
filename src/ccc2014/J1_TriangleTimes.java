package ccc2014;

import java.util.Scanner;

public class J1_TriangleTimes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b&&b==c&&c==60){
			System.out.println("Equilateral");
		} else if (a+b+c == 180 &&(a==b||b==c||a==c)){
			System.out.println("Isosceles");
		} else if(a+b+c == 180){
			System.out.println("Scalene");
		} else {
			System.out.println("Error");
		}
	}
}
