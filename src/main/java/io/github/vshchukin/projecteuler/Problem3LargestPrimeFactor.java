package io.github.vshchukin.projecteuler;

public class Problem3LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        int numberSqrtApprox = (int) Math.sqrt(number);

        int largestPrimeFactor = sieveOfEratosphenes(numberSqrtApprox, number);
        System.out.println(largestPrimeFactor);
    }

    private static int sieveOfEratosphenes(int upTo, long number) {
        int[] sieve = new int[upTo];
        int max = -1;
        for (int prime = 2; prime < upTo; prime++) {
            if (sieve[prime] != -1) {
                if (number % prime == 0) {
                    max = prime;
                }
                int j = 2 * prime;
                while (j < upTo) {
                    sieve[j] = -1;
                    j += prime;
                }
            }
        }
        return max;
    }
}
