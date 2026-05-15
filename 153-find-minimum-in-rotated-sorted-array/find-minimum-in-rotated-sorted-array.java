class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int right = nums.length -1;

        while(low < right){
        
        int mid = low + (right-low)/2;
        if(nums[mid] > nums[right]){
            low = mid + 1;
        }else{
            right = mid;
        }
    }
    return nums[low];
        
    }
}

/*

idx =  0,1,2,3,4
nums = 3,4,5,1,2

low = 0;
high = nums.length-1;

int mid = low + (high - low) / 2;
0+4/2= 4/2= 2
mid = 2
nums[mid] = 5

if(nums[mid] > nums[high]){
    low =  mid + 1;
}else{
    mid = high;
}
return nums[low];

*/