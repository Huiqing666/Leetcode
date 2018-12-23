class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for(String s: path.split("/")){
            if(!stack.isEmpty() && s.equals("..")) stack.pop();
            else if(!s.equals("..") && !s.equals("") && !s.equals(".")) stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) return "/";
        for(Iterator<String> it = stack.descendingIterator();it.hasNext();)sb.append("/").append(it.next());
        return sb.toString();
    }
}
