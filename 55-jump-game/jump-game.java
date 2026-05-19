class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
            if(maxReach >= nums.length -1)return true;
        }
        return true;
        
    }
}
/* nums = [2,3,1,1,4]
maxReach = 0;
i=0 (2)
if(i > maxreach) = (0 > 0)  )
maxreach = Math.max(maxreach , i+num[i]) = (0,0+2) = (0,2)
max reach  = 2;

maxReach = 2;
i=1 (3)
if(i > maxreach) = (1 > 2)
maxreach = Math.max(maxReach, i+num[i]) = (2,1+3) = (2,4)
max reach = 4;

maxReach = 4;
i=2 (1)
if(i > maxreach) = (2 > 4)
maxReach = Math.max(maxReach, i +num[i] = (4 ,2+1)) = (4,3)
maxReach = 4

maxReach = 4;
i=3 (1)
if(i > maxreach) = (2 > 4)
maxReach = Math.max(maxReach, i +num[i] = (4 ,3+1)) = (4,4)
maxReach = 4

maxReach = 4;
i=4 (4)
if(i > maxreach) = (4 > 4)
maxReach = Math.max(maxReach, i +num[i] = (4 ,4+4)) = (4,8)
maxReach = 8

maxReach  > = nums.length -1
8 >= 4 - hence return true

*/
