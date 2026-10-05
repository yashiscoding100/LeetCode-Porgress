class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
        if(map.containsKey(nums[i])){
            int val = map.get(nums[i]);
            map.put(nums[i], val+1);
        }
        else
        {
            map.put(nums[i],1);
        }
        }
        for(int i:nums){ 

        if(map.get(i)> n/2){
            return i;
        }
    } 
    return -1;
  }
}