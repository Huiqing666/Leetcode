class TopVotedCandidate {
    HashMap<Integer, Integer> votes; // person, vote
    int maxVote;
    int candidate;
    TreeMap<Integer, Integer> result; //time, candidate
    public TopVotedCandidate(int[] persons, int[] times) {
        votes = new HashMap<>();
        result = new TreeMap<>();
        maxVote = 0;
        for (int i = 0; i < times.length; i++) {
            int vote = votes.getOrDefault(persons[i], 0);
            vote++;
            if (vote >= maxVote) {
                result.put(times[i], persons[i]);
                maxVote = vote;
            }
            else {
                int floor = result.floorKey(times[i]);
                result.put(times[i], result.get(floor));
            }
            votes.put(persons[i], vote);
        }
        
    }
    
    public int q(int t) {
        if (result.containsKey(t)) return result.get(t);
        int floor = result.floorKey(t);
        return result.get(floor);
        
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
