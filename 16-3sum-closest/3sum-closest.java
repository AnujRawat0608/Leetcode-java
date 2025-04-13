class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int resultSum = 0;
        int minDifference = Integer.MAX_VALUE;

            for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            int closestValue = 0;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return target;
                }if(sum < target){
                    left ++;
                }else
                right --;

                int diffTarget = Math.abs(sum - target);
                if(diffTarget < minDifference){
                    resultSum = sum;
                    minDifference = diffTarget;
                }
            }
        }

        return resultSum;
    }
}