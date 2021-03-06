class Solution {
    private boolean[][] visited;
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(result.contains(words[i])) continue;
            visited = new boolean[board.length][board[0].length];
            
            if(exist(board, words[i])) result.add(words[i]);
        }
        return result;
        
    }
    
    private boolean exist(char[][] board, String word) {
        char[] letters = word.toCharArray();
        //visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(helper(board, letters, 0, i, j)) return true;
            }
        }
        return false;
        
        
    }
    private boolean helper(char[][] board, char[] letters, int index, int row, int column) {
        if(index == letters.length) return true;
        if(row < 0 || column < 0 || row >= board.length || column >= board[0].length || visited[row][column]) {
            return false;
        }
        if(board[row][column] != letters[index]) return false;
        visited[row][column] = true;
        //System.out.println(letters[index] + "  " + visited[row][column]);
        boolean exist = helper(board, letters, index + 1, row+1, column) ||
                 helper(board, letters, index + 1, row-1, column) ||
                    helper(board, letters, index + 1, row, column+1) ||
                      helper(board, letters, index + 1, row, column-1);
        visited[row][column] = false;
        return exist;
    }
}
