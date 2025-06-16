class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dupSet = new HashSet<>();

        for(int num : nums){
            if(dupSet.contains(num)){
            return true;
            }
             dupSet.add(num);
        }
        return false;        
    }
}