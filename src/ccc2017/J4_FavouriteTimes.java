package ccc2017;

import java.util.Scanner;

public class J4_FavouriteTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		double hours = (Math.floor(d/60));
		double minutes = d % 60;
		for (int hour = 12; hour < hours;hour++){
			int hh = hour%12;
			if (hour == 0){
				hour = 12;
			}
			String HH = Integer.toString(hour);
			for (int minute = 0; minute < 60;minute++){
				String MM = String.format("%02d", minute);
			}
		}
		
	}

}
