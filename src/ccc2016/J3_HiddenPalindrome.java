package ccc2016;

import java.util.Scanner;

public class J3_HiddenPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sequence = 0;
		
		String word = sc.nextLine(); // Get Word
		
		for (int i = 0; i < (word.length())/2;i++){ //Start at beginning index and go to center of word
			if (word.indexOf(i) == word.indexOf(word.length()-(i+1))){ //Compare first and last char
				sequence += 1; //If same add 1 to "sequence"
			} else {
				sequence = 0; //If not the same, reset sequence
			}
		}
		
		System.out.println(sequence);
		
	}

}
