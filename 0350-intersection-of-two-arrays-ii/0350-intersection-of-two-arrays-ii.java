class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i:nums1){
            list1.add(i);
        }
        for(int i:nums2){
            if(list1.contains(i)){
                list2.add(i);
                list1.remove(Integer.valueOf(i));
            }
        }
        int n = list2.size();
        int [] arr = new int[n];
        int i = 0;
        for(int j: list2){
            arr[i++] = j;
        }
        return arr;

        
    }
}