class Solution {
    public String processStr(String s) {
    StringBuilder result =  new StringBuilder();

    for(int i=0; i<s.length(); i++){
    
    char ch = s.charAt(i);
    if(ch >= 'a' && ch <= 'z'){
        result.append(ch);
    }
    else if(result.length() > 0 && ch == '*'){
        result.deleteCharAt(result.length() -1);
    }
    else if(result.length() > 0 && ch == '#'){
        String current = result.toString();
        result.append(current);
    }
    else if(result.length() > 0 && ch == '%'){
        result.reverse();
    }
 }
 return result.toString();

    }
}