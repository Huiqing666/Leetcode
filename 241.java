class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        for (int k = 0; k < input.length(); k++) {
            char c = input.charAt(k);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, k));
                List<Integer> right = diffWaysToCompute(input.substring(k+1));
                for (int i : left) {
                    for (int j : right) {
                        switch(c) {
                            case '+' : res.add(i + j); break;
                            case '-' : res.add(i - j); break;
                            case '*' : res.add(i * j); break;                        
                        }
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}
