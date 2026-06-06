class Solution {

    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> used = new HashSet<>();
    int n;

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;

        backtrack(new ArrayList<>(), nums);

        return result;
    }

    private void backtrack(List<Integer> temp, int[] nums) {

        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < n; i++) {

            if (!used.contains(nums[i])) {

                temp.add(nums[i]);
                used.add(nums[i]);

                backtrack(temp, nums);

                used.remove(nums[i]);
                temp.remove(temp.size() - 1);
            }
        }
    }
}