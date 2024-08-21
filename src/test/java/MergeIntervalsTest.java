import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.MergeIntervals;
import org.junit.jupiter.api.Test;

/** Unit tests for the MergeIntervals class. */
class MergeIntervalsTest {

    @Test
    public void testMergeWithOverlappingIntervals() {
        int[][] intervals = {{25, 30}, {2, 19}, {14, 23}, {4, 8}};
        int[][] expected = {{2, 23}, {25, 30}};
        int[][] result = MergeIntervals.merge(intervals);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMergeWithOverlappingNonOrderedIntervals() {
        int[][] intervals = {{25, 30}, {2, 19}, {23, 14}, {8, 4}};
        int[][] expected = {{2, 23}, {25, 30}};
        int[][] result = MergeIntervals.merge(intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMergeIdenticalIntervals() {
        int[][] intervals = {{1, 4}, {1, 4}, {1, 4}};
        int[][] expected = {{1, 4}};
        int[][] result = MergeIntervals.merge(intervals);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMergeEmptyArray() {
        int[][] intervals = {};
        int[][] expected = {};
        int[][] result = MergeIntervals.merge(intervals);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntervalWithThreeValues() {
        int[][] invalidIntervals = {{1, 3, 5}, {2, 6}, {8, 10}};

        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    MergeIntervals.merge(invalidIntervals);
                });
    }

    @Test
    public void testMergeWithNegativeValues() {
        int[][] intervals = {{-10, -1}, {-3, 2}, {1, 5}, {-20, -15}};
        int[][] expected = {{-20, -15}, {-10, 5}};
        int[][] actual = MergeIntervals.merge(intervals);

        assertArrayEquals(expected, actual);
    }
}
