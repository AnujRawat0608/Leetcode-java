class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        int vowels =0;
        int consonants = 0;

        if(n < 3){
            return false;
        }
        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        return vowels >= 1 && consonants >=1;
        
    }
}