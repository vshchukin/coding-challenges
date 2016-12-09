package io.github.vshchukin.projecteuler;

public class Problem10SummationPrimes {

    private static final int LIMIT = 2_000_000;

    public static void main(String[] args) {
        final int[] sieve = new int[LIMIT];
        long sum = 0;
        for (int p = 2; p < LIMIT; p++) {
            if (sieve[p] == 0) {
                sum += p;
                for (int j = 2 * p; j < LIMIT; j += p) {
                    sieve[j] = -1;
                }
            }
        }
        System.out.println(sum);
    }
}
