class Solution {
    public String removeDigit(String number, char digit) {

        int toRemove = -1;

        for(int i=0; i< number.length();i++){
            if(number.charAt(i) == digit){
                toRemove =i;
                if(i+1 < number.length() && number.charAt(i+1) > digit){
                    break;
                }
            }
        }

        return number.substring(0, toRemove) + number.substring(toRemove + 1, number.length());

    }
}