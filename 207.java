class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] nodes = new ArrayList[numCourses];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new ArrayList<Integer>();
        }
        for (int[] edge : prerequisites) {
            nodes[edge[0]].add(edge[1]);
        }
        int[] visit = new int[numCourses];
        for (int i = 0; i < nodes.length; i++) {
            if (helper(nodes, visit, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(ArrayList<Integer>[] nodes, int[] visit, int index) {
        // 1 is visiting 
        // 2 is visited
        // 0 is unvisited
        if (visit[index] == 1) {
            return true;
        }
        if (visit[index] == 2) {
            return false;
        }
        visit[index] = 1;
        for (int nei : nodes[index]) {
            if (helper(nodes, visit, nei)) {
                return true;
            }
        }
        visit[index] = 2;
        return false;
    }
}
/*class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList();
        }
        for(int i = 0; i < prerequisites.length; i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        boolean[] visited = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(!dfs(graph, visited, i))
                return false;
        }
        return true;
    }
    private boolean dfs(ArrayList[] graph, boolean[] visited, int course){
        if(visited[course])
            return false;
        visited[course] = true;
        for(int i = 0; i < graph[course].size(); i++){
            if(!dfs(graph, visited, (int) graph[course].get(i)))
                return false;
        }
        visited[course] = false;
        return true;

    
    
    }
}
*/
