class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            result[i] = nums[i] * nums[i];
        }

        for(int i = 0; i < result.length; i++){
            int pos = i;
            for(int j = i+1; j < result.length; j++){
                if(result[pos] > result[j]){
                    pos = j;
                }
            }
            int temp = result[pos];
            result[pos] = result[i];
            result[i] = temp;
        }


        return result;
    }
}