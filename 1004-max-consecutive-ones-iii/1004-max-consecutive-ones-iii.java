class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int window = 0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            window += nums[right];
            while(window + k< right - left + 1){
                window -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
            
        }
        return ans;
        
    }
}