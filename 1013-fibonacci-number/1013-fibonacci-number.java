class Solution {
    public int fib(int n) {
        int[] fac = new int[n+1];
        if(n == 0) return 0;
        if(n == 1) return 1;
        fac[0] = 0;
        fac[1] = 1;

        for(int i = 2; i <= n; i++){
            fac[i] = fac[i-1] + fac[i-2];
        }
        return fac[n];
    }
}