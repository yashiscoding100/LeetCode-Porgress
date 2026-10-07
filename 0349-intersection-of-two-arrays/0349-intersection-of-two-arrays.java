class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int n = set2.size();
        int [] arr = new int[n];
        int i = 0;
        for(int ele:set2){
            arr[i++] = ele;
        }
        return arr;
    }
}