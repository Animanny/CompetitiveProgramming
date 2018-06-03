package nccc2018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S1_AMathProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.000"); 
		Scanner sc = new Scanner (System.in);
		double k = sc.nextInt();
		double p = sc.nextInt();
		double x = sc.nextInt();
		double output = 99999999;
		for (double m = 1; m < 9999999; m += 1){
			double temp = Math.round(((m*x) + ((k*p)/m))*1000.0)/1000.0;
			if (temp < output) {
				output = temp;
			}
		}
		
		System.out.println(output);
	}

}
