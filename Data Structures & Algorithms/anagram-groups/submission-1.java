class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagrams = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){   // 
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        } 
        return new ArrayList<>(anagrams.values());
        // List<List<String>> res = new ArrayList<>();
        // Map<String,List<String>> anagrams = new HashMap<>();
        // for(String str: strs){
        //     char[] curr = str.toCharArray();
        //     Arrays.sort(curr);
        //     String sorted = new String(curr);
        //     anagrams.putIfAbsent(sorted, new ArrayList<>());
        //     anagrams.get(sorted).add(str);
        // }
        // for(String key : anagrams.keySet()){  //O(m*nlogn) where m= len(strs) n=avgLen(str)
        //     res.add(anagrams.get(key));
        // }
        // return res;
    }
}
