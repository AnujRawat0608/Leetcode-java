class Solution {
    public int countCompleteSubarrays(int[] nums) {

        Set<Integer> uniqueSet = new HashSet<>();
        for(int num : nums){
            uniqueSet.add(num);
        } // craeting set to get unique elements

        int totalUnique = uniqueSet.size();
        int left = 0;
        int result = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) +1);

            while(freqMap.size() == totalUnique){
                result += (nums.length - right);
                freqMap.put(nums[left], freqMap.get(nums[left]) -1);
                if(freqMap.get(nums[left]) == 0){
                    freqMap.remove(nums[left]);
                }
                left++;
            }
        }
return result;


        
    }
}