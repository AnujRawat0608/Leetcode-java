class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // check if current number matches any previous reverse
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                minDist = Math.min(minDist, i - j);
            }

            // store reverse of current number
            int rev = reverse(nums[i]);
            map.put(rev, i);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}