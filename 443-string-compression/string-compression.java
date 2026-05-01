class Solution {
    public int compress(char[] chars) {

        int n = chars.length;

        int i = 0;
        int idx = 0;

        while(i < n){
            char curr = chars[i];
            int count = 0;
            while(i < n && curr == chars[i]){
                i++;
                count++;
            }
               chars[idx++] = curr; 

            if(count > 1){
                String strCount = Integer.toString(count);
                for(char ch: strCount.toCharArray()){
                    chars[idx++] = ch;
                }

            }
    }
            return idx;
    }
}