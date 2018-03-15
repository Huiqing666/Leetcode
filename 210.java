class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList();
        }
        int[] visited = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            visited[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++){
            if(visited[i] == 0){
                queue.add(i);
            }
        }
        int[] res = new int[numCourses];
        int i = 0;
        while(queue.size() != 0){
            res[i] = queue.poll();
            //System.out.println(graph[res[i]].size());
            for(int j = 0; j < graph[res[i]].size(); j++){
                int w = (int)graph[res[i]].get(j);
                visited[w]--;
                if(visited[w] == 0){
                    queue.add(w);
                }
            }
            i++; 
        }
        return numCourses == i ? res : new int[0];
    }
}
