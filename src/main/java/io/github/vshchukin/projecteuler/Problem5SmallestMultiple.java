package io.github.vshchukin.projecteuler;

import java.util.stream.LongStream;

public class Problem5SmallestMultiple {
    public static void main(String[] args) {
        long lcm = LongStream.rangeClosed(1L, 20L).reduce(1L, Problem5SmallestMultiple::lcm);
        System.out.println(lcm);
    }

    private static long lcm(long a, long b) {
        return a * b / gcdIterative(a, b);
    }

    private static long gcdIterative(final long a, final long b) {
        int d = 0;
        long a0 = a;
        long b0 = b;
        while (((a0 & 1) | (b0 & 1)) == 0) {
            a0 >>= 1;
            b0 >>= 1;
            ++d;
        }
        while ((a0 ^ b0) != 0) {
            if ((a0 & 1) == 0) {
                a0 >>= 1;
            } else if ((b0 & 1) == 0) {
                b0 >>= 1;
            } else if (a0 > b0) {
                a0 = (a0 - b0) >> 1;
            } else {
                b0 = (b0 - a0) >> 1;
            }
        }
        long g = a0;
        return g * (1 << d);
    }
}
