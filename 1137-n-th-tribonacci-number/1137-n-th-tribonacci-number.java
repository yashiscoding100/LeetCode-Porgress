class Solution {
    public int tribonacci(int n) {
        int st = 0;
        int sec = 1;
        int thr = 1;
        int sum = 0;
        if(n == 0){
            return st;
        }
        if(n == 1){
            return sec;
        }
        if(n == 2){
            return thr;
        }
        for(int i = 3; i<=n; i++){
            sum = st + sec + thr;
            st = sec;
            sec = thr;
            thr = sum;
        }
        return sum;
        
    }
}