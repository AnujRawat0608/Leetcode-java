class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[] mergedArr = new int[m+n];

        int i = 0; 
        int j = 0; 
        int k = 0;

        while (i < m && j < n){
            if(nums1[i] < nums2[j]){
                mergedArr[k++] = nums1[i++];
            }else{
                mergedArr[k++] = nums2[j++];
            }
        }
        while(i<m){
            mergedArr[k++] = nums1[i++];
        }
        while(j<n){
            mergedArr[k++] = nums2[j++];
        }
        int totalLength = m + n;
        if(totalLength % 2 == 0){
            return(mergedArr[totalLength / 2 -1] + mergedArr[totalLength / 2]) / 2.0;
        }else{
            return mergedArr[totalLength / 2];
        }

    }
}