class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0; 
        int productWithouZero = 1;
        for(int num : nums){
            if(num == 0)
            zeroCount++;
            else
            productWithouZero *= num ;
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                if(zeroCount > 0)
                result[i] = 0;
                else
                result[i] = productWithouZero / nums[i];
            }else{
                if(zeroCount > 1)
                result[i] = 0;
                else
                result[i] = productWithouZero;
            }
        }
        return result;

    }
}