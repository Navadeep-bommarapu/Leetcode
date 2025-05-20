
class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt = Math.floor(Math.sqrt(num));
        if(sqrt * sqrt == num){
            return true;
        }else{
            return false;
        }
    }
}