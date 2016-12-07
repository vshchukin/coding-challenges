package io.github.vshchukin.projecteuler;

public class Problem2EvenFibonacciSum {
    public static void main(String[] args) {
        long sum = getSumON();

        System.out.println(sum);
    }

    private static long getSumON() {
        int first = 1;
        int second = 2;
        long sum = 0;
        while (second < 4000000) {
            if ((second & 1) == 0) {
                sum += second;
            }
            int tmp = second;
            second += first;
            first = tmp;
        }
        return sum;
    }
}
