class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            res.add(Integer.toString(i)) ;
            if(i % 3 == 0){
                res.set(i-1, "Fizz");
            }
            if(i % 5 == 0){
                res.set(i-1, "Buzz");
                if(i % 3 == 0) res.set(i-1, "FizzBuzz");
            }
            
        }
        return res;
    }
}
