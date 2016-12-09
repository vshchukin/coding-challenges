package io.github.vshchukin.projecteuler;

import java.util.Arrays;

public class Problem9PythagoreanTriplet {
    /**
     * brute-force avoiding unneeded allocations
     */
    public static void main(String[] args) {
        final int[] squares = new int[500];
        for (int i = 1; i < 500; i++) {
            squares[i] = i * i;
        }

        outerLoop:
        for (int a = 1; a < 500; a++) {
            for (int b = 500 - a; b < 500; b++) {
                final int sumOfSquares = squares[a] + squares[b];
                final int idx = Arrays.binarySearch(squares, sumOfSquares);
                if (idx >= 0 && idx + a + b == 1000) {
                    System.out.println(a * b * idx);
                    break outerLoop;
                }
            }
        }
    }
}
