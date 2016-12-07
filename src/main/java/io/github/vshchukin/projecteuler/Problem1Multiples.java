package io.github.vshchukin.projecteuler;

import java.util.stream.IntStream;

public class Problem1Multiples {
    public static void main(String[] args) {
        int sum1 = getSumON();
        System.out.println(sum1);

        int sum2 = getSumO1();
        System.out.println(sum2);
    }

    private static int getSumON() {
        return IntStream
                .range(1, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    private static int getSumO1() {
        return arithmeticSum(3, 999) +
                arithmeticSum(5, 995) -
                arithmeticSum(5 * 3, 990);
    }

    private static int arithmeticSum(int base, int to) {
        return (base + to) * to / (2 * base);
    }
}
