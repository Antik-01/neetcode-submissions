class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0, len = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(r<s.length()){
            int ch = s.charAt(r)-'a';
            if(mp.containsKey(ch)){
                if(mp.get(ch) >= l) l = mp.get(ch)+1;
            }
            len = Math.max(len, r-l+1);
            mp.put(ch, r);
            r++;
        }
        return len;
    }
}
