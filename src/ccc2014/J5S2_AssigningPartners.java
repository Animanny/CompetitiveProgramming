package ccc2014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J5S2_AssigningPartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean currentState = true;
		int n = sc.nextInt();

		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			names1.add(sc.next());
		}
		for (int i = 0; i < n; i++) {
			names2.add(sc.next());
		}//

		for (int i = 0; i < n; i++) {
			String currentPartner = names2.get(i);
			String currentPer = names1.get(i);
			
			
			if (currentPartner.equals(names1.get(names2.indexOf(currentPer)))){
				
			} else {
				currentState = false;
			}
		}

		if (currentState) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}

	}

}