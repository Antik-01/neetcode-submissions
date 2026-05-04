class MyHashSet {
    int[] arr;
    int length;
    public MyHashSet() {
        this.arr = new int[0];
        this.length = 0;
    }
    
    public void add(int key) {
        if(!contains(key)){
            int[] newArr = new int[length+1];
            for(int i=0; i<length; i++){
                newArr[i] = arr[i];
            }
            length++;
            newArr[length-1] = key;
            arr = new int[length];
            for(int i=0; i<length; i++){
                arr[i] = newArr[i];
            }
        }
    }
    
    public void remove(int key) {
        if(contains(key)){
            int[] newArr = new int[length-1];
            int i =0;
            length--;
            while(i<length){
                for(int n: arr){
                    if(n==key) continue;
                    else{
                        newArr[i++] = n;
                    }
                }
            }
            arr = new int[length];
            for(i=0; i<length; i++){
                arr[i] = newArr[i];
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<length; i++){
            if(arr[i]==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */