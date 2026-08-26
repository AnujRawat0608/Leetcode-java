class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int left = 0;
        int ones = 0;

        int bestLength = Integer.MAX_VALUE;
        String answer = "";

        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '1'){
                ones++;
            }

                while(ones > k){
                    if(s.charAt(left) == '1'){
                        ones--;
                    }
                    left ++;

                }
                while(ones == k && s.charAt(left) == '0'){
                    left++;
                }
                if(ones == k){
                    int len = right - left + 1;
                    String current = s.substring(left,right + 1);

                    if(len < bestLength){
                        bestLength = len;
                        answer = current;
                    }
                    else if(len == bestLength && current.compareTo(answer) < 0){
                        answer = current;
                    }
                }
            }
            return answer;
        }
    }
