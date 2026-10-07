class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:target){
            list.add(i);

        }
        for(int i: arr){
            if(list.contains(i)){
                list.remove(Integer.valueOf(i));
            }
            else{
                return false;
            }
        }
        return list.isEmpty();
        
    }
}