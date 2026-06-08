class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> great = new ArrayList<>();

        for(int num : nums){
            if(num < pivot){
                less.add(num);
            }else if(num == pivot){
                equal.add(num);
            }else{
                great.add(num);
            }
        }
        less.addAll(equal);
        less.addAll(great);
        

        int[] ans = new int[nums.length];
        int idx = 0;
        for(int num : less){
            ans[idx++] = num;

        }
        return ans;
    }
}