import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                arr.add(i);
            }
        }
        return arr;
    }
}