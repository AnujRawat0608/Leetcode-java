class Solution {
    int n ;
    public int numTilePossibilities(String tiles) {
        n = tiles.length();
        boolean[] used = new boolean[n];
        StringBuilder curr = new StringBuilder();
        Set<String> result = new HashSet<>();
        solve(tiles,used,curr,result);
        return result.size() - 1;
    }
    public void solve(String tiles, boolean[] used, StringBuilder curr, Set<String> result){
        result.add(curr.toString());
        for(int i=0; i<n ; i++){
            if(used[i])continue;
            curr.append(tiles.charAt(i));
            used[i] = true;
            solve(tiles,used,curr,result);
            used[i] = false;
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}