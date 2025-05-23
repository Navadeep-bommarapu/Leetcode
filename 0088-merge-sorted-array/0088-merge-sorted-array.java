import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m, right = 0;
        while(left < nums1.length){
            if(right < n){
                nums1[left++] = nums2[right++];
            }
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}