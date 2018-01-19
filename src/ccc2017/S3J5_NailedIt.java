package ccc2017;

import java.util.ArrayList;
import java.util.Scanner;

public class S3J5_NailedIt {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] woods = new int[n];
        for (int i = 0; i < n; n++) {
            woods[i] = (sc.nextInt());
        }
        woods = countingSort(woods,2000);


    }


    private static int[] countingSort(int[] theArray, int maxValue) {

        // array of 0's at indices 0...maxValue
        int numCounts[] = new int[maxValue + 1];

        // populate numCounts
        for (int num : theArray) {
            numCounts[num]++;
        }

        // populate the final sorted array
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;

        // for each num in numCounts
        for (int num = 0; num < numCounts.length; num++) {
            int count = numCounts[num];

            // for the number of times the item occurs
            for (int i = 0; i < count; i++) {

                // add it to the sorted array
                sortedArray[currentSortedIndex] = num;
                currentSortedIndex++;
            }
        }

        return sortedArray;
    }

}
