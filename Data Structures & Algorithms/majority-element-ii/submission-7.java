class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> count = new HashMap<>();  // extra Memory sc: O(n)
        // List<Integer> res = new ArrayList<>();
        // for(int n: nums){
        //     count.put(n, count.getOrDefault(n, 0)+1);
        // }
        // for(int k : count.keySet()){
        //     if(count.get(k)>(nums.length/3)){
        //         res.add(k);
        //     }
        // }
        // return res;



        List<Integer> res = new ArrayList<>();
        int c1 = 0, c2 =0, cn1 = 0, cn2 = 0, n = nums.length;
        for (int num : nums) {
            if(num == c1)cn1++;
            else if(num == c2) cn2++;
            else if(cn1==0){
                c1 = num;
                cn1++;
            }
            else if(cn2==0){
                c2 = num;
                cn2++;
            }
            else {
                cn1--;
                cn2--;    
            }
        }
        cn1 = cn2 = 0;
        for(int num: nums){
            if(num== c1) cn1++;
            else if(num==c2) cn2++;
        }
        if(cn1>n/3) res.add(c1);
        if(cn2>n/3) res.add(c2);
        return res;
    }
}