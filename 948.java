class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        if (tokens.length == 0) return 0;
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        int res = 0;
        int points = 0;
        while (i <= j) {
            if (P - tokens[i] >= 0) {
                points++;
                P = P - tokens[i];
                i++;
                res = Math.max(res, points);
            }
            else if (points > 0) {
                P = P + tokens[j--];
                points--;
            }
            else{
                break;
            }
        }
        return res;
    }
}
