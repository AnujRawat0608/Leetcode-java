class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] nonZeroCount = new int[n];
        long[] numberUpTo = new long[n];
        long[] digitSumUpTo = new long[n];
        long[] pow10 = new long[n + 1];

        // Precompute powers of 10
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // Initialize first character
        int firstDigit = s.charAt(0) - '0';

        nonZeroCount[0] = (firstDigit != 0) ? 1 : 0;
        numberUpTo[0] = (firstDigit != 0) ? firstDigit : 0;
        digitSumUpTo[0] = firstDigit;

        // Prefix arrays
        for (int i = 1; i < n; i++) {
            int digit = s.charAt(i) - '0';

            // Non-zero count
            nonZeroCount[i] = nonZeroCount[i - 1] + (digit != 0 ? 1 : 0);

            // Number formed by non-zero digits
            if (digit != 0) {
                numberUpTo[i] = (numberUpTo[i - 1] * 10 + digit) % MOD;
            } else {
                numberUpTo[i] = numberUpTo[i - 1];
            }

            // Prefix digit sum
            digitSumUpTo[i] = digitSumUpTo[i - 1] + digit;
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int startCount = (l == 0) ? 0 : nonZeroCount[l - 1];
            long numBefore = (l == 0) ? 0 : numberUpTo[l - 1];

            int endCount = nonZeroCount[r];
            int subStrLen = endCount - startCount;

            // No non-zero digits in substring
            if (subStrLen == 0) {
                result[i] = 0;
                continue;
            }

            // Extract compressed number
            long x = (numberUpTo[r]
                    - (numBefore * pow10[subStrLen]) % MOD
                    + MOD) % MOD;

            // Sum of digits in substring
            long sum = digitSumUpTo[r] - ((l == 0) ? 0 : digitSumUpTo[l - 1]);

            result[i] = (int) ((x * sum) % MOD);
        }

        return result;
    }
}