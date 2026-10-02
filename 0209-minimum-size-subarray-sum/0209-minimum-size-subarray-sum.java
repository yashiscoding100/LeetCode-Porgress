class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int right = 0;
        int left = 0;
        int window = 0;
        int ans = n + 1;
        while(right<nums.length){
            window += nums[right];
            while(window>=target){
                ans = Math.min(ans,right - left + 1);
                window -= nums[left++];
            }
            right++;
        }
        return ans == n + 1? 0:ans;
        
    }
    
}