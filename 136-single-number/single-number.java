class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
       
        
        
        for(int i=0; i<n; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                
            }else{
                set.add(nums[i]);
            }
        }
         return set.iterator().next();
    }
}