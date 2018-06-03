package ccc2018;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class S1_VoronoiVillages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		int n = sc.nextInt();
		ArrayList<Integer> points = new ArrayList<>();
		ArrayList<Double> size = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			points.add(sc.nextInt());
		}

		points.sort(null);

		for (int i = 1; i < n - 1; i++) {
			double current = points.get(i);
			double next = points.get(i + 1);
			double prev = points.get(i - 1);
			size.add(((current - prev) / 2) + ((next - current) / 2));
		}

		size.sort(null);

		System.out.println((df.format(size.get(0))));

	}

}
