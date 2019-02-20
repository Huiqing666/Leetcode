class LRUCache {
    class Node {
        int key;
        int value;
        Node pre, next;
        Node(){}
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    void addNode(Node node) {
        node.pre = head;
        node.next = head.next;
        
        head.next.pre = node;
        head.next = node;

    }
    void removeNode(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }
    void moveToHead(Node node) {
        this.removeNode(node);
        this.addNode(node);
    }
    Node popTail(){
        Node res = tail.pre;
        this.removeNode(res);
        return res;
    }
    private HashMap<Integer, Node> map;
    private int size;
    private Node head, tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = capacity;

        head = new Node();
        //head.pre = null;

        tail = new Node();
        //tail.post = null;

        head.next = tail;
        tail.pre = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        // make it as head
        this.moveToHead(map.get(key));
        return map.get(key).value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node curr = map.get(key);
            curr.value = value;
            // make it as head
            this.moveToHead(curr);
            return;
        }
        else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            this.addNode(newNode);
            if (map.size() > size) {
                Node pop = this.popTail();
                map.remove(pop.key);
            }
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
