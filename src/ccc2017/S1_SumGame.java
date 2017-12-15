package ccc2017;

import java.util.ArrayList;
import java.util.Scanner;

public class S1_SumGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int team1 = 0;
		int team2 = 0;
		ArrayList<Integer>[] scores;
		scores = new ArrayList[2];
		for (int i = 0; i < 2; i++) {
			scores[i] = new ArrayList<>();
			for (int x = 0; x < n; x++) {
				scores[i].add(sc.nextInt());
			}
		}
		
		for (int i = 1; i <= n; i++) {
			team1 += scores[0].get(i-1);
			team2 += scores[1].get(i-1);
			if(team1 == team2){
				k = i;
			}
		}
		System.out.println(k);

	}

}
