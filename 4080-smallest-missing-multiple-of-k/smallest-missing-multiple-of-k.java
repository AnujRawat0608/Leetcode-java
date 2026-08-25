class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        // Put all nums into the set
        for (int num : nums) {
            set.add(num);
        }

        // Check k, 2k, 3k, 4k...
        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}


/*

int[] nums
int k 

multipe of k is  a positive integer divisible by k

*/