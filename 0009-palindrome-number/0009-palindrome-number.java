class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        int n = s.length();
        int st = 0;
        int end = n - 1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            
            st++;
            end--;
            
            
        
        
        }
        return true;
        


        
       
        
    }
}