class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int window = 0;
        int left = 0;
        int right = k;
        
        //Take the sum of the first k sized fixed window first
        for(int i = 0; i<k; i++){
            window += nums[i];
        }
        int ans = window;
        while(right<n){
            window += nums[right++];
            window-= nums[left++];
            ans = Math.max(ans,window);
            
        }
        return (double) ans/k;

        
    }
}