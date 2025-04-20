class Solution{
    public int longestConsecutive(int[] nums){

    int LongestLength = 0;
        Map<Integer,Boolean> travelled = new HashMap<>();
        for (int num : nums){
            travelled.put(num, Boolean.FALSE);
        }
        for( int num : nums){
            int currentLength = 1;
            int nextNum = num+1;
            while(travelled.containsKey(nextNum) &&(travelled.get(nextNum) == false)){

            currentLength++;
            travelled.put(nextNum, Boolean.TRUE);
            nextNum++;
            
        }

        //Check previous Element
        int prevNum = num -1;
        while(travelled.containsKey(prevNum) && (travelled.get(prevNum) == false)){
        currentLength++;
        travelled.put(prevNum, Boolean.TRUE);
        prevNum --;

    }
    LongestLength = Math.max(LongestLength,currentLength);
}
return LongestLength;
}
}