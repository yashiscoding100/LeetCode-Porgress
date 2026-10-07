class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Arrays.sort(arr1);
        
        for(int i:arr2){
            list1.add(i);
        }
        for(int i:list1){
            for(int j:arr1){
                if(i == j){
                    list2.add(j);
                }
            }
            
        }
        for(int i:arr1){
            if(!list1.contains(i)){
                list3.add(i);
            }
        }
        int n = arr1.length;
        int j = 0;
        for(int i:list2){
            arr1[j++] = i;
        }
        int k = j;
        for(int i:list3){
            arr1[k++] = i;

        }
        return arr1;

        
        
    }
}