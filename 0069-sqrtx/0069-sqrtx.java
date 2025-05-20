class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.floor(Math.sqrt(x));
        int intsqrt = (int) sqrt;
        return intsqrt;
    }
}