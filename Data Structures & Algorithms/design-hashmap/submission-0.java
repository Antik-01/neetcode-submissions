class MyHashMap {
    class Node{
        int key;
        int value;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    List<Node> table;

    public MyHashMap() {
        this.table = new ArrayList<>();
    }
    
    public void put(int k, int val) {
        for(int i=0; i<table.size(); i++){
            if(this.table.get(i).key==k){
                remove(k);
            }
        }
        Node node = new Node(k, val);
        table.add(node);
    }
    
    public int get(int k) {
        for(int i=0; i<table.size(); i++){
            if(this.table.get(i).key==k){
                return this.table.get(i).value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0; i<table.size(); i++){
            if(this.table.get(i).key==key){
                this.table.remove(table.get(i));
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */