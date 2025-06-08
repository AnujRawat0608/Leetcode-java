class Solution{
    public int lastStoneWeight(int [] stones){

        int n = stones.length;
        while(true){
            Arrays.sort(stones);
            int i = n-1;

            if(i == 0 || stones[i-1] == 0){
                return stones[i];
            }
            stones[i-1] = stones[i] - stones[i-1];
            stones[i] = 0;
        }

    }
}