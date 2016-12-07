package io.github.vshchukin.projecteuler;

public class Problem6SumSquareDiff {
    public static void main(String[] args) {
        System.out.println(squareOfSum(100L) - sumOfSquares(100L));
    }

    private static long sumOfSquares(long n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    private static long squareOfSum(long n) {
        long sum = n * (n + 1) / 2;
        return sum * sum;
    }
}
