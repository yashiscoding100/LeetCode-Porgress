class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i = 0;
        int j = n - 1;
        while(i<j){
            while(i<j && !"aeiouAEIOU".contains(ch[i] + "")){
                i++;
            }
            while(i<j && !"aeiouAEIOU".contains(ch[j] + "")){
                j--;
            }
            char l = ch[i];
            ch[i] = ch[j];
            ch[j] = l;
            i++;
            j--;

        }
        return new String(ch);
        
    }
}