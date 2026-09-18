class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //We will use sliding window in  this
        int n = nums.length;
        int windows = 0;
        int ans = 0;
        //Step 1: Print the sum of first k size elements
        for(int i = 0; i<k; i++){
            windows += nums[i];
        }
        ans = windows;
        // Now use the two pointer approach 
        int left = 0;
        int right = k;
        while(right < n){
           windows += nums[right];
           windows -= nums[left];
           right++;
           left++;
           
           ans = Math.max(windows,ans);
        }
        return (double) ans / k;
        
        
    }
}