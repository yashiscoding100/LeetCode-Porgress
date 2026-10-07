class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n =nums.length;
        Arrays.sort(nums);
        // Now we are applying binary search
        for(int i = 0; i< n - 2; i++){
            int st = i + 1;
            int end = n - 1;
            while(st<end){
            int sum = nums[i] + nums[st] + nums[end];
            if(sum == 0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[st]);
                list.add(nums[end]);
                result.add(list);
                st++;
                end--;
            }
            else if(sum>0){
                end--;
            }
            else
            {
                st++;
            }
        }
            
    }
        return new ArrayList<>(result);
        
    }
}