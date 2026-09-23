class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE; // We will not take 0 here, because the array can even have negative values so we use Integer.MIN_VALUE here in this case. 
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = nums[i] + sum;
            max = Math.max(max,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;

        
    }
}