package dmoj;

import java.io.IOException;
import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numOfProblems = 0;
		
		numOfProblems = sc.nextInt();
		
		for (int i = 0; i <= numOfProblems;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a+b;
			System.out.println(result);
		}
	}

}
