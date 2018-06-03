class Solution {
    public boolean validWordSquare(List<String> words) {
         for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (i >= words.size() || 
                    j >= words.size() || 
                    i >= words.get(j).length() || 
                    j >= words.get(i).length() ||
                    words.get(i).charAt(j) != words.get(j).charAt(i)) return false;
            }
        }
        
        return true;      
    }
}
