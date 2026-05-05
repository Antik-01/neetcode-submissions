class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>(nums.length+1);
        for(int i=0; i<=nums.length; i++){
            freq.add(null);
        }
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n, 0)+1);
        }
        for(int key : mp.keySet()){
            int cnt = mp.get(key);
            if(freq.get(cnt)==null){
                freq.set(cnt, new ArrayList<>());
            }
            freq.get(cnt).add(key);
        }
        int[] res = new int[k];
        int j=0;
        for(int i=freq.size()-1; i>=0; i--){
            if(freq.get(i)!=null){
                for(int n: freq.get(i)){
                    if(j<k){
                        res[j++] = n;
                    }
                }
            }
        }
        return res;
    }
}
