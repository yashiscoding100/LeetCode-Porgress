class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int window = 0;
        int right = 0;
        int left = 0;
        int ans = n + 1;
        while(right<n){
            window += nums[right];
            while(window>=target){
                ans = Math.min(ans,right-left + 1);
                window -= nums[left];
                left++;
            }
            right++;

            
        }
        return ans == n + 1? 0:ans;
    }
}