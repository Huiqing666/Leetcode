class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(new ArrayList<Integer>(), list, graph, 0);
        return list;
    }
    private void backtrack(List<Integer> temp, List<List<Integer>> list, int[][] graph, int index) {
        if (index == 0) temp.add(0);
        if (index == graph.length - 1) {
            //temp.add(index);
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < graph[index].length; i++) {
            if (temp.contains(graph[index][i])) return;
            temp.add(graph[index][i]);
            backtrack(temp, list, graph, graph[index][i]);
            temp.remove(temp.size() - 1);
        }
        
    }
}
