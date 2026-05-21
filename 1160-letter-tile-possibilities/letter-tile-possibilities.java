class Solution {
    int total;
    private void findSequence(int[] count){
        total++;
        for(int pos =0; pos < 26; pos++){
            if(count[pos] == 0){
                continue;
            }
            count[pos] --;
            findSequence(count);
            count[pos]++;
        }
    }
    public int numTilePossibilities(String tiles) {
        total = 0;
        int[] count = new int[26];
        for(char c : tiles.toCharArray()){
            count[c - 'A']++;
        }
        findSequence(count);
        return  total -1;
        
    }
}