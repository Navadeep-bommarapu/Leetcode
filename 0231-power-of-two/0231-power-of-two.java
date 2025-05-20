class Solution {
    public boolean isPowerOfTwo(int n) {
        double pow = 0;
        for(int i = 0; i <= 31; i++){
            pow = Math.pow(2,i);
            if(pow == n){
                return true;
            }
        }
        return false;
    }
}