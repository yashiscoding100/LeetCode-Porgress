class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int window = 0;
        int ans = 0;
        while(right< n){
            window += nums[right];
            while(window + 1< right - left + 1){
                window -=  nums[left++];
                
            }
            
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans - 1;
        
    }
}