class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, l = 0;
        for(int r= 0 ; r<s.length(); r++){
            int ch = s.charAt(r)-'a';
            if(mp.containsKey(ch)){
                if(mp.get(ch)>=l) l = mp.get(ch)+1;
            }
            maxLen = Math.max(maxLen, r-l+1);
            mp.put(ch, r);
        }
        return maxLen;
    }
}
