class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
        if(map.containsKey(nums[i])){
           int val = map.get(nums[i]);
           map.put(nums[i],val + 1);

        }
        else{
            map.put(nums[i],1);
        }
    } 
    for(int i: map.keySet()){
           if(map.get(i) > n / 3){
               list.add(i);

           }
    }
    
    return list;
    }
}