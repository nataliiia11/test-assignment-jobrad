package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Merges all overlapping intervals into non-overlapping intervals.
 *
 */
public class MergeIntervals {

  public static int[][] merge(int[][] intervals) {
    // If there is only one interval or none, return the intervals as is
    if (intervals.length <= 1) {
      return intervals;
    }

    // Validate each interval and correct if the start is greater than the end
    for (int[] interval : intervals) {
      if (interval.length != 2) {
        throw new IllegalArgumentException("Each interval must contain exactly two elements.");
      }
      if (interval[0] > interval[1]) {
        // Swap the elements if the first is greater than the second
        int temp = interval[0];
        interval[0] = interval[1];
        interval[1] = temp;
      }
    }

    // Sort intervals by their starting points to facilitate the merging process
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    LinkedList<int[]> merged = new LinkedList<>();
    for (int[] interval : intervals) {
      // If there is no last interval or the current interval does not overlap with the last, add it
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      } else {
        // If the current interval overlaps with the last one, merge them
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }

    // Convert the list of intervals to an array before returning
    return merged.toArray(new int[merged.size()][]);
  }
}
