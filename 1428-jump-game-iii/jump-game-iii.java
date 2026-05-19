class Solution {
    int n ;
    public boolean solve(int[]arr, int i){
        if(i < 0 || i >= n || arr[i] < 0){
            return false;
        }
        if(arr[i] == 0){
            return true;
        }
        int val = arr[i];
        arr[i]  = -1;
        boolean left = solve(arr,i+ val);
        boolean right = solve(arr, i-val);

        return left || right;
    }
    public boolean canReach(int[] arr, int start) {
       n = arr.length;
        return solve(arr,start);
        
    }
}