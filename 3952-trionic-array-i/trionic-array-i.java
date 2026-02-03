class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int i = 0;

        // 1️⃣ Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;
        int p = i;

        // 2️⃣ Decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == p) return false;
        int q = i;

        // 3️⃣ Increasing again
        boolean thirdPhase = false;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
            thirdPhase = true;
        }

        return thirdPhase && i == n - 1;
    }
}
