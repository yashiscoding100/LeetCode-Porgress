class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int window = 0;
        for(int i = 0; i<k; i++){
            window += nums[i];
        }
        int left = 0;
        int right = k;
        int ans = window;
        while(right<n){
            window+= nums[right];
            window -= nums[left];
            right++;
            left++;
            ans = Math.max(window,ans);
        }
        return (double) ans/k;
        
    }
}