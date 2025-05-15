class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] result = s.split("\\s+");
        int left = 0, right = result.length - 1;
        while(left < right){
            String temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            left++;
            right--;
        }
        String reversedArr = String.join(" ",result);

        return reversedArr;
    }
}
