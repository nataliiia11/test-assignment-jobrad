package org.example;

import java.util.Arrays;
import static org.example.MergeIntervals.merge;

public class Main {
    public static void main(String[] args) {
        try {
            int[][] intervals = {{25, 30}, {2, 19}, {14, 23}, {4, 8}};
            long startTime = System.nanoTime();
            int[][] mergedIntervals = merge(intervals);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            long durationInMillis = duration / 1_000_000;

            for (int[] interval : mergedIntervals) {
                System.out.println(Arrays.toString(interval));
            }
            System.out.println("Ausführungszeit in Nanosekunden: " + duration);
            System.out.println("Ausführungszeit in Millisekunden: " + durationInMillis);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}