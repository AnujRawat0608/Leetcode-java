class Solution {

    int n;
    public void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> result){

        //If subsequence size > 1 , add to result
        if(curr.size() > 1){
            result.add(new ArrayList<>(curr));
        }

        //To avoid duplicates at the sam recurssion level
        HashSet<Integer> set = new HashSet<>();

        for(int i = idx; i <n ; i++){
            //check:
            //1.Current number should maintain the non decresing order
            //2.Avoid duplicates in same level

            if((curr.isEmpty() || nums[i] >= curr.get(curr.size() -1)) && !set.contains(nums[i])){
                //choose
                curr.add(nums[i]);

                //Explore
                backtrack(nums, i+1, curr,result);

                //Backtrack
                curr.remove(curr.size() -1);

                //Mark number as used at this level
                set.add(nums[i]);
            }
        }

    }

    public List<List<Integer>> findSubsequences(int[] nums) {

        n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums,0, curr,result);
        return result;
        
    }
}