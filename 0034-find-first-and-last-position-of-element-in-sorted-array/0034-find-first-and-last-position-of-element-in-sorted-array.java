class Solution {
    

    public int[] searchRange(int[] nums, int target) {

        
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int [] {first,last};
        
     }

        public int findFirst(int [] nums, int target){
            int n = nums.length;
            int first = -1;
            int st = 0;
            int end = n - 1;
            while(st<=end){
                int mid = st+ (end - st)/2;
                if(nums[mid] == target){
                    first = mid;
                    end = mid - 1;
                }
                else if(nums[mid]>target){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
                
            }
            return first;
            

        }
        public int findLast(int [] nums, int target){
            int n = nums.length;
            int st = 0;
            int end = n - 1;
            int last = -1;
            while(st<=end){
           
            
            int mid = st + (end -  st)/2;
            if(nums[mid] == target){
                last = mid;
                st = mid + 1; 
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        } 
            return last;
            
            
        }
        
  }
