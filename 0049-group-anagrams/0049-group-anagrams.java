class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch); //taaki saare ek jaise dikhne lage
            // Now convert that individual element of that array back to the string
            String ss = new String(ch);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            // Now we get the value of value of ss key and then add it to the list so map.get(ss) will get us the value, and after that we will put it in the list
            map.get(ss).add(s);

        }
        return new ArrayList<>(map.values());

        
    }
}