class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> anagrams = new HashMap<>();
        for(String str: strs){
            char[] curr = str.toCharArray();
            Arrays.sort(curr);
            String sorted = new String(curr);
            anagrams.putIfAbsent(sorted, new ArrayList<>());
            anagrams.get(sorted).add(str);
        }
        for(String key : anagrams.keySet()){
            res.add(anagrams.get(key));
        }
        return res;
    }
}
