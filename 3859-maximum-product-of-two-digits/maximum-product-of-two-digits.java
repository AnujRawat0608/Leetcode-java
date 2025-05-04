class Solution {
    public int maxProduct(int n) {
        List<Integer> digits = new ArrayList<>();

        // Extract digits of n
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        int maxProduct = 0;

        // Try all pairs of digits
        for (int i = 0; i < digits.size(); i++) {
            for (int j = i + 1; j < digits.size(); j++) {
                maxProduct = Math.max(maxProduct, digits.get(i) * digits.get(j));
            }
        }

        return maxProduct;
    }
}
