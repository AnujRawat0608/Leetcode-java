class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n-1;
         int maxArea = 0;

        while(left < right){
           
            int length = Math.min(height[left],height[right]);
            int breadth = right - left;
            int area = length * breadth;

            maxArea = Math.max(maxArea,area);
            if(height[left]<height[right]){
            left++;
            }else{
                right--;
            
            }
        }
        

        return maxArea;
        
    }
}

/*

int[] height
n vertical lines 

return maximum amount of water a container can store 
int n = height.length;
i =0;
j=n-1;

height =[]
u have to remove the area  of the container to find out the maximum amount of water the container can hold
area = length * breadth(width)

length = minimum length between 2 verical lines will be the length 
int n = nums.length ;
breadth =int i = 0
int j = n-1;


while(left < right){

}

*/