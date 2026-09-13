class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int [] ans = {-1,-1};
        int st = 0;
        int end = n - 1;
        while(st<end){
            int sum = numbers[st] + numbers[end];
            if(sum == target){
                ans[0] = st + 1;
                ans[1] = end + 1;
                break;
            }
            else if(sum<target){
                st++;
                
            }
            else{
                end--;
            }
        }
        return ans;
    }
}