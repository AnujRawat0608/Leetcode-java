class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        //step 1: create sorted version
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        //step 2 : try all the rotations
        for(int r = 0; r < n; r ++){
            boolean match = true;
            //compare rotated array with original nums
            for(int i=0; i<n; i++){
                int rotatedindex = (i + r) % n ;

                if(sorted[rotatedindex] != nums[i]){
                    match = false;
                    break;
                }
            }
            if(match){
                return true;
            }
        }
        return false;
    }
}

/*

3,4,5,1,2

-fir sort the array
1,2,3,4,5

aab ek ek bar rotate
5,1,2,3,4 -> fir match with input array if not same rotate
4,5,1,2,3 ->fir se rotate
3,4,5,1,2,-> it matches the input array


*/