class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        
        int left = 0;
        int right = n-1;



        while(left != right && left < right){
            char temp = s[left];
            s[left] = s[right] ;
            s[right] = temp;

            left ++;
            right--;

        }

        
    }
}
/*
h e l a l o 
left = h -> o
right = o -> h


left = e -> l
right = l -> e

left = l
right = l 
while( left != right && when left < right){
char tem 
}



*/