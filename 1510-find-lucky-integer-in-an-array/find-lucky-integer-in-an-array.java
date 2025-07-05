class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int cnt = 1, num = arr[0];
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                cnt++;
            } else {
                if (num == cnt) {
                    ans = num;
                }
                num = arr[i];
                cnt = 1;
            }
        }

        // Final check for the last element
        if (arr[arr.length - 1] == cnt) {
            ans = arr[arr.length - 1];
        }

        return ans;
    }
}