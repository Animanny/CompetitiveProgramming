package ccc2005;

import java.util.Scanner;

public class J1_TheCellSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double cost_a;
		double cost_b;
		
		int dt = sc.nextInt();
		int ev = sc.nextInt();
		int we = sc.nextInt();
		if (dt < 100) {
			cost_a = Math.round(((ev * .15) + (we * .20)) * 100.0) / 100.0;
		} else {
			cost_a = Math.round((((dt - 100) * .25) + (ev * .15) + (we * .20)) * 100.0) / 100.0;
		}
		
		if (dt<250){
			cost_b = Math.round(((ev * .35) + (we * .25)) * 100.0) / 100.0;
		} else {
			cost_b = Math.round((((dt - 250) * .45) + (ev * .35) + (we * .25)) * 100.0) / 100.0;
		}

		System.out.println("Plan A costs " + cost_a);
		System.out.println("Plan B costs " + cost_b);
		if (cost_a < cost_b) {
			System.out.println("Plan A is cheapest.");
		} else if (cost_a == cost_b){
			System.out.println("Plan A and B are the same price.");
		} else {
			System.out.println("Plan B is cheapest.");
		}

	}

}