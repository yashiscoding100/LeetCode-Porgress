class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int st = 0;
        int end = n - 1;
        while(st<end){
            if(numbers[st] + numbers[end] == target){
                return new int [] { st + 1, end + 1};
            }
                else if(target > numbers[st] + numbers[end]){
                    st++;
                }
                else{
                    end --;
                }
        } 
                return new int [] {-1,-1};

        
    }
}