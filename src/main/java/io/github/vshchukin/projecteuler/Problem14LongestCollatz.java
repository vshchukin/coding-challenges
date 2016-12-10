package io.github.vshchukin.projecteuler;

public class Problem14LongestCollatz {

    private static final int LIMIT = 1_000_000;

    /**
     * with memoization
     */
    public static void main(String[] args) {
        final int[] collatzCache = new int[LIMIT];
        collatzCache[2] = 2;
        collatzCache[1] = 1;
        int maxNumber = 2;
        int maxCollatzLength = 2;
        for (int i = 3; i < collatzCache.length; i++) {
            long j = i;
            int iCollatzLength = 0;
            while (j >= LIMIT || collatzCache[(int) j] == 0) {
                if ((j & 1) == 0) {
                    j >>= 1;
                } else {
                    j = 3 * j + 1;
                }
                iCollatzLength++;
            }
            collatzCache[i] = iCollatzLength + collatzCache[(int) j];
            maxCollatzLength = Math.max(maxCollatzLength, collatzCache[i]);
            if (maxCollatzLength == collatzCache[i]) {
                maxNumber = i;
            }
        }

        System.out.printf("Number is %d\n", maxNumber);
        System.out.printf("Sequence length is %d\n", collatzCache[maxNumber]);

    }
}
