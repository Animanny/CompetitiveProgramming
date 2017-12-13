package dmoj;

import java.util.Scanner;

public class ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i<=k;i++){
			sum += x * Math.pow(10, i);
		}
		System.out.println(sum);
	}

}
