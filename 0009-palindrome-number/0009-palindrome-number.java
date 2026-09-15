class Solution {
    public boolean isPalindrome(int x) {
        String  s = x + " ";
        int n = s.length();
        int st = 0; 
        int end = n - 2;
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            else{
                st++;
                end--;
            }


        }
        return true;

        
    }
}