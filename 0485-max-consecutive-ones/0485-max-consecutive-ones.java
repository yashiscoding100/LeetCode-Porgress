class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
       int n = nums.length;
       int c = 0;
       int ans = 0;
       for(int i = 0; i<n; i++){
        if(nums[i] == 1){
            c++;
            ans = Math.max(ans, c);
        }
        else{
            c = 0;
        }
       }
    return ans;
    } 
}     