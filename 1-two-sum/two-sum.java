class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n= nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i< n; i++){
            int complement = target - nums[i];
            if(mp.containsKey(complement)){
                return new int[]{i,mp.get(complement)};

            }
            mp.put(nums[i],i);

        }
        return new int[]{-1,-1};

        
    }
}