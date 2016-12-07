package io.github.vshchukin.projecteuler;

public class Problem7A10001stPrime {

    private static final int MAX_LOOKUP = 1000000;

    public static void main(String[] args) {
        System.out.println(sieve10001stPrime());
    }

    private static int sieve10001stPrime() {
        int[] arr = new int[MAX_LOOKUP];
        int idx = 0;
        for (int prime = 2; prime < MAX_LOOKUP; prime++) {
            if (arr[prime] != -1) {
                int j = prime << 1;
                while (j < MAX_LOOKUP) {
                    arr[j] = -1;
                    j += prime;
                }

                if (++idx == 10001) {
                    return prime;
                }
            }
        }
        return -1;
    }
}
