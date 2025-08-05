class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length,alloted=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    alloted++;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        return n - alloted;
    }
}

/* Given - fruits [] baskets[]
fruits[i] = the Quantity of fruit
basket[j] =  the Capacity of basket 

fruits [4,2,5]
baskets= [3,5,4]

4 cannot be placed in basket 3 so move forward 
so 4 is placed in basket 5
4->5

2->3, 
1.check if the fruits is greater then baket if yes basket++
2.if the basket >= fruit then we can add the fruit in basket
3.in the next iteration check from the left most basket again
4.and return the number of fruit that cant be placed in the basket
 



 */