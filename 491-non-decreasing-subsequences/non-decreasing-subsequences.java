class Solution {
    int n ;

    public void backtrack(int nums[], int idx,List<Integer> curr,List<List<Integer>> result ){

        if(curr.size() > 1){
            result.add(new ArrayList<>(curr));
        }
            HashSet<Integer> set = new HashSet<>();


        for(int i=idx; i<n; i++){
            if((curr.isEmpty() || nums[i] >= curr.get(curr.size() -1)) && !set.contains(nums[i])){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,result);
            curr.remove(curr.size()-1);
            set.add(nums[i]);
        }
    }
    }




    public List<List<Integer>> findSubsequences(int[] nums) {

        n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums,0,curr,result);
        return result;
        
    }
}