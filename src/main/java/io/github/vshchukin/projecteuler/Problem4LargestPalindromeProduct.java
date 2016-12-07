package io.github.vshchukin.projecteuler;

public class Problem4LargestPalindromeProduct {
    public static void main(String[] args) {
        int maxPalindrome = getMax3ProductPalindrome();
        System.out.println(maxPalindrome);
    }

    private static int getMax3ProductPalindrome() {
        final byte[] digits = new byte[6];
        int max = -1;
        for (int i = 900; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                int product = i * j;
                setDigits(product, digits);
                if (isPalindrome(digits) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    private static void setDigits(final int num, final byte[] digits) {
        int pow10 = 100000;
        int tmp = num;
        for (int i = 0; i < 6; i++) {
            digits[i] = (byte) (tmp / pow10);
            tmp -= digits[i] * pow10;
            pow10 /= 10;
        }
    }

    private static boolean isPalindrome(byte[] digits) {
        return digits[0] == digits[5] && digits[1] == digits[4] && digits[2] == digits[3];
    }
}
