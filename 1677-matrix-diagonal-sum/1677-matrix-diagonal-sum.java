class Solution {
    public int diagonalSum(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        int totalSum = sum1 + sum2;

        if(n % 2 == 1){
            totalSum -= arr[n/2][n/2];
        }

        return totalSum;
    }
}