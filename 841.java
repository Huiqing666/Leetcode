class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> connected = new HashSet<>();
        connected.add(0);
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rooms.get(0));
        while(!queue.isEmpty()) {
            List<Integer> curr = queue.poll();
            for(int i = 0; i < curr.size(); i++) {
                if(connected.contains(curr.get(i))) continue;
                else{
                    connected.add(curr.get(i));
                    queue.add(rooms.get(curr.get(i)));
                }
                
            }
        }
        if(connected.size() == rooms.size()) return true;
        return false;
        
    }
}
