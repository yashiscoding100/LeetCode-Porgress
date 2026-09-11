//In this question we are taking index as the value
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i],i);
                       

        }
             for(int i = 0; i<n; i++){
             int val = target - nums[i];
             if(map.containsKey(val) && i!= map.get(val)){
                // Use i for the current element's index because map.get(nums[i]) may give the wrong index when duplicate values exist.

                return new int[] {i, map.get(val)};

            }
               
            
        }
        return new int [] {-1,-1};
        }
}