package ccc2016;

import java.util.Scanner;

public class J2_MagicSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean magic = true;
        int sum = 0;
        int[][] square = new int[4][4];
        int current = 0;

        for (int i = 0; i < 4; i++) {
            current = 0;
            for (int j = 0; j < 4; j++) {
                square[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            sum += square[0][i];
        }

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                current += square[i][k];
            }
            if (current != sum) {
                magic = false;
            }
            current = 0;
        }
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                current += square[i][k];
            }
            if (current != sum) {
                magic = false;
            }
            current = 0;
        }

        if (magic){
        	System.out.println("magic");
        } else {
        	System.out.println("not magic");
        }
    }
}
