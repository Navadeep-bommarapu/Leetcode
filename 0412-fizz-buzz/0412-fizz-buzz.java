class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i  % 3 == 0 && i % 5 == 0){
                arr.add("FizzBuzz");
            }else if(i % 5 == 0){
                arr.add("Buzz");
            }else if(i % 3 == 0){
                arr.add("Fizz");
            }else{
                String str = String.valueOf(i);
                arr.add(str);
            }
        }
        return arr;
    }
}