class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == nums[nums.length/2]){
                count = count + 1;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}