class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> appeared = new HashSet<>();

        for(int num: nums){
            appeared.add(num);
        }

        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!appeared.contains(i)){
                missing.add(i);
            }
        }

        return missing;
    }
}